package Mazar;

public class hospital {

	private String name;
	private int ID;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String setName) {
		name = setName;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		
		hospital patient = new hospital();
		patient.setName("Nooryar");
		patient.setAge(55);
		patient.setID(8767);
		System.out.println(patient.getName()+ " "+ patient.getID()+ " "+ patient.getAge());
		

	}

}
