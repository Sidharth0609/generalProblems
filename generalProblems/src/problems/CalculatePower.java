package problems;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int x=scn.nextInt();
		int n=scn.nextInt();
		int power=power(x,n);
		System.out.println(power);
		scn.close();

	}

	public static int power(int x,int n) {
		if(n==1) {
			return x;
		}
		int power=x*power(x,n-1);
		return power;
	}
}
