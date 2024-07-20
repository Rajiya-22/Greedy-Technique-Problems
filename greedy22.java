package mccp;

import java.util.*;

public class greedy22 {
	public static void goldcoins(int[] a,int n)
	{
		PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++)
		{
			p.add(a[i]);
		}
		while(p.size()>1)
		{
			int n1=p.poll();
			int n2=p.poll();
			if(n1!=n2)
			{
				p.add(n1-n2);
			}
		}
		int x=p.poll();
		System.out.print(x);
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
		goldcoins(a,n);
	}

}
