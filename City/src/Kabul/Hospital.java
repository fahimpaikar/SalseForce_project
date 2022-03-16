package Kabul;

import java.util.Arrays;
import java.util.Collections;

public class Hospital {

	public static void main(String[] args) {
		String x = "Fahim";
		String y = "Paikar";
		x = x + y;
		y = x.substring(0, (x).length() - y.length());
		x = x.substring(y.length());
		System.out.println(x);
		System.out.println(y);

		String given = "wefeqf878979797fewfewrf879797efds&^&^*^*^";
		String replaced = given.replaceAll("[a-zA-A]", "");
		int alphaChar = given.length() - replaced.length();
		System.out.println(alphaChar);

		String replaceda = given.replaceAll("[^a-zA-A]", "");
		System.out.println(replaceda.length());
		String a = "Welcome to the interview with Codegator";
		System.out.println(a.substring(15));
		String[] words = a.split(" ");
		System.out.println(words.length);
		for (String string : words) {
			System.out.println(string);
		}

		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb.reverse());

		int nu = 1234;
		String num = String.valueOf(nu);
		StringBuffer numbers = new StringBuffer(num);
		System.out.println(numbers.reverse());

		int code = 12345;
		String convert = String.valueOf(code);
		char[] arrayChar = convert.toCharArray();
		int codeSize = arrayChar.length;
		for (int i = codeSize - 1; i >= 0; i--) {
			System.out.println(arrayChar[i]);
		}

		int currentNum = 12345;
		int reversNum = 0;
		while (currentNum != 0) {
			reversNum = reversNum * 10 + currentNum % 10;
			currentNum = currentNum / 10;

		}
		System.out.println(reversNum);

		String add = "THORNBURY";
		char[] address = add.toCharArray();
		for (int i = 0; i < add.length(); i++) {
			System.out.println(address[i]);
		}

		System.out.println(String.valueOf(address));

		System.out.println(Arrays.toString(address));

		int[] numb = { 12, 44, 34, 6, -1, 22 };

		Arrays.sort(numb);
		System.out.println(numb[numb.length - 2]);

		int[] arr = { 34, 89, 99, 3, 22, 109 };
		int largest = arr[0];
		int scndLargest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				scndLargest = largest;
				largest = arr[i];
			} else if (arr[i] > scndLargest) {
				scndLargest = arr[i];
			}
		}
		System.out.println("The second largest number is " + scndLargest);

		int[] arrNum = { 34, 89, 99, 3, 22, 109 };
		int biggest = 0;
		int smallest = 0;
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] > biggest) {
				biggest = arrNum[i];
			} else {
				smallest = arrNum[i-1];
			}
		}

		System.out.println(smallest);
		System.out.println(biggest);

		Integer []numBers =  { 34, 89, 99, -9, 22, 129 };
		int min = Collections.min(Arrays.asList(numBers));
		int max = Collections.max(Arrays.asList(numBers));
		System.out.println(min);
		System.out.println(max);
		
		
		
	}

}
