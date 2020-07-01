package code.chef;

import java.util.HashMap;
import java.util.Scanner;

 class Trainset {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- >0) {
			int n=sc.nextInt();
			HashMap<String,int[]> hm= new HashMap<String,int[]>();
			int count = 0;
			while(n-- > 0) {
				String word= sc.next();
				
				if(!hm.containsKey(word)) {
					hm.put(word, new int[2]);
				}
				int bool = sc.nextInt();
				hm.get(word)[bool]++;
			}
			for(String key:hm.keySet())
				count+=Math.max(hm.get(key)[0], hm.get(key)[1]);
			
			System.out.println(count);
		}

	}

}
