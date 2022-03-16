package Polymorphism;

class Fruits {
	 void taste () {
		System.out.println("Fruits are very tasty!");
	}
}

class seeded extends Fruits {
	
}

class unseeded extends Fruits {
	void taste () {
		System.out.println("Unseeded fruits are very unhealthy!!!");
	}
}


class sour extends Fruits{
	void taste () {
		System.out.println("Oranges are very SOUR");
	}
}



public class nature1 {

	public static void main(String[] args) {
		seeded fr = new seeded();
		unseeded fru = new unseeded();
		sour frt = new sour();
		
		fr.taste();
		fru.taste();
        frt.taste();
	}

}
