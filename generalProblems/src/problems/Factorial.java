package problems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int fact=Factoria(n);
		System.out.println(fact);
		scn.close();
	}
	
	public static int Factoria(int n) {
		if(n==1) {
			return 1;
		}
		int fact=n*Factoria(n-1);
		return fact;
	}
}
