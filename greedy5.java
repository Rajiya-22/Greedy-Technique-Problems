package mccp;

import java.util.*;

public class greedy5 {
	public static void cost(int[] a,int n) {
		PriorityQueue<Integer> p=new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			p.add(a[i]);
		}
		int c=0;
		while(p.size()>1)
		{
			int m1=p.poll();
			int m2=p.poll();
			int sum=m1+m2;
			p.add(sum);
			c=c+(sum);
		}
		System.out.print(c);
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
		cost(a,n);
	}

}
