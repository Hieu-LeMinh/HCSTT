
package main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import database.Insert_to_database;
import database.Query_to_database;
import model.Patient_Diagnoses;
import model.PictureFuzzyRelation;
import utilities.MedicalDiagnosisCalculationsImpl;
import utilities.My_round;

public class TestMedicaIDiagnosis_file {

	public ArrayList<String> chuandoan(String ID, String name,float pos1, float neu1, float nav1, 
			float pos2, float neu2, float nav2, 
			float pos3, float neu3, float nav3, 
			float pos4, float neu4, float nav4, 
			float pos5, float neu5, float nav5)
			throws Exception {

		// lay du lieu bang sNd tu tren co so du lieu
		Query_to_database que = new Query_to_database();

		// Khai bao 3 mang dung trong chuong trinh
		ArrayList<ArrayList<PictureFuzzyRelation>> pNs = new ArrayList<ArrayList<PictureFuzzyRelation>>();

		ArrayList<ArrayList<PictureFuzzyRelation>> sNd = que.get_data_symptoms_FR_diagnoses();

		ArrayList<ArrayList<Float>> pNd = new ArrayList<ArrayList<Float>>();
		
		ArrayList<String> list_diagnoses_result = new ArrayList<String>();

		pNs.add(new ArrayList<PictureFuzzyRelation>());
		pNs.get(0).add(new PictureFuzzyRelation(pos1, neu1, nav1));
		pNs.get(0).add(new PictureFuzzyRelation(pos2, neu2, nav2));
		pNs.get(0).add(new PictureFuzzyRelation(pos3, neu3, nav3));
		pNs.get(0).add(new PictureFuzzyRelation(pos4, neu4, nav4));
		pNs.get(0).add(new PictureFuzzyRelation(pos5, neu5, nav5));

		// lay vao danh sach cac trieu chung va cac chan doan co the
		ArrayList<String> list_symptoms = new ArrayList<String>();
		list_symptoms.add("temperature");
		list_symptoms.add("headache");
		list_symptoms.add("Stomach_pain");
		list_symptoms.add("Cough");
		list_symptoms.add("Chest_pain");

		ArrayList<String> list_diagnoses = new ArrayList<String>();
		list_diagnoses.add("Fever");
		list_diagnoses.add("Malaria");
		list_diagnoses.add("Typhoid");
		list_diagnoses.add("Stomach");
		list_diagnoses.add("Chest_problem");

		for (int i = 0; i < list_diagnoses.size(); i++) {
			System.out.printf("    %-7s", list_diagnoses.get(i));
		}
		System.out.println();
//Do Picture Fuzzy Relation
		MedicalDiagnosisCalculationsImpl calculations = new MedicalDiagnosisCalculationsImpl();
		for (int i = 0; i < pNs.size(); i++) {
			pNd.add(new ArrayList<Float>());
			for (int k = 0; k < sNd.get(0).size(); k++) {
				
					pNd.get(i).add(calculations.calS(
							calculations.calDoPositiveM(pNs, sNd, i, k, pNs.get(0).size()),
							calculations.calDoNeutralM(pNs, sNd, i, k, pNs.get(0).size()),
							calculations.calDoNegativeM(pNs, sNd, i, k, pNs.get(0).size())));
				
				

				System.out.printf("  %-10.3f", pNd.get(i).get(k));
			}
			System.out.println();
		}
		String benh = "";
		System.out.println("\n============ Ket Qua Chan Doan: =============");
		for (int i = 0; i < pNs.size(); i++) {
			for (int k = 0; k < sNd.get(0).size(); k++) {
				if (pNd.get(i).get(k) > 0.5) {
					System.out.print(" " + list_diagnoses.get(k) + " ");
					benh = benh + list_diagnoses.get(k) + "(" + String.valueOf(100 * pNd.get(i).get(k) + "%)\n");
					list_diagnoses_result.add(list_diagnoses.get(k));
				}
			}
			System.out.println();
		}  
		if(benh.equals("")) {
			list_diagnoses_result.add("\n\n Khong co benh");
			return list_diagnoses_result;
		}else {
			list_diagnoses_result.add(benh);
			return list_diagnoses_result;
		}
    	
	}
	
	public boolean store_result_diagnoses(String ID, String name,float pos1, float neu1, float nav1, 
			float pos2, float neu2, float nav2, 
			float pos3, float neu3, float nav3, 
			float pos4, float neu4, float nav4, 
			float pos5, float neu5, float nav5, String image_name) {
		
		// dua gia tri vao bang pNd
		Query_to_database que = new Query_to_database();

		// Khai bao 3 mang dung trong chuong trinh
		ArrayList<ArrayList<PictureFuzzyRelation>> pNs = new ArrayList<ArrayList<PictureFuzzyRelation>>();

		ArrayList<ArrayList<PictureFuzzyRelation>> sNd = que.get_data_symptoms_FR_diagnoses();

		ArrayList<ArrayList<Float>> pNd = new ArrayList<ArrayList<Float>>();

		pNs.add(new ArrayList<PictureFuzzyRelation>());
		pNs.get(0).add(new PictureFuzzyRelation(pos1, neu1, nav1));
		pNs.get(0).add(new PictureFuzzyRelation(pos2, neu2, nav2));
		pNs.get(0).add(new PictureFuzzyRelation(pos3, neu3, nav3));
		pNs.get(0).add(new PictureFuzzyRelation(pos4, neu4, nav4));
		pNs.get(0).add(new PictureFuzzyRelation(pos5, neu5, nav5));

		// Do Picture Fuzzy Relation
		MedicalDiagnosisCalculationsImpl calculations = new MedicalDiagnosisCalculationsImpl();
		for (int i = 0; i < pNs.size(); i++) {
			pNd.add(new ArrayList<Float>());
			for (int k = 0; k < sNd.get(0).size(); k++) {
				
					pNd.get(i).add(calculations.calS(
							calculations.calDoPositiveM(pNs, sNd, i, k, pNs.get(0).size()),
							calculations.calDoNeutralM(pNs, sNd, i, k, pNs.get(0).size()),
							calculations.calDoNegativeM(pNs, sNd, i, k, pNs.get(0).size())));
				
			}
		}
		
		// dua ket qua tinh toan duoc vao co so du lieu
		My_round round = new My_round();

		Patient_Diagnoses pd = new Patient_Diagnoses(ID, name, round.myRound(pNd.get(0).get(0), 3),
				round.myRound(pNd.get(0).get(1), 3), round.myRound(pNd.get(0).get(2), 3),
				round.myRound(pNd.get(0).get(3), 3), round.myRound(pNd.get(0).get(4), 3),image_name);
		Insert_to_database insDB = new Insert_to_database();
		return insDB.insert_to_Result_Diagnoses(pd);
		
	}
	
	public float exactly_diagnoses() {
		Query_to_database que = new  Query_to_database();
		ArrayList<ArrayList<Float>> pNd = que.get_data_patient_RF_diagnoses();
		ArrayList<ArrayList<String>> pNs_suffer = que.get_data_suffer_patient_RF_symptoms();
		float exac_diag = 0.0f; // so truong hop dung
		int not_diag = 0;		// so truong hop chua co chan doan
		for(int i=0; i<pNd.size(); i++) {
			for(int j=0; j<pNd.get(0).size(); j++) {
				if(pNs_suffer.get(i).get(j) == null) {
					not_diag++;

				}else {
					if((pNs_suffer.get(i).get(j).equals("yes") && pNd.get(i).get(j) > 0.5) || 
						(pNs_suffer.get(i).get(j).equals("no") && pNd.get(i).get(j) < 0.5)) {
						exac_diag++;
					}
				}
			}
		}
		for(int i=0; i<pNd.size(); i++) {
			for(int j=0; j<pNd.get(0).size(); j++) {
				System.out.print(pNs_suffer.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
		return 100*(exac_diag / ( (pNd.size() * pNd.get(0).size() - not_diag)) );
	}
	
	public ArrayList<String> return_infor_result_diagnoses(String ID, String name) {
		Query_to_database que = new Query_to_database();
		// chi lay so lieu cua bang pNs
		ArrayList<ArrayList<Float>> pNd = que.get_data_patient_RF_diagnoses();
		
		// Lay tat ca du lieu cua bang bao gom ID, Name
		ArrayList<ArrayList<String>> infor = que.get_all_data_patient_RF_diagnoses();
		
		ArrayList<String> list_diagnoses = new ArrayList<String>();
		list_diagnoses.add("Fever");
		list_diagnoses.add("Malaria");
		list_diagnoses.add("Typhoid");
		list_diagnoses.add("Stomach");
		list_diagnoses.add("Chest_problem");
		
		ArrayList<String> result = new ArrayList<String>();
		My_round rd = new My_round();

		for(int i=0; i<infor.size(); i++) {
			if(infor.get(i).get(0).equals(ID) && infor.get(i).get(1).equals(name)) {
				for(int j=0; j< pNd.get(0).size(); j++) {
					if(pNd.get(i).get(j) > 0.5) {
						
						result.add(list_diagnoses.get(j) + "(" + (rd.myRound(100*pNd.get(i).get(j), 2)) + "%)");
						
					}
				}
				result.add(infor.get(i).get(2));
			}
		}		
		System.out.println("hahah");		
		return result;			
	}
	
	// lay thong tin cua mot bac si khi biet ID cua mot benh nhan ID ->DoctorID
	public ArrayList<String> return_infor_doctor(String patientID){
		Query_to_database que = new Query_to_database();
		String doctorID = que.get_doctorID(patientID);
		return que.get_doctor_information(doctorID);
	}
}
