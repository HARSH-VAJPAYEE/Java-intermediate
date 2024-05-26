import java.util.Scanner;
public class add1{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.print("ENTER YOUR FIRST NUMBER ::  ");
        int a =s.nextInt();
        System.out.print("ENTER YOUR SECOND NUMBER :: ");
        int b=s.nextInt();
        int c=a+b;
        System.out.print("sum of two numbers :: "+c);
    }
}

