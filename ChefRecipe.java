package code.chef;

import java.util.Scanner;

public class ChefRecipe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

        while(t-- > 0){
        	int n = sc.nextInt();
        	Integer p[] = new Integer[n];
        	int minf = Integer.MAX_VALUE;int sum=0;
        	for(int i=0;i<n;i++) {
        		p[i]=sc.nextInt();
        		
        	}
        	for(int i=0;i<n;i++) {
        		sum+=p[i];
        		minf=Math.min(minf, p[i]);
        	}
        	if(minf==1)
        		System.out.println("-1");
        	else
        		System.out.println(sum-minf+2);
        }
	}

}
