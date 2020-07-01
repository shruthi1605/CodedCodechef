package code.chef;

import java.util.Scanner;

public class Covid19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

        while(t-- > 0){
        	int n = sc.nextInt();
        	int a[] = new int[n+1];
        	for(int i=0;i<n;i++) {
        		a[i]=sc.nextInt();
        	}
        	int flag=1;
        	for(int i=0;i<n;i++) {
        		if(a[i]==1) {
        			i+=1;
        			int c=5;
        			while(c-->0 && i<n) {
        				if(a[i++]==1) {
        					flag=0;
        					break;
        				}
        			}
        			if(flag!=1)
        				break;
        			i--;
        		}
        	}
        	if(flag==1)
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        }
	}

}
