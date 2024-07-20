package mccp;
import java.util.*;

public class greedy21 {
	public static void maxneg(int[] a,int n,int k)
	{
		int s=0;
		PriorityQueue<Integer> p=new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			p.add(a[i]);
		}
		int i=0;
		while(i<k)
		{
			int t=p.poll();
			p.add(-t);
			i++;
		}
		for(int i1=0;i1<n;i1++)
		{
			s=s+p.poll();
		}
		System.out.print(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		maxneg(a,n,k);
	}

}
