package mccp;
import java.util.*;
public class greedy9 {
	public static void police(char[] a,int n,int k) {
		ArrayList<Integer> p=new ArrayList<>();
		ArrayList<Integer> t=new ArrayList<>();
		int y=0,r=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]=='p')
			{
				p.add(i);
				y++;
			}
			else
			{
				t.add(i);
				r++;
			}
		}
		int pi=0,ti=0,c=0;
		while(pi<y && ti<r)
		{
			if(Math.abs(p.get(pi)-t.get(ti))<=k)
			{
				pi++;
				ti++;
				c++;
			}
			else if(Math.abs(p.get(pi)-t.get(ti))>k)
			{
				ti++;
			}
				
		}
		System.out.print(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] a=new char[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		int k=sc.nextInt();
		police(a,n,k);
	}

}
