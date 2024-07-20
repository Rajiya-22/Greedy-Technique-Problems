package mccp;
import java.util.*;
public class greedy1 {
	public static void minop(int[] a,int[] b,int n)
	{
		int op=0;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<n;i++)
		{
			op=op+Math.abs(a[i]-b[i]);
		}
		System.out.print(op);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		minop(a,b,n);
	}

}
