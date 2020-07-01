package code.chef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Carsell {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

        while(t-- > 0){
        	int n = sc.nextInt();
        	Integer p[] = new Integer[n];
        	for(int i=0;i<n;i++) {
        		p[i]=sc.nextInt();
        	}
        	Arrays.sort(p,Collections.reverseOrder());
        	int profit = 0;
        	for(int i=0;i<n;i++) {
        		if((p[i]-i)>=0)
        		profit = (profit+p[i]-i)%1000000007;
        		else
        			profit = (profit+0)%1000000007;
        		
        	}
        	System.out.println(profit);
        }
	}

}
