package mccp;

import java.util.*;

public class greedy16 {
	public static void mice_hole(int[] m,int[] h,int n)
	{
		int s=0;
		Arrays.sort(m);
		Arrays.sort(h);
		for(int i=0;i<n;i++)
		{
			s=Math.max(Math.abs(m[i]-h[i]), s);
		}
		System.out.print(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] m=new int[n];
		int[] h=new int[n];
		for(int i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			h[i]=sc.nextInt();
		}
		mice_hole(m,h,n);
	}

}
