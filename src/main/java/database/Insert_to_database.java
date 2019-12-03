package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionMysql;
import generate_data.Create_data_random;
import model.Patient_Diagnoses;
import model.Patient_Symptoms;

public class Insert_to_database {
	
	// insert den bang ket qua cuoi cung
	public boolean insert_to_Result_Diagnoses(Patient_Diagnoses pd) {
		String sql = "insert into Result_Diagnoses (ID, name, Fever, Malaria, Typhoid, Stomach,Chest_problem, image_name )values "
				+ "("+"'" + pd.getID() + "', "+ "'"+pd.getName() + "'"
				+"," + pd.getFever() + "," + pd.getMalaria()
				+"," + pd.getTyphoid() + "," +pd.getStomach()
				+"," + pd.getChestProblem() + ", '" + pd.getImage_name() + "')";
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			int result = pst.executeUpdate();
			cnn.close();
			if(result == 1) {
				return true;
			}
			else {
				return false;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			
			try {
				cnn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public boolean insert_into_patient_FR_symptoms(Patient_Symptoms data_ran) {
		String sql = "insert into patient_FR_symptoms (ID, DoctorID, name_patients, Temp_pos, Temp_neu, Temp_nav"
				+ ", Headache_pos, Headache_neu, Headache_nav"
				+ ", Sto_pain_pos, Sto_pain_neu, Sto_pain_nav"
				+ ", Cough_pos, Cough_neu, Cough_nav"
				+ ", Chest_pain_pos, Chest_pain_neu, Chest_pain_nav)"
				+ " values ("
				+ "'" + data_ran.getID() + "', " + "'" + data_ran.getDoctorID() + "', " +  "'" + data_ran.getName() +"'"
				+ "," + data_ran.getTemp_pos() + "," + data_ran.getTemp_neu() + "," + data_ran.getTemp_nav()
				+ "," + data_ran.getHeadache_pos() + "," + data_ran.getHeadache_neu() + "," + data_ran.getHeadache_nav()
				+ "," + data_ran.getSto_pain_pos() + "," + data_ran.getSto_pain_neu() + "," + data_ran.getSto_pain_nav()
				+ "," + data_ran.getCough_pos() + "," + data_ran.getCough_neu()+ "," + data_ran.getCough_nav()
				+ "," + data_ran.getChest_pain_pos()+"," +data_ran.getChest_pain_neu() + "," + data_ran.getChest_pain_nav()
				+ ")";
		ConnectionMysql  connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			int result = pst.executeUpdate();
			cnn.close();
			if(result == 1) {
				return true;
			}
			else {
				return false;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			
			try {
				cnn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return false;			
	}
}
