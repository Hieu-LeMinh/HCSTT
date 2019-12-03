package utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DSGT_trans_to_file {
	public static void main(String[] args) throws IOException {
		// Doc du lieu tu file pNs (patien and symptoms)
	    File file_pNs = new File("D:\\Desktop\\AI_FILE\\medical_diagnoses\\pNs.txt");
	    // xuat du lieu ra file khac
	    File export_file = new File("D:\\Desktop\\AI_FILE\\medical_diagnoses\\pNs_export.txt");
	    FileWriter fileWrite = new FileWriter(export_file);
	    BufferedWriter writer = new BufferedWriter(fileWrite);
	    Scanner scan = new Scanner(file_pNs);
	// Lay vao so benh nhan va ten cua cac benh nhan
	    ArrayList<String> list_patients = new ArrayList<String>();
	    int num_patien = Integer.parseInt(scan.next());
	    writer.write(String.valueOf(num_patien));
	    writer.newLine();
	    for(int i=0; i<num_patien; i++) {
	    	String patient;
	    	patient = scan.next();
	    	list_patients.add(patient);
	    	writer.write(patient + " "); 
	    }
	    writer.newLine();
	    
	// Lay so dong va cot cua bang pNs
		int rows, cols;
		rows = Integer.parseInt(scan.next());
		cols = Integer.parseInt(scan.next());
		writer.write(String.valueOf(rows));
		writer.newLine();
		writer.write(String.valueOf(cols));
		writer.newLine();
	// chuyen doi du lieu thanh so
		DSGT trans_num_into_string = new DSGT();
			
	// Nhap du lieu vao bang pNs
		while (scan.hasNext()) {
			for (int i = 0; i < rows; i++) {
				
				for (int j = 0; j < cols; j++) {
					float pos, neu, nav;
					pos = Float.parseFloat(scan.next());
					neu = Float.parseFloat(scan.next());
					nav = Float.parseFloat(scan.next());
					
					writer.write(trans_num_into_string.unDoDSGT(pos) +"  ");
					writer.write(trans_num_into_string.unDoDSGT(neu) +"  ");
					writer.write(trans_num_into_string.unDoDSGT(nav) +"  ");
					
					writer.newLine();				
					
					System.out.println(trans_num_into_string.unDoDSGT(pos));
					System.out.println(trans_num_into_string.unDoDSGT(neu));
					System.out.println(trans_num_into_string.unDoDSGT(nav));
					
				}
				writer.newLine();
				writer.newLine();
			}
		}
		writer.close();
		scan.close();
	 
	}
}
