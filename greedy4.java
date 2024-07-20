package mccp;

import java.util.Arrays;
import java.util.Scanner;

public class greedy4 {
	public static void operations(int[] a,int n) {
		Arrays.sort(a);
		int m=0,c=0;
		if(n%2!=0)
		{
			m=a[n/2];
		}
		else
		{
			m=a[n/2-1];
		}
		for(int i=0;i<n;i++)
		{
			c=c+Math.abs(a[i]-m);
		}
		System.out.print(c);
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
		operations(a,n);
	}

}
