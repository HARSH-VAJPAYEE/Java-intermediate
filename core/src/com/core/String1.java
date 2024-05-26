import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.print("Enter first string :: ");
	    String  a =s.next();
	    System.out.print("Enter your Second String :: ");
		String  b= s.next();
		//Length
		System.out.println("The length of  First string is : "+ a.length());
		System.out.println("The length of  Second string is : "+ b.length());
         //concat
		System.out.println("Strings Are :"+ a + "at"+ b );
		String c= a.concat(b);
		System.out.println("concat using function is " + c);
		// equal
		boolean result = a.equals(b);
		System.out.println("IS 1st string is equal to second String : "+ result );
		//slice or get any character 
		System.out.print("Enter the number of char you want :: ");
		int index=s.nextInt();
		System.out.println ("The character at "+ index + "  of a is : "+ a.charAt(index));
		System.out.println ("The character at "+ index+ " of b is : "+ b.charAt(index));
		// converts the string to lowercase
	    System.out.println(" toLowerCase() of a : " + a.toLowerCase());
	    System.out.println(" toLowerCase() of b : " + b.toLowerCase());
        // converts the string to uppercase
	    System.out.println(" toUpperCase() in a : " + a.toUpperCase());
	    System.out.println(" toUpperCase() in b : " + b.toUpperCase());
        // replaces the character 't' with 'T'
	    System.out.println("Using the replace(): " + b.replace('t', 'T'));


	}

}
