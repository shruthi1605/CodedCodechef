package code.chef;

import java.util.Scanner;

public class MandN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0) {
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		String N = Integer.toString(n);
		int mPlusn = m+n;
		String MPlusN = Integer.toString(mPlusn);
		if(N.length() == MPlusN.length())
			System.out.println(n);
		else 
			System.out.println(mPlusn);
		}
	}

}
