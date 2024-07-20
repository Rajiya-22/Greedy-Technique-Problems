package mccp;

import java.util.*;

public class greedy25 {
	public static void maxlen(int[][] a,int n)
	{
		int s=0;
		Arrays.sort(a,(x,y)->x[1]-y[1]);
		int i=0,j=1;
		while(i<n && j<=n-1)
		{
			if(a[i][1]<a[j][0])
			{
				s++;
				i++;
				j++;
			}
			else
			{
				
				j++;
			}
		}
		System.out.print(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		maxlen(a,n);
	}

}
