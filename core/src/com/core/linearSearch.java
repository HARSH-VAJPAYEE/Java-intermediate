import java.util.Scanner;  
   
public class linearSearch   
{  
  public static void main(String args[])  
  {  
    int c, num, search, array[];  
   
    Scanner s = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    num = s.nextInt();   
    array = new int[num];  
   
    System.out.println("Enter those " + num + " elements");  
   
    for (c = 0; c < num; c++) { 
      array[c] = s.nextInt();  }
   
    System.out.println("Enter value to find");  
    search = s.nextInt();  
   
    for (c = 0; c < num; c++)  
    {  
      if (array[c] == search)    
      {  System.out.println(search + " is present at location " + (c + 1) + ".");  
          break;  }  }  
   if (c == num){ 
      System.out.println(search + " isn't present in array.");}
  }  
}  
