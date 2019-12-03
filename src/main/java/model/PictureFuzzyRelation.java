package model;

public class PictureFuzzyRelation {

	float positive;
	float neutral;
	float negative;

	public PictureFuzzyRelation() {
//    super();
	}

	public PictureFuzzyRelation(float positive, float neutral, float negative) {
		super();
		this.positive = positive;
		this.neutral = neutral;
		this.negative = negative;
	}

	public float getPositive() {
		return positive;
	}

	public void setPositive(float positive) {
		this.positive = positive;
	}

	public float getNeutral() {
		return neutral;
	}

	public void setNeutral(float neutral) {
		this.neutral = neutral;
	}

	public float getNegative() {
		return negative;
	}

	public void setNegative(float negative) {
		this.negative = negative;
	}
}
