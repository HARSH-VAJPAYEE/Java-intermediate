public final class ImmutableClass {
   private String laptop;
   public String getLaptop() {
      return laptop;
   }
   public ImmutableClass(String laptop) {
      super();
      this.laptop = laptop;
   }
}
public class Main {
   public static void main(String args[]) {
      ImmutableClass immutableClass = new ImmutableClass("Dell");
      System.out.println(immutableClass.getLaptop());
   }
}
