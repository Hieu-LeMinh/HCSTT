package main;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import database.Insert_to_database;
import database.Query_to_database;
import generate_data.Create_data_random;
import model.Patient_Diagnoses;
import model.PictureFuzzyRelation;
import utilities.MedicalDiagnosisCalculationsImpl;
import utilities.My_round;

public class TestMedicalDiagnoses_database_create_pNd {

	public static void main(String[] args) throws SQLException {
		// Khai bao 3 mang dung trong chuong trinh

		ArrayList<ArrayList<PictureFuzzyRelation>> pNs;

		ArrayList<ArrayList<PictureFuzzyRelation>> sNd;

		ArrayList<ArrayList<Float>> pNd = new ArrayList<ArrayList<Float>>();

		// lay du lieu tu co so du lieu cho bang pNs
		Query_to_database que1 = new Query_to_database();
		pNs = que1.get_data_patient_RF_symptoms();
		sNd = que1.get_data_symptoms_FR_diagnoses();

		

		
		
		// dua vao danh sach cac benh
		ArrayList<String> list_diagnoses = new ArrayList<String>();
		list_diagnoses.add("Fever");
		list_diagnoses.add("Malaria");
		list_diagnoses.add("Typhoid");
		list_diagnoses.add("Stomach");
		list_diagnoses.add("Chest_problem");
		ArrayList<String> list_patients = que1.get_list_patients_of_patient_RF_symptoms();
		for (int i = 0; i < list_diagnoses.size(); i++) {
			System.out.printf("  %-9s", list_diagnoses.get(i));
		}
		System.out.println();


		
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
	    Create_data_random cdr = new Create_data_random();
	    Random rd = new Random();
	    try {
			cdr.create_list_names_id_DoctorID();
			cdr.create_list_img();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    ArrayList<String> list_id = que1.get_ID_of_patient_RF_symptoms();
	    ArrayList<String> list_img = cdr.list_img;
	    for(int i=0; i<list_patients.size(); i++) {
	    	System.out.println(list_patients.size());
	    	Patient_Diagnoses pd = new Patient_Diagnoses(list_id.get(i),list_patients.get(i), 
	        		round.myRound(pNd.get(i).get(0), 3),  round.myRound(pNd.get(i).get(1), 3),  round.myRound(pNd.get(i).get(2), 3), 
	        		round.myRound(pNd.get(i).get(3), 3),  round.myRound(pNd.get(i).get(4), 3),  list_img.get(rd.nextInt(list_img.size())));
	        Insert_to_database insDB = new Insert_to_database();
	        System.out.println(insDB.insert_to_Result_Diagnoses(pd));
	    }   

		
		
	}

}
