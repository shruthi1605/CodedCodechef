package code.chef;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class chpintu {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while(t-- > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int f[] = new int[n+1];
			int p[]=new int[n+1];
			for(int i =0;i<n;i++)
				f[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				p[i]=sc.nextInt();
			
			HashMap<Integer,Integer> hm = new HashMap<>();
			
			for(int i=0;i<n;i++) {
				if(hm.get(f[i])!=null)
					hm.put(f[i],hm.get(f[i])+p[i]);
				else
					hm.put(f[i],p[i]);
			}
			/*
			 * for(Entry<Integer, Integer> e : hm.entrySet())
			 * System.out.println(e.getValue());
			 */
			System.out.println(Collections.min(hm.values()));
			
		}
		sc.close();
	}

}
