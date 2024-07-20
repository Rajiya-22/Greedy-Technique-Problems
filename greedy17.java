package mccp;

import java.util.Scanner;

public class greedy17 {
	public static void container(int[] a,int n)
	{
//		int s=0;
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				s=Math.max(s, Math.abs(i-j)*Math.min(a[i], a[j]));
//			}
//		}
//		int l=0,r=n-1;
//		while(l<r)
//		{
//			if(s<Math.min(a[l], a[r])*Math.abs(l-r))
//			{
//				s=Math.min(a[l], a[r])*Math.abs(l-r);
//			}
//			else if(s>Math.min(a[l], a[r])*Math.abs(l-r))
//			{
//				l++;
//			}
//			else
//			{
//				r--;
//			}
//		}
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
		container(a,n);
	}

}
