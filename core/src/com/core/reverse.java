import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("PLEASE ENTER NUMBER :: ");
		int num= s.nextInt();
		int rev=0;
		int sum=0;
		while (num>0) {
			sum=num%10;
			rev=rev*10+sum;
			num=num/10;
		}System.out.print("NUMBER AFTER REVERSE::  "+rev);
		

	}

}
