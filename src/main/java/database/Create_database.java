package database;

import java.io.FileNotFoundException;

import generate_data.Create_data_random;

public class Create_database {

	public static void main(String[] args) throws FileNotFoundException {
		
//		ArrayList<String> list_names = new ArrayList<String>();
//		list_names = data_ran.create_list_names();
		
		Insert_to_database ins = new Insert_to_database();
		for(int i=0; i<1000; i++) {
			Create_data_random data_ran = new Create_data_random();
			
			data_ran.create_list_names_id_DoctorID();
			
			data_ran.setID(data_ran.list_id.get(i));
			data_ran.setName();
			data_ran.setDoctorID();
			
			data_ran.setTemp_pos();
			data_ran.setTemp_nav();
			data_ran.setTemp_neu();
			
			data_ran.setHeadache_pos();
			data_ran.setHeadache_nav();
			data_ran.setHeadache_neu();
			
			data_ran.setSto_pain_pos();
			data_ran.setSto_pain_nav();
			data_ran.setSto_pain_neu();
			
			data_ran.setCough_pos();
			data_ran.setCough_nav();
			data_ran.setCough_neu();
			
			data_ran.setChest_pain_pos();
			data_ran.setChest_pain_nav();
			data_ran.setChest_pain_neu();
			
			System.out.println(ins.insert_into_patient_FR_symptoms(data_ran));
			
		}

	}

}
