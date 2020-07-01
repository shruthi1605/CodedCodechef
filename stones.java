package code.chef;



import java.io.IOException;
import java.util.Scanner;

 public class stones {
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			
			char s[] = new char[101];
			char j[] = new char[101];
			
			j=sc.next().toCharArray();
			s=sc.next().toCharArray();
			
			int n = s.length; int m=j.length;
			int count=0;
			for(int i=0;i<n;i++) {
				for(int k=0;k<m;k++) {
					if(s[i]==j[k]) {
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
