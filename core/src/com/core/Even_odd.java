import java.util.Scanner;
public class Even_odd{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER NUMBER :: ");
        int a=s.nextInt();
        if (a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}


