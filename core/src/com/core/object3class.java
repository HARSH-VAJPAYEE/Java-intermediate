public class object3class {
  
  static void myStaticMethod() {
    System.out.println("hi from my static");
  }

  
  public void myPublicMethod() {
    System.out.println("hello");
  }

  
  public static void main(String[] args) {
    myStaticMethod(); 
    

    object3class myObj = new object3class(); 
    myObj.myPublicMethod(); 
  }
}
