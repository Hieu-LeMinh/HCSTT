package utilities;

import java.util.Random;

public class DSGT {
	public float doDSGT(String str) {
		Random r = new Random();
		float result = 0;
		
		if(str.equals("khong")) {
			result = 0.0f;
		} else if(str.equals("rat_thap")) {
			result = 0.125f;
		} else if(str.equals("thap")) {
			result = 0.25f;
		} else if(str.equals("hoi_thap")) {
			result = 0.375f;
		} else if(str.equals("trung_binh")) {
			result = 0.5f;
		} else if(str.equals("hoi_cao")) {
			result = 0.625f;
		} else if(str.equals("cao")) {
			result = 0.75f;
		} else if(str.equals("rat_cao")) {
			result = 0.875f;
		} else {
			result = 1.0f;
		}
				
		return result;
	}
	
	public String unDoDSGT(float r) {
		
		if (r == 0) return "khong";
		else if (r < 0.1875f ) return "rat_thap";
		else if (r < 0.3125f ) return "thap";
		else if (r < 0.4375f ) return "hoi_thap";
		else if (r < 0.5625f ) return "trung_binh";
		else if (r < 0.6875f ) return "hoi_cao";
		else if (r < 0.8125f ) return "cao";
		else if (r < 0.9375f ) return "rat_cao";
		else return "hoan_toan";
	}
	
	public static void main(String[] args) {
		String str2 = "khong";
		DSGT ds = new DSGT();
		System.out.println(ds.doDSGT(str2));
		System.out.println(str2.equals("khong"));
	}
}
