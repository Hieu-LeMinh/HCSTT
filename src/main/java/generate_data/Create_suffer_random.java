package generate_data;

import java.util.ArrayList;
import java.util.Random;

import database.Query_to_database;

public class Create_suffer_random {
	// tao ra ngau nhien ten benh that 
	public ArrayList<ArrayList<String>> creat_suffer_pNs() {
		Query_to_database que = new Query_to_database();
		ArrayList<ArrayList<Float>> pNd = que.get_data_patient_RF_diagnoses();
		ArrayList<ArrayList<String>> pNs_suffer = new ArrayList<ArrayList<String>>();
		Random rd = new Random();
		for(int i=0; i<pNd.size(); i++) {
			pNs_suffer.add(new ArrayList<String>());
			for(int j=0; j<pNd.get(0).size(); j++) {
				if(pNd.get(i).get(j)>0.8) {
					
					pNs_suffer.get(i).add("yes");
					
				}else if(pNd.get(i).get(j)<0.3) {
					
					pNs_suffer.get(i).add("no");
					
				}else if(rd.nextFloat() <= pNd.get(i).get(j)) {		
					
					pNs_suffer.get(i).add("yes");
					
				}else {
					
					pNs_suffer.get(i).add("no");
				}
			}
		}
		System.out.println(pNs_suffer.get(262));
		return pNs_suffer;
	}
	public static void main(String[] args) {
		Create_suffer_random cur = new Create_suffer_random();
		cur.creat_suffer_pNs();
		
	}
	
}
