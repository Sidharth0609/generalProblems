package problems;

import java.util.Scanner;

public class InverseOfAnArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
		}
		int[] rev=inverse(a);
		for(int val: rev) {
		System.out.println(val);
		}
		scn.close();
	}
	public static int[] inverse(int[] a) {
		int[] inv=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int v=a[i];
			inv[v]=i;
		}
		return inv;
	}

}
