package mccp;

import java.util.*;

public class greedy12 {
	public static void stock(int[] a,int n) {
		int maxsofar=0,maxi=0;
		for(int i=n-1;i>=0;i--)
		{
			if(a[i]>maxsofar)
			{
				maxsofar=a[i];
//				maxi=maxi+Math.abs(maxsofar-a[i]);
			}
			else
			{
				maxi=maxi+Math.abs(maxsofar-a[i]);
			}
		}
		System.out.print(maxi);
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
		stock(a,n);
	}

}
