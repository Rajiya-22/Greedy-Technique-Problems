package mccp;

import java.util.*;

public class greedy3 {
	public static void tasks(int[] a,int n,int t) {
		int time=0,i=0,task=0;
		Arrays.sort(a);
		while(time<=t)
		{
			time=time+a[i];
			if(time<=t)
			{
				task++;
			}
			i++;
		}
		System.out.print(task);
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
		int t=sc.nextInt();
		tasks(a,n,t);
	}

}
