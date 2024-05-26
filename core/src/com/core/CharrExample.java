import java .util.Scanner;
public class CharrExample {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("ENTER STRING PLEASE ");
	    String  Str= s.nextLine();
	    System.out.println("ENTER THE PLACE VALUE  YOU WANT TO PRINT::" );
	    int a= s.nextInt();
		char c=Str.charAt(a);
		System.out.print("FIRST LETTER OF YOUR STRING IS :: "+c);
		
		
		

	}

}
