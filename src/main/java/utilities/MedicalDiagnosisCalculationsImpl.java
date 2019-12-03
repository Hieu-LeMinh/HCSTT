package utilities;

import java.util.ArrayList;

import model.PictureFuzzyRelation;

public class MedicalDiagnosisCalculationsImpl implements Calculations {

	public float calDoPositiveM(ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1, ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b, int length) {
		float max = 0;
	    for (int j = 0; j < length; j++) {
	      if (Math.min(pFrArray1.get(a).get(j).getPositive(), pFrArray2.get(j).get(b).getPositive()) > max) {
	        max = Math.min(pFrArray1.get(a).get(j).getPositive(), pFrArray2.get(j).get(b).getPositive());
	      }
	    }
	    return max;
	}

	public float calDoNeutralM(ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1, ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b, int length) {
		float min = 1;
	    for (int j = 0; j < length; j++) {
	      if (Math.min(pFrArray1.get(a).get(j).getNeutral(), pFrArray2.get(j).get(b).getNeutral()) < min) {
	        min = Math.min(pFrArray1.get(a).get(j).getNeutral(), pFrArray2.get(j).get(b).getNeutral());
	        
	      }
	    }
	    
	    return min;
	}

	public float calDoNegativeM(ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1, ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b, int length) {
		float min = 1;
	    for (int j = 0; j < length; j++) {
	      if (Math.max(pFrArray1.get(a).get(j).getNegative(), pFrArray2.get(j).get(b).getNegative()) < min) {
	        min = Math.max(pFrArray1.get(a).get(j).getNegative(), pFrArray2.get(j).get(b).getNegative());
	      }
	    }
	    return min;
	}

	public float calDoRefusalM(ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray1, ArrayList<ArrayList<PictureFuzzyRelation>> pFrArray2, int a, int b, int length) {
		// TODO Auto-generated method stub
		return 0;
	}

	public float calS(float u, float n, float v) {
		 return (u - v * (1 - (u + n + v)));
	}

	  
}



