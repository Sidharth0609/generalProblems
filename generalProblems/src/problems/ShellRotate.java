package problems;

import java.util.Scanner;

public class ShellRotate {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		int s=scn.nextInt();
		int r=scn.nextInt();
		rotateShell(arr,s,r);
		display(arr);
		scn.close();

	}
	public static void rotateShell(int[][] arr,int s,int r) {
	//	int [] oned=fillOnedFromShell(arr,s);
	//	rotate(oned,r);
	//	fillShellFromOned(arr,s,oned);
	}

	public static void rotate(int[] a,int k) {
		k=k%a.length;
		if(k<0) {
			k=k+a.length;
		}
		reverse(a,0,a.length -k -1);
		reverse(a,a.length-k,a.length-1);
		reverse(a,0,a.length-1);
}

	public static void reverse(int[] a,int i,int j) {
		int li=i;
		int ri=j;
		while(li<ri) {
			int temp=a[li];
			a[li]=a[ri];
			a[ri]=temp;
			li++;
			ri--;
		}
	}

	public static void fillOnedFromShell(int[][] arr,int s) {
		
	}
	
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
