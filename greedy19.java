package mccp;

import java.util.*;

public class greedy19 {
	public static void assign_cookies(int[] s,int[] g,int n,int m)
	{
		Arrays.sort(s);
		Arrays.sort(g);
		int i=0,j=0,c=0;
		while(i<n && j<m)
		{
			if(s[j]>=g[i])
			{
				i++;j++;c++;
			}
			i++;
		}
		System.out.print(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] g=new int[n];
		int[] s=new int[m];
		for(int i=0;i<n;i++)
		{
			g[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			s[i]=sc.nextInt();
		}
		assign_cookies(s,g,n,m);
	}

}
