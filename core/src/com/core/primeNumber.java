import java.util.Scanner;
public class primeNumber {
	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER NUMBER :: ");
		n=s.nextInt();
		int div=2;
		while (div<=(n/2)){
			if (n%div==0) 
			{
			System.out.println("Composite");
			return;
		    }
			div=div+1;}
		System.out.print("Prime ");

}}
