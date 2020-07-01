package code.chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Resq {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine());

        while(t-- > 0){
            int n = Integer.valueOf(br.readLine());
            
            int side = (int) Math.sqrt(n);
            
            int i;
            for(i=side;i>=1;i--){
            	
            	if(n%i ==0){
            		break;
            	}
            }
            System.out.println(Math.abs(i-(n/i)));
            
        }
        
	}

}
