package Kabul;

public class park {

        private int age;
		private String name;
		private double hight;
		park(int a ){
			System.out.println(a);
		}
		park(){
			age = 9;
			name = "Mustafa";
			hight = 4.9;
			System.out.println(age +"  "+name +" "+ hight);
		}
		
		park(int x, String str, double y){
			age = x;
			name = str;
			hight = y;
			System.out.println(age +" "+name+ " "+hight);
		}
		
		park (int x, String str, double y, String add){
			age = x;
			name =str;
			hight = y;
			System.out.println(age+" "+name + " "+ hight +" "+ add);
		}
		
	
	public static void main(String[] args) {
		
	       park kid1 = new park();
           park kid2 = new park(34, "Johan", 4.7);
           park kid3 = new park(15, "shah", 7.5, "Khairkhana");
           park kid4 = new park(55);
         
	}

}
