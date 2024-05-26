package harshvajpayee;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int digit= s.nextInt();
		int et=0,evenSum=0,oddSum=0;
		while(digit>0) {
			et=digit%10;
			if(et%2==0) { evenSum +=et;}
			else {oddSum += et ;}
			digit /=10;
			
		}
		System.out.println("Sum of even digit "+ evenSum +" "+"Sum of odd Digit "+ oddSum );

	}

}
