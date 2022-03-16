package Day_16;

public class day_17a implements myInterface {

	@Override
	public void methodOne() {
		System.out.println("Maryam just woke up");

	}

	@Override
	public void methodTwo() {
	    System.out.println("I just learned the shortcut on how to do sysout");

	}

	
	
	public static void main(String[] args) {
		day_17a obj = new day_17a();
		obj.methodTwo();
	}
}
