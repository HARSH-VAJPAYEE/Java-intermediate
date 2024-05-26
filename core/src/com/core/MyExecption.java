class Main extends Throwable {
	
}
public class MyExecption {

	public static void main(String[] args) {
		try {
			throw new Main();
		}
		catch (Main ex ) {
			System.out.println("Caught");
		System.out.println(ex.getLocalizedMessage());
		}
		

	}

}
