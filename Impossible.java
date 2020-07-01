package code.chef;

import java.util.Scanner;

public class Impossible {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Integer.bitCount(n));
	}

}
