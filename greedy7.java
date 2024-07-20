package mccp;

import java.util.*;

public class greedy7 {
	public static void platforms(int[] a,int[] b,int n) {
		int c=1,i=1,j=0,res=1;
		while(i<n && j<n)
		{
			if(a[i]<=b[j])
			{
				c++;
				i++;
			}
			else if(a[i]>b[j])
			{
				c--;
				j++;
			}
			if(c>res)
			{
				res=c;
			}
		}
		
		System.out.print(res);
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
		platforms(a,b,n);
	}

}
