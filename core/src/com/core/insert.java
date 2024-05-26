public class insert {
	public static void main(String args[] ){
		int[] a = {1,2,3,4,5,6,7,8,9};
		abc(a, 4, 40);
		
	}
	
	public static void abc(int[] a, int pos, int ele) {
		int[] b = new int[10];
		int j = 0;
		boolean indexFound = false;
		for (int i = 0; i < a.length;) {
			if(i == pos && indexFound == false) {
				b[j] = ele;
				indexFound = true;
			} else if(indexFound) {
				b[j] = a[i];
				i++;
			}
			j++;
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	public void rotate(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			
		}
	}
}
