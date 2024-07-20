package mccp;

import java.util.Scanner;

public class greedy6 {
	public static void prodarray(int[] a,int n) {
//		int[] l=new int[n];
//		int[] r=new int[n];
//		int[] p=new int[n];
//		l[0]=1;
//		r[n-1]=1;
//		for(int i=1;i<n;i++)
//		{
//			l[i]=l[i-1]*a[i-1];
//		}
//		for(int i=n-2;i>=0;i--)
//		{
//			r[i]=r[i+1]*a[i+1];
//		}
//		for(int i=0;i<n;i++)
//		{
//			p[i]=l[i]*r[i];
//		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(p[i]+" ");
//		}
		int p=1;
		for(int i=0;i<n;i++)
		{
			p=p*a[i];
		}
		for(int i=0;i<n;i++)
		{
			a[i]=p/a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
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
		prodarray(a,n);
	}

}
