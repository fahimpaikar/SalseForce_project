package seleniumAdvance;

import java.io.IOException;

public class Selenium_Day12_BrokenUrl extends Utilities {

	public static void main(String[] args) throws IOException {

		// How to find broken links or images

		openBrowser("firefox","http://qa.ibextechnologies.us/d8site/");
		
		verifyLinks();

	}

}
