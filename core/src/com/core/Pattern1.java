import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number ");
		int n= s.nextInt();
		// Pattern 1 
//		for (int i=1;i<=n;i++ ){
//			for (int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		// Pattern 2
//		for (int i=1;i<=n;i++ ){
//			for (int j=i;j>=1;j--) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		for (int i=1;i<=n;i++ ){
//			for (int j=i;j<=n-1;j++) {
//				System.out.print("* ");
//			}
//			for (int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
        
		
		for (int i=1;i<=n;i++ ){
			for (int j=i;j<=n-1;j++) {
				System.out.print("* ");
			}
			for (int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}



	}

}
