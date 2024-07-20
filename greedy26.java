package mccp;

import java.util.*;

public class greedy26 {
	public static void stacksum(int[] a,int[] b,int[] c)
	{
		int a1=sum(a);
		int a2=sum(b);
		int a3=sum(c);
		int i=0,j=0,k=0;
		while(a1!=a2 || a2!=a3)
		{
		if(a1>=a2 && a1>=a3)
		{
			a1=a1-a[i];
			i++;
		}
		else if(a2>=a3)
		{
			a2=a2-b[j];
			j++;
		}
		else
		{
			a3=a3-c[k];
			k++;
		}
		}
		System.out.print(a1);
	}
	public static int sum(int[] a)
	{
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int[] a=new int[n1];
		int[] b=new int[n2];
		int[] c=new int[n3];
		for(int i=0;i<n1;i++)
		{
				a[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++)
		{
				b[i]=sc.nextInt();
		}
		for(int i=0;i<n3;i++)
		{
				c[i]=sc.nextInt();
		}
		stacksum(a,b,c);
	}

}
