package model;

public class Patient_Diagnoses {
	
	private String ID;
	private String name;
	
	private float fever;
	private float malaria;
	private float typhoid;
	private float stomach;
	private float chestProblem;
	private int suffer_fever;
	private int suffer_malaria;
	private int suffer_typhoid;
	private int suffer_stomach;
	private int suffer_chestProblem;
	private String image_name;
	
	public int getSuffer_fever() {
		return suffer_fever;
	}



	public void setSuffer_fever(int suffer_fever) {
		this.suffer_fever = suffer_fever;
	}



	public int getSuffer_malaria() {
		return suffer_malaria;
	}



	public void setSuffer_malaria(int suffer_malaria) {
		this.suffer_malaria = suffer_malaria;
	}



	public int getSuffer_typhoid() {
		return suffer_typhoid;
	}



	public void setSuffer_typhoid(int suffer_typhoid) {
		this.suffer_typhoid = suffer_typhoid;
	}



	public int getSuffer_stomach() {
		return suffer_stomach;
	}



	public void setSuffer_stomach(int suffer_stomach) {
		this.suffer_stomach = suffer_stomach;
	}



	public int getSuffer_chestProblem() {
		return suffer_chestProblem;
	}



	public void setSuffer_chestProblem(int suffer_chestProblem) {
		this.suffer_chestProblem = suffer_chestProblem;
	}



	public Patient_Diagnoses( String ID, String name,
			float fever, float malaria, float typhoid, 
			float stomach, float chestProblem, String image_name ) {
		
		setID(ID);
		setName(name);
		setFever(fever);
		setMalaria(malaria);
		setTyphoid(typhoid);
		setStomach(stomach);
		setChestProblem(chestProblem);
		setImage_name(image_name);
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public float getFever() {
		return fever;
	}
	public void setFever(float fever) {
		this.fever = fever;
	}
	
	
	public float getStomach() {
		return stomach;
	}
	public void setStomach(float stomach) {
		this.stomach = stomach;
	}
	
	
	public float getMalaria() {
		return malaria;
	}
	public void setMalaria(float malaria) {
		this.malaria = malaria;
	}
	
	
	public float getChestProblem() {
		return chestProblem;
	}
	
	public void setChestProblem(float chestProblem) {
		this.chestProblem = chestProblem;
	}
	

	public float getTyphoid() {
		return typhoid;
	}

	public void setTyphoid(float typhoid) {
		this.typhoid = typhoid;
	}



	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}



	public String getImage_name() {
		return image_name;
	}



	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}



	
}
