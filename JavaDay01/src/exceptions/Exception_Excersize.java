package exceptions;

public class Exception_Excersize {

	public static void main(String[] args) {
		
		try {
			int a = 20;
			double b = a/0;
			System.out.println(b);
		} catch (Exception e ) {
			System.out.println("You can not devide a number by Zero!!");
		} finally {
			System.out.println("Finally block always gets excecuted!!!");
		}

	}

}
