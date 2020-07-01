package code.chef;

import java.util.Scanner;

public class Sifting {
	
	static boolean isPrime(int n) {
		if(n==1)
			return false;
		if(n<=3)
			return true;
		if(n%2==0 || n%3==0)
    		return false;
    	for(int j=5;j*j<=n;j+=6)
    		if(n%j==0 || n%(j+2)==0)
    			return false;
    	return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = 0;
        for(int i=2;i<=n;i++) {
        	if(isPrime(i))
        		ans++;
        }
        System.out.println(ans);
	}

}
