import java.util.Scanner;
public class ExecptionHandaling {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
				int a,b,c;
				System.out.print("ENTER THE VALUE OF A: ");
				a=s.nextInt();
				System.out.print("ENTER THE VALUE OF B: " );
				b=s.nextInt();
				c=a/b;
				System.out.println("THE VALUE OF C IS :"+c);
				}		
		catch( ArithmeticException e )
		{
			System.out.println("Sorry WE have a Error "+e);
			
		}
		
		finally {
			System.out.println ("ALL THE BEST FOR FUTURE");
		}
		

	}

}
