package mccp;

import java.util.*;

public class greedy2 {
	public static void highprod(int[] a,int n) {
		Arrays.sort(a);
		int lp=a[n-1]*a[n-2]*a[n-3];
		int fp=a[0]*a[1]*a[n-1];
		if(lp>fp)
		{
			System.out.print(lp);
		}
		else
		{
			System.out.print(fp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		highprod(a,n);
	}

}
