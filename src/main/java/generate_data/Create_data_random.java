package generate_data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import main.TestMedicaIDiagnosis_file;
import model.Patient_Symptoms;
import utilities.My_round;

public class Create_data_random extends Patient_Symptoms {
	
	
	public ArrayList<String> list_names = new ArrayList<String>();
	public ArrayList<String> list_id = new ArrayList<String>();
	public ArrayList<String> list_DoctorID = new ArrayList<String>();
	public ArrayList<String> list_img = new ArrayList<String>();
	public Random rd = new Random();
	public My_round my_round = new My_round(); // ham tu dinh nghia dung de lam tron so

	public void create_list_names_id_DoctorID () throws FileNotFoundException {
		File file_list_patient = new File("medical_diagnoses//list_patient");
		File file_list_id = new File("medical_diagnoses//ID");
		File file_list_DoctorID = new File("medical_diagnoses//DoctorID");
		Scanner scan = new Scanner(file_list_patient);
		
		while(scan.hasNextLine()) {
			list_names.add(scan.nextLine());
		}
		
		scan = new Scanner(file_list_id);
		while(scan.hasNextLine()) {
			list_id.add(scan.nextLine());
		}
		
		scan = new Scanner(file_list_DoctorID);
		while(scan.hasNextLine()) {
			list_DoctorID.add(scan.nextLine());
		}
		scan.close();
	}
	
	public void create_list_img() throws FileNotFoundException {
		for(int i=0; i<100; i++) {
			list_img.add("imageAI" + (1 + rd.nextInt(20)) + ".jpg");
		}
		
		
	}
		
	
	@Override
	public String getID() {
		return super.ID;
	}



	@Override
	public void setID(String iD) {
		super.ID = iD;
	}

	public String getDoctorID() {
		return super.DoctorID;
	}



	public void setDoctorID() {
		super.DoctorID = list_DoctorID.get(rd.nextInt(list_DoctorID.size()));
	}

	
	
	public String getName() {
		return name;
	}
	public void setName() {
		int ran_name = rd.nextInt(list_names.size()-1);
		super.name = list_names.get(ran_name);
	}

	
	public String getImage_name() {
		return super.image_name;
	}



	public void setImage_name() {
		int ran_img = rd.nextInt(list_img.size());
		super.image_name = list_img.get(ran_img);
	}
	
	public float getTemp_pos() {
		return my_round.myRound(Temp_pos, 2);
	}
	public void setTemp_pos() {		
		Temp_pos = rd.nextFloat();
	}

	
	public float getTemp_neu() {
		return my_round.myRound(Temp_neu, 3);
	}
	public void setTemp_neu() {
		Temp_neu = (1 - this.getTemp_pos()-this.getTemp_nav())*rd.nextFloat();
	}
	
	
	public float getTemp_nav() {
		return my_round.myRound(Temp_nav, 2);
	}
	
	public void setTemp_nav() {
		Temp_nav = (1-this.getTemp_pos())*rd.nextFloat();
	}
	
	
	public float getHeadache_pos() {
		return my_round.myRound(Headache_pos, 2);
	}
	public void setHeadache_pos() {
		Headache_pos = rd.nextFloat();
	}
	
	
	public float getHeadache_neu() {
		return my_round.myRound(Headache_neu, 3);
	}
	public void setHeadache_neu() {
		Headache_neu = (1-this.getHeadache_nav()-this.getHeadache_pos())*rd.nextFloat();
	}
	
	
	public float getHeadache_nav() {
		return my_round.myRound(Headache_nav, 2);
	}
	public void setHeadache_nav() {
		Headache_nav = (1-this.getHeadache_pos())*rd.nextFloat();
	}
	
	
	
	public float getSto_pain_pos() {
		return my_round.myRound(Sto_pain_pos, 2);
	}
	public void setSto_pain_pos() {
		Sto_pain_pos = rd.nextFloat();
	}
	
	
	public float getSto_pain_neu() {
		return my_round.myRound(Sto_pain_neu, 3);
	}
	public void setSto_pain_neu() {
		Sto_pain_neu = (1-this.getSto_pain_pos()-this.getSto_pain_nav())*rd.nextFloat();
	}
	
	
	public float getSto_pain_nav() {
		return my_round.myRound(Sto_pain_nav, 2);
	}
	public void setSto_pain_nav() {
		Sto_pain_nav = (1-this.getSto_pain_pos())*rd.nextFloat();
	}
	
	
	
	
	
	public float getCough_pos() {
		return my_round.myRound(Cough_pos, 2);
	}
	public void setCough_pos() {
		Cough_pos = rd.nextFloat();
	}
	
	
	public float getCough_neu() {
		return my_round.myRound(Cough_neu, 3);
	}
	public void setCough_neu() {
		Cough_neu = (1-this.getCough_nav()-this.getCough_pos())*rd.nextFloat();
	}
	
		
	public float getCough_nav() {
		return my_round.myRound(Cough_nav, 2);
	}
	public void setCough_nav() {
		Cough_nav = (1-this.getCough_pos())*rd.nextFloat();
	}
	
	
	
	public float getChest_pain_pos() {
		return my_round.myRound(Chest_pain_pos, 2);
	}
	public void setChest_pain_pos() {
		Chest_pain_pos = rd.nextFloat();
	}
	
		
	public float getChest_pain_neu() {
		return my_round.myRound(Chest_pain_neu, 3);
	}
	public void setChest_pain_neu() {
		Chest_pain_neu = (1-this.getChest_pain_nav()-this.getChest_pain_pos())*rd.nextFloat();
	}
		
	
	public float getChest_pain_nav() {
		return my_round.myRound(Chest_pain_nav, 2);
	}
	public void setChest_pain_nav() {
		Chest_pain_nav = (1-this.getChest_pain_pos())*rd.nextFloat();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Create_data_random test = new Create_data_random();
		test.create_list_names_id_DoctorID();
		for(int i=1; i<10; i++) {
			test.setName();
			System.out.println(test.getName());
			System.out.println();
		}
		
	}
}
