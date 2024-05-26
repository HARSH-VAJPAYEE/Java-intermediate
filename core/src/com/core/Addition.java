import java.util.Scanner;

import harshvajpayee.Assi21oct2020;

 class Addition extends Assi21oct2020 {

	public static void main(String[] args) {
		Addition obj = new Addition();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a=s.nextInt();
		System.out.println("Enter the Second  Number");
        int b=s.nextInt();
		System.out.println(obj.addTwoNumbers(a,b));

		

		  
		}

	}


