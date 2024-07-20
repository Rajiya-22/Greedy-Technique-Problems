package mccp;

import java.util.*;

public class greedy8 {
	public static void candies(int[] a,int n)
	{
		int[] l=new int[n];
		int[] r=new int[n];
		int[] p=new int[n];
		for(int i=0;i<n;i++)
		{
			l[i]=1;
			r[i]=1;
		}
		for(int i=1;i<n;i++)
		{
			if(a[i]>a[i-1])
			{
				l[i]=1+l[i-1];
			}
		}
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]>a[i+1])
			{
				r[i]=1+r[i+1];
			}
		}
		for(int i=0;i<n;i++)
		{
			p[i]=Math.max(l[i], r[i]);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(p[i]+" ");
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
		candies(a,n);
	}

}
