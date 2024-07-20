package mccp;

import java.util.*;

public class greedy10 {
	public static void jump(int[] a,int n) {
		int last=0;
		for(int i=n-1;i>=0;i--)
		{
			if((a[i]+i)>=last)
			{
				last=i;
			}
		}
		if(last<=0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
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
		jump(a,n);
	}

}
