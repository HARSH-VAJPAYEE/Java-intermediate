package harshvajpayee;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int flag=0;
		for (int i = 2 ; i<= 100; i++) {
			flag = 0;
			for (int j = 2;j<i;j++) {
				if((i%j)==0) {
					flag=1;
				}
			}
			if (flag==0) {
				System.out.println(i);
			}	
		}
	}
}
