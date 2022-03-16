package Day_15;

class furniture {
	 furniture(){
		System.out.println("This sofa is coming from parent constructor!!");
	}
}

class sofa extends furniture {
	 sofa(){
		System.out.println("This sofa is coming from the sofa (child) class!!!!");
	}
}





public class Super_Method {

	public static void main(String[] args) {
		
		sofa a = new sofa();
		

	}

}
