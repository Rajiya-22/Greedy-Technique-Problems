package mccp;

import java.util.*;

public class greedy18 {
	public static boolean lemonade(int[] a,int n)
	{
		int five=0,ten=0,twenty=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==5)
			{
				five++;
			}
			else if(a[i]==10)
			{
				ten++;
				if(five>=1)
				{
					five--;
				}
				else
				{
					return false;
				}
			}
			else if(a[i]==20)
			{
				twenty++;
				if(ten>=1 && five >=1)
				{
					ten--;
					five--;
				}
				else if(five>=3)
				{
					five=five-3;
				}
				else
				{
					return false;
				}
			}
		}
		return true;
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
		System.out.print(lemonade(a,n));
	}

}
