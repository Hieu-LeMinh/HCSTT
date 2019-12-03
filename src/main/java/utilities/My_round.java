package utilities;

public class My_round {
	public float myRound(float num, int num_round) {
		float x = Math.round((num*Math.pow(10, num_round)));
		return x / (float) Math.pow(10, num_round);
		
	}
}
