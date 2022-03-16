
public class Day_10Modifiers {

		// the word public in front of the above line is called modifier.
		// types of Modifiers:
		// 1- Public  2- Default 3- Private   4- Protected   
		// Public method can be accessed from any class and package
		// when a method does not have one the modifiers name in front of it its automatically default
		// a default method is accessible within class and within package
		// a default method is not accessible in a different class in a different package.
		// variables can be modified as well like following:
		int a = 10;
		public int b = 20;
		private int c = 20;
		protected int d = 30;
		
		// above initialized variables are called data members or fields
		// protected methods can not be accessed by another class even in the same package
		// private methods can be accessed by another class in the same package
		// private methods or data elements can not be accessed by subclass in a class.
		// private methods in subclass can not be accessed in the main class.
//		
//		protected static void sampleThirteen() {
//			System.out.println("This is protected method from sub class");
//		}
//		
//		private static void sampleForteen() {
//			System.out.println("This is a private method from sub class");
//		}
//		static void sampleFifteen() {
//			System.out.println("This is a default method from sub class");
//		}
//		public static void sampleSixteen() {
//			System.out.println("This is a private method from sub class");
//		}
//		
//	}
//
//	public class Day10_ModifierSubClass {
//
//		public static void main(String[] args) {
//			sampleNine();
//			sampleTen();
//			sampleEleven();
//			sampleTweleve();
//			
//			subClass a = new subClass();
//			a.sampleThirteen();
//			a.sampleFifteen();
//			a.sampleSixteen();
//		}
//		
//		private static void sampleNine() {
//			System.out.println("This is a private method");
//		}
//		
		static void sampleTen() {
			System.out.println("os.name");
		}
		
		public static void sampleEleven() {
			System.out.println("This is a public method");
		}
		protected static void sampleTweleve() {
			System.out.println("This is protectd method");
		}
		
		
		
		
		
		

	}


