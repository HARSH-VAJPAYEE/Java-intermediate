public class Pattern {
    public static void main(String[] args) {
        int i=0;
        int j=1;
        int n = i+j;
		for ( i = 0; i<5;i++) {
			for( j= 1;j<=Math.pow(2,i);j++) {
			    if(n<=9) {
			    	System.out.print(n);}
			    else if (n> 9 && n<= 18) {
			    	System.out.print(n-9);}
			    else if (n> 18 && n<=27) {
			    	System.out.print(n-18);
			    }else {
			    	System.out.print(n-27);
			    }
				
				n=n+1;
			}System.out.println();
		}

	}

}
