import java.util.*;
class adding{
	int sum;
	public void add(int a,int b){
		sum=a+b;
		System.out.println("sum :"+sum);}
}

public class add{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		adding add1 =new adding();
		System.out.print("first no. :");
		int firstno=sc.nextInt();
		System.out.print("Second no. :");
		int secondno=sc.nextInt();
		add1.add(firstno, secondno);
}}
