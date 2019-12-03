package main;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import database.Insert_to_database;
import database.Query_to_database;
import generate_data.Create_data_random;
import generate_data.Create_suffer_random;
import model.Patient_Diagnoses;
import model.PictureFuzzyRelation;
import utilities.MedicalDiagnosisCalculationsImpl;
import utilities.My_round;

public class TestMedicalDiagnoses_database {

	public static void main(String[] args) throws SQLException {
		// Khai bao 3 mang dung trong chuong trinh

		ArrayList<ArrayList<PictureFuzzyRelation>> pNs;

		ArrayList<ArrayList<PictureFuzzyRelation>> sNd;

		ArrayList<ArrayList<Float>> pNd = new ArrayList<ArrayList<Float>>();

		// lay du lieu tu co so du lieu cho bang pNs
		Query_to_database que1 = new Query_to_database();
		pNs = que1.get_data_patient_RF_symptoms();
		sNd = que1.get_data_symptoms_FR_diagnoses();
		pNd = que1.get_data_patient_RF_diagnoses();
		
		// update du lieu
		Create_suffer_random cur = new Create_suffer_random();
		ArrayList<ArrayList<String>> pNs_suffer = cur.creat_suffer_pNs();// tao ta bang ngau nhien mac benh gi
		que1.update_real_sick(pNs_suffer);// up date cac benh do
		
		
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

}
		
		
		
		

		
	

}
