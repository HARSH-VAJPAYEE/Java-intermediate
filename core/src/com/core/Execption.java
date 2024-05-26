public class Execption {
	public static void main(String[] args) {
		//String name;
		try {
			Execption.getRuntimeException(Execption.getResult(40, 2));
			//Execption.getResult(4,2);
			//Execption.getName();
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static int getRuntimeException(int i) throws ArithmeticException, NumberFormatException {
		System.out.println(i);
		if(i == 20) {
		 throw new ArithmeticException("my created xception");
		}
		return i;
		
	}
	
	
//	public static String getName() {
//		String name = "Harsh";
//		if(name.equals("Pradeep")) {
//			return name;
//		} else {
//			return name;
//		}
//	}
//	
	public static int getResult(int a, int b) {
		
		return a/b;
	}
}
