package mccp;

import java.util.*;

public class greedy23 {
	public static void truck(int[][] a,int n,int t)
	{
		int s=0;
		Arrays.sort(a,(x,y)->y[1]-x[1]);
		int i=0;
		while(t>0)
		{
			if(a[i][0]<=t)
			{
				s=s+(a[i][0]*a[i][1]);
				t=t-a[i][0];
				i++;
			}
			else if(a[i][0]>t)
			{
				s=s+(a[i][1]*t);
				t=0;
			}
//			int mini=Math.min(t,a[i][0]);
//			s=s+(mini*a[i][1]);
//			i++;
//			t=t-mini;
		}
		System.out.print(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int[][] a=new int[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		truck(a,n,t);
	}

}
