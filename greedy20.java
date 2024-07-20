package mccp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class greedy20 {
	public static void minsumarr(int[] a,int[] b,int n)
	{
		int s=0;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<n;i++)
		{
			s=s+(a[i]*b[n-i-1]);
		}
		System.out.print(s);
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
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		minsumarr(a,b,n);
	}

}
