import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("ENTER RADIUS :: ");
		float radius= s.nextFloat();
		double Area=3.14*radius*radius;
		System.out.println("AREA OF CIRCLE  "+ Area );
		 

	}

}
