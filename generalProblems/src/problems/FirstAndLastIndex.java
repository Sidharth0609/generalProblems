package problems;

import java.util.Scanner;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scn.nextInt();
		}
		int data=scn.nextInt();
		int lo=0;
		int hi=a.length-1;
		int fi=-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(data>a[mid]) {
				lo=mid+1;
			} else if(data<a[mid]) {
				hi=mid-1;
			} else {
				fi=mid;
				hi=mid-1;
			}
		}
		System.out.println("First Index \t"+fi);
		int low=0;
		int high=a.length-1;
		int li=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(data>a[mid]) {
				low=mid+1;
			} else if(data<a[mid]) {
				high=mid-1;
			} else {
				li=mid;
				low=mid+1;
			}
		}
		System.out.println("Last Index \t" + li);
		scn.close();

	}

}
