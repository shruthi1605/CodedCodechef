package code.chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BreakBricks {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

        while(t-- > 0){
        	
        	int n = sc.nextInt();
        	int s1 = sc.nextInt();
        	int s2 = sc.nextInt();
        	int s3= sc.nextInt();
        	
        	if(n>=s1+s2+s3)
        		System.out.println("1");
        	else if(n>=s1+s2)
        		System.out.println("2");
        	else if(n>=s2+s3)
        		System.out.println("2");
        	else
        		System.out.println("3");
        }
	}

}
