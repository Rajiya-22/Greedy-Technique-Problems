package mccp;

import java.util.Arrays;
import java.util.Scanner;

public class greedy24 {
	public static void shelter(int[] a,int[] b,int n)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		int s=0;
		for(int i=0;i<n;i++)
		{
			s=Math.max(s, Math.abs(a[i]-b[i]));
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
		shelter(a,b,n);
	}

}
