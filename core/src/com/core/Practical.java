interface MyInterface
{
   public void method1();
   public void method2();
}
class Practical1 implements MyInterface
{
   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }}
public class Practical{
   public static   void main(String arg[])
   {
	MyInterface obj = new Practical1();
	obj.method1();
	obj.method2();
   }
}