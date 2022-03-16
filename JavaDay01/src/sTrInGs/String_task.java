package sTrInGs;

public class String_task {
  
	public static void main(String[] args) {

		task("Kingjumanjie");
		System.out.println(task2("helsslo", "hello"));
		
	}

	public static boolean task2 (String firstVal, String secondVal) {
		String a = firstVal;
		String b = secondVal;
		return a.equals(b);
		
	}

	public static void task(String inputVal) {
		String value = inputVal;
		int startVal = 0;
		int endVal = 0;
		int len = value.length();
		
		if(len>=3) {
			if (len % 2 == 1) {
				startVal = len/2;
				endVal=1;
			}
			else {
				startVal = (len/2)-1;
				endVal = 2;	
	    	}
			System.out.println(value.substring(startVal, startVal+ endVal));
		
		}
	
	}
}
	

