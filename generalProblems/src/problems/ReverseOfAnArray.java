package problems;

import java.util.Scanner;

public class ReverseOfAnArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
		}
		reverse(a);
		for(int val: a) {
			System.out.println(val);
		}
		scn.close();
	}
	public static void reverse(int [] a) {
		int i=0;
		int j= a.length -1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}

}
