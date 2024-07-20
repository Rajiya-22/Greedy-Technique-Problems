package mccp;

import java.util.*;

public class greedy11 {
	public static void maximize(int[] a,int n) {
		Arrays.sort(a);
		int s=0;
		for(int i=0;i<n;i++)
		{
			s=s+(a[i]*i);
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
		maximize(a,n);
	}

}
