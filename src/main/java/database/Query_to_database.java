package database;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.management.ImmutableDescriptor;

import connection.ConnectionMysql;
import generate_data.Create_data_random;
import generate_data.Create_suffer_random;
import model.PictureFuzzyRelation;

public class Query_to_database {

	//lay bang pNs
	public ArrayList<ArrayList<PictureFuzzyRelation>> get_data_patient_RF_symptoms() {
		String query = "SELECT*FROM patient_FR_symptoms";
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		ResultSet rs = null;
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			ArrayList<ArrayList<PictureFuzzyRelation>> pNs = new ArrayList<ArrayList<PictureFuzzyRelation>>();
			int rows = 0;
			while(rs.next()) {
				pNs.add(new ArrayList<PictureFuzzyRelation>());
				
				pNs.get(rows).add(new PictureFuzzyRelation(rs.getFloat(4),rs.getFloat(5),rs.getFloat(6)));
				pNs.get(rows).add(new PictureFuzzyRelation(rs.getFloat(7),rs.getFloat(8),rs.getFloat(9)));
				pNs.get(rows).add(new PictureFuzzyRelation(rs.getFloat(10),rs.getFloat(11),rs.getFloat(12)));
				pNs.get(rows).add(new PictureFuzzyRelation(rs.getFloat(13),rs.getFloat(14),rs.getFloat(15)));
				pNs.get(rows).add(new PictureFuzzyRelation(rs.getFloat(16),rs.getFloat(17),rs.getFloat(18)));
				rows++;
			}
			return  pNs;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
	// lay bang sNd
		public ArrayList<ArrayList<PictureFuzzyRelation>> get_data_symptoms_FR_diagnoses() {
			String query = "SELECT*FROM symptoms_FR_diagnoses";
			ConnectionMysql connectionMysql = new ConnectionMysql();
			Connection cnn = connectionMysql.getConnection();
			ResultSet rs = null;
			try {
				PreparedStatement pst = cnn.prepareStatement(query);
				rs = pst.executeQuery();
				
				ArrayList<ArrayList<PictureFuzzyRelation>> sNd = new ArrayList<ArrayList<PictureFuzzyRelation>>();
				int rows = 0;
				while(rs.next()) {
					sNd.add(new ArrayList<PictureFuzzyRelation>());
					
					sNd.get(rows).add(new PictureFuzzyRelation(rs.getFloat(3), rs.getFloat(4), rs.getFloat(5)));
					sNd.get(rows).add(new PictureFuzzyRelation(rs.getFloat(6), rs.getFloat(7), rs.getFloat(8)));
					sNd.get(rows).add(new PictureFuzzyRelation(rs.getFloat(9), rs.getFloat(10), rs.getFloat(11)));
					sNd.get(rows).add(new PictureFuzzyRelation(rs.getFloat(12), rs.getFloat(13), rs.getFloat(14)));
					sNd.get(rows).add(new PictureFuzzyRelation(rs.getFloat(15), rs.getFloat(16), rs.getFloat(17)));
					rows++;
				}
				return sNd;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return null;
		}
		
		
		//lay bang pNd
		public ArrayList<ArrayList<Float>> get_data_patient_RF_diagnoses() {
			String query = "SELECT*FROM result_diagnoses";
			ConnectionMysql connectionMysql = new ConnectionMysql();
			Connection cnn = connectionMysql.getConnection();
			ResultSet rs = null;
			try {
				PreparedStatement pst = cnn.prepareStatement(query);
				rs = pst.executeQuery();
				
				ArrayList<ArrayList<Float>> pNd = new ArrayList<ArrayList<Float>>();
				int rows = 0;
				while(rs.next()) {
					pNd.add(new ArrayList<Float>());
					
					pNd.get(rows).add(rs.getFloat(3));
					pNd.get(rows).add(rs.getFloat(4));
					pNd.get(rows).add(rs.getFloat(5));
					pNd.get(rows).add(rs.getFloat(6));
					pNd.get(rows).add(rs.getFloat(7));
					
					rows++;
				}
				return pNd;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} finally {
				try {
					cnn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return null;
	}
	
		
	// lay het cac truong bang pNd
		//lay bang pNd
				public ArrayList<ArrayList<String>> get_all_data_patient_RF_diagnoses() {
					String query = "SELECT*FROM result_diagnoses";
					ConnectionMysql connectionMysql = new ConnectionMysql();
					Connection cnn = connectionMysql.getConnection();
					ResultSet rs = null;
					try {
						PreparedStatement pst = cnn.prepareStatement(query);
						rs = pst.executeQuery();
						
						ArrayList<ArrayList<String>> pNd = new ArrayList<ArrayList<String>>();
						int rows = 0;
						while(rs.next()) {
							pNd.add(new ArrayList<String>());
							pNd.get(rows).add(rs.getString(1));
							pNd.get(rows).add(rs.getString(2));							
							pNd.get(rows).add(rs.getString(8));
							
							rows++;
						}
						return pNd;
						
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
					return null;
			}
		
		
		public ArrayList<ArrayList<String>> get_data_suffer_patient_RF_symptoms() {
			String query = "SELECT*FROM patient_FR_symptoms";
			ConnectionMysql connectionMysql = new ConnectionMysql();
			Connection cnn = connectionMysql.getConnection();
			ResultSet rs = null;
			try {
				PreparedStatement pst = cnn.prepareStatement(query);
				rs = pst.executeQuery();
				ArrayList<ArrayList<String>> pNs_suffer = new ArrayList<ArrayList<String>>();
				int rows = 0;
				while(rs.next()) {
					pNs_suffer.add(new ArrayList<String>());
					
					pNs_suffer.get(rows).add(rs.getString(18));
					pNs_suffer.get(rows).add(rs.getString(19));
					pNs_suffer.get(rows).add(rs.getString(20));
					pNs_suffer.get(rows).add(rs.getString(21));
					pNs_suffer.get(rows).add(rs.getString(22));
					rows++;
				}
				return  pNs_suffer;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return null;
		}	
		
	// lay ra danh sach cac benh nhan
	public ArrayList<String> get_list_patients_of_patient_RF_symptoms() {
		String query = "SELECT*FROM patient_FR_symptoms";
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		ResultSet rs = null;
		
		ArrayList<String> list_patients = new ArrayList<String>();
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				list_patients.add(rs.getString(3));
			}
			return list_patients;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	//lay danh sach cac id
	// lay ra danh sach cac benh nhan
		public ArrayList<String> get_ID_of_patient_RF_symptoms() {
			String query = "SELECT*FROM patient_FR_symptoms";
			ConnectionMysql connectionMysql = new ConnectionMysql();
			Connection cnn = connectionMysql.getConnection();
			ResultSet rs = null;
			
			ArrayList<String> list_ID = new ArrayList<String>();
			try {
				PreparedStatement pst = cnn.prepareStatement(query);
				rs = pst.executeQuery();
				while(rs.next()) {
					list_ID.add(rs.getString(1));
				}
				return list_ID;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return null;
		}
	
	// lay ra danh sach cac trieu chung
	public ArrayList<String> get_list_symptoms_of_sysptoms_FR_diagnoses() {
		String query = "SELECT*FROM symptoms_FR_diagnoses";
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		ResultSet rs = null;
		
		ArrayList<String> list_sysmptoms = new ArrayList<String>();
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				list_sysmptoms.add(rs.getString(2));
			}
			return list_sysmptoms;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	// phuong thuc lay ra id cua cac benh nhan mac benh nao do trong qua khu
	// lay danh sach id cac benh nhan bi Fever
	public ArrayList<Integer> get_ID_result_Fever() {
		String query = "SELECT*FROM Result_Diagnoses "
				+ "WHERE Fever >= 0.7";
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		ResultSet rs = null;
		
		ArrayList<Integer> list_ID = new ArrayList<Integer>();
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				list_ID.add(rs.getInt(1));
			}
			return list_ID;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	// Lay danh sach id cac benh nhan bi Malaria
	public ArrayList<Integer> get_ID_result_Malaria() {
		String query = "SELECT*FROM Result_Diagnoses "
				+ "WHERE Malaria >= 0.7";
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		ResultSet rs = null;
		
		ArrayList<Integer> list_ID = new ArrayList<Integer>();
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				list_ID.add(rs.getInt(1));
			}
			return list_ID;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
	// Lay danh sach id cac benh nhan bi Typhoid
	public ArrayList<Integer> get_ID_result_Typhoid() {
		String query = "SELECT*FROM Result_Diagnoses "
				+ "WHERE Typhoid >= 0.7";
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		ResultSet rs = null;
		
		ArrayList<Integer> list_ID = new ArrayList<Integer>();
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				list_ID.add(rs.getInt(1));
			}
			return list_ID;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	// Lay danh sach id cac benh nhan bi Stomach
	public ArrayList<Integer> get_ID_result_Stomach() {
		String query = "SELECT*FROM Result_Diagnoses "
				+ "WHERE Stomach >= 0.7";
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		ResultSet rs = null;
		
		ArrayList<Integer> list_ID = new ArrayList<Integer>();
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				list_ID.add(rs.getInt(1));
			}
			return list_ID;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	// Lay danh sach id cac benh nhan bi Chest_problem
	public ArrayList<Integer> get_ID_result_Chest_problem() {
		String query = "SELECT*FROM Result_Diagnoses "
				+ "WHERE Chest_problem >= 0.7";
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		ResultSet rs = null;
		
		ArrayList<Integer> list_ID = new ArrayList<Integer>();
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				list_ID.add(rs.getInt(1));
			}
			return list_ID;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	// update ket qua benh chinh xac sau khi bac sy kham
	public void update_real_sick(ArrayList<ArrayList<String>> pNs_suffer) {
		Create_data_random cur = new Create_data_random();
		try {
			cur.create_list_names_id_DoctorID();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ArrayList<String> list_id = cur.list_id;
		
		for(int i=0; i<pNs_suffer.size();i++) {
				System.out.println(list_id.get(i));
				String query = "update patient_fr_symptoms set "
						+ " suffer_fever = "   + "'" + pNs_suffer.get(i).get(0) + "'," 
						+ " suffer_malaria = "  + "'" + pNs_suffer.get(i).get(1) + "'," 
						+ " suffer_typhoid = " + "'" + pNs_suffer.get(i).get(2) + "'," 
						+ " suffer_stomach = " + "'" + pNs_suffer.get(i).get(3) + "'," 
						+ " suffer_chest_problem = " + "'" + pNs_suffer.get(i).get(4) + "'"
						+ " where id = '" + list_id.get(i) +"' ";
				ConnectionMysql connectionMysql = new ConnectionMysql();
				Connection cnn = connectionMysql.getConnection();
				int  rs = 0;
				try {
					PreparedStatement pst = cnn.prepareStatement(query);
					rs = pst.executeUpdate();
					
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}finally {
					try {
						cnn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
		}
		
	}
	
	
	// update ten cac buc anh
	public void update_image_name() {
		Query_to_database que = new Query_to_database();
		ArrayList<String> pNs_id = que.get_ID_of_patient_RF_symptoms();
		
		Create_data_random cur = new Create_data_random();
		
		try {
			cur.create_list_img();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ArrayList<String> list_img = cur.list_img;
		
		for(int i=0; i<list_img.size();i++) {
				System.out.println(list_img.get(i));
				String query = "update result_diagnoses set "
						+ " image_name = '" + list_img.get(i) + "' "
						+ " where id = '" + pNs_id.get(i) +"' ";
				ConnectionMysql connectionMysql = new ConnectionMysql();
				Connection cnn = connectionMysql.getConnection();
				int  rs = 0;
				try {
					PreparedStatement pst = cnn.prepareStatement(query);
					rs = pst.executeUpdate();
					
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
		}
		
		
		
	}
	
	// update ket qua bi benh gi that tu bac sy
	public int update_desease_from_doctor(String ID, String name, String ynFever, 
				String ynMalaria, String ynTyphoid, 
				String ynStomach, String ynChest) {
		 String query = "update patient_fr_symptoms set "
					+ " suffer_fever = '" + ynFever + "'," 
					+ " suffer_malaria = '" + ynMalaria + "',"
					+ " suffer_Typhoid = '" + ynTyphoid + "',"
					+ " suffer_Stomach = '" + ynStomach + "',"
					+ " suffer_chest_problem = '" + ynChest + "'"
					+ " where ID = '" + ID + "' and name_patients = '" + name + "'"  ;
			ConnectionMysql connectionMysql = new ConnectionMysql();
			Connection cnn = connectionMysql.getConnection();
			int  rs = 0;
			try {
				PreparedStatement pst = cnn.prepareStatement(query);
				rs = pst.executeUpdate();
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}	
			
			return rs;
			
	 }
	 
	// Lay thong tin cua bac si khi co ID
		public ArrayList<String> get_doctor_information(String doctorID) {
			String query = "SELECT*FROM doctor_information "
					+ "WHERE doctorID = '" + doctorID + "'" ;
			
			if(doctorID == null) {
				return null;
			}
			
			ConnectionMysql connectionMysql = new ConnectionMysql();
			Connection cnn = connectionMysql.getConnection();
			ResultSet rs = null;
			
			
			
			ArrayList<String> list_doctor_information = new ArrayList<String>();
			try {
				PreparedStatement pst = cnn.prepareStatement(query);
				rs = pst.executeQuery();
				while(rs.next()) {
					list_doctor_information.add(rs.getString(1));
					list_doctor_information.add(rs.getString(2));
					list_doctor_information.add(rs.getString(3));
					list_doctor_information.add(String.valueOf(rs.getInt(4)));
					list_doctor_information.add(rs.getString(5));
				}
				return list_doctor_information;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return null;
		}
		
		
		// Lay ID cua bac si khi co ID cua benh nhan
	public String get_doctorID(String patientID) {
		String query = "SELECT*FROM  patient_fr_symptoms "
						+ "WHERE ID = '" + patientID + "'" ;
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		ResultSet rs = null;
								
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			String doctorID = "";
			while(rs.next()) {
				doctorID =  rs.getString(2);
			}
			return doctorID;
						
		} catch (SQLException e) {
						
			e.printStackTrace();
		}
				return null;
	}
		
	 // luu tru tru thong tin bac si moi, hoac cap nhat thong tin bac si cu	
	public int store_information_doctor(String patientID, String name, String doctorID, String gender, int age, String image_name) {
		// ket noi voi csdl
		ConnectionMysql connectionMysql = new ConnectionMysql();
		Connection cnn = connectionMysql.getConnection();
		
		
		// cap nhat ID cua bac si da dua ra ket luan cuoi cung
		String queryUpdateDoctorID  = "update patient_fr_symptoms set "
				+ "DoctorID = '" + doctorID + "' "
				+ "where ID = '" + patientID + "'";
		int rsUpdateDoctorID = 0;
		try {
			PreparedStatement pstUpdateDoctorID = cnn.prepareStatement(queryUpdateDoctorID);
			rsUpdateDoctorID = pstUpdateDoctorID.executeUpdate();
			if(rsUpdateDoctorID==0) {
				return 0;
			}
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		} 
		
		// kiem tra xem co ban ghi nao co ID trung khong
		String query = "select count(1) "
				+ "from doctor_information "
				+ "where doctorID = '" + doctorID + "'";
		
		ResultSet rs = null;
		int rsUpdateCreate = 0; // bien tra ve cho biet co update hay create thanh cong hay khong
		try {
			PreparedStatement pst = cnn.prepareStatement(query);
			rs = pst.executeQuery();
			int count = 0;
			while(rs.next()) {
				count = rs.getInt(1);
			}
			
			// neu nhu count = 1 thi chung to ban ghi co ID da ton tai
			if(count==1) {
				String updateQuery = "update doctor_information set "
						+ "name = '" +  name + "',"
						+ "doctorID = '" + doctorID + "',"
						+ "Gender = '" + gender + "',"
						+ "Age = '" + age + "',"
						+ "image_name = '" + image_name + "'"
						+ "where doctorID = '" + doctorID + "'";
				int rsUpdate = 0;
				PreparedStatement pstUpdate = cnn.prepareStatement(updateQuery);
				rsUpdate = pstUpdate.executeUpdate();
				if(rsUpdate ==1 ) {
					rsUpdateCreate = 1; // neu update thanh cong thi tra ve 1
					return rsUpdateCreate;
				}
				
			}else {
				String createQuery = "insert into doctor_information "
						+ "value ('" + doctorID + "'," 
						+ "'" + name + "'," 
						+ "'" + gender + "',"
						+       age + ","
						+ "'" + image_name + "')";
				
				int rsCreate = 0;
				PreparedStatement pstCreate = cnn.prepareStatement(createQuery);
				rsCreate = pstCreate.executeUpdate();
				if(rsCreate==1) {
					rsUpdateCreate = 2; // neu tao moi thanh cong thi tra ve 2
					return rsUpdateCreate;
				}
			}
			
								
		} catch (SQLException e) {
						
				e.printStackTrace();
		}finally {
			try {
				cnn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		
		return rsUpdateCreate;
		
				
	}
	
	public boolean check_existed_doctorID(String doctorID) {
		// ket noi voi csdl
				ConnectionMysql connectionMysql = new ConnectionMysql();
				Connection cnn = connectionMysql.getConnection();

				// kiem tra xem co ban ghi nao co ID trung khong
				String query = "select count(1) "
						+ "from doctor_information "
						+ "where doctorID = '" + doctorID + "'";
				
				ResultSet rs = null;
				int rsUpdateCreate = 0; // bien tra ve cho biet co update hay create thanh cong hay khong
				try {
					PreparedStatement pst = cnn.prepareStatement(query);
					rs = pst.executeQuery();
					int count = 0;
					while(rs.next()) {
						count = rs.getInt(1);
					}
					if(count==1) {
						return true;
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			return false;	
	}
	
	public static void main(String[] args) {
		Query_to_database que = new Query_to_database();
		String doctorID = que.get_doctorID("PT-00001");
		int x = que.store_information_doctor("lmn0111","doctor1", "DT0010", "male", 30, "imageDT7.jpg");
		System.out.println(x);
		System.out.println(que.get_doctor_information(doctorID));
	}
	
	
	
}
