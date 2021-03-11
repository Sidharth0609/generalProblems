package problems;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n= scn.nextInt();
		for(int i=1;i<11;i++) {
			int mult =n*i;
			System.out.println(n + "*" + i +"=" + mult);
		}
		scn.close();

	}

}
