
public class Day09_Originalmethods {

	public static void main(String[] args) {
		
		// below method we were able to call using method name because these were static methods
		openBrowser("Chrome");
		openBrowser("Firefox");
		// in order to call quitBrowser method we will need to create an object of this class because
		// it is a non static method
		Day09_Originalmethods a = new Day09_Originalmethods();
		a.quitBrowser();
	}
	// Methods without return values and with Access Modifiers // static method without return value means is use of void
	public static void openBrowser(String browserName) {
		// if i write 100 lines of code for this method
		System.out.println("This will open "+browserName);
	}
	// non static method without return value means using of void
	public void quitBrowser() {
		System.out.println("This command will close the browser");
	
		
		
		
		
		
	}

}
