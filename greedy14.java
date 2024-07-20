package mccp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class greedy14 {
	int st,fn;
	public greedy14(int st,int fn) {
		this.st=st;
		this.fn=fn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] s=new int[n];
		int[] f=new int[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			f[i]=sc.nextInt();
		}
		ArrayList<greedy14> arr=new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr.add(new greedy14(s[i],f[i]));
		}
		Collections.sort(arr,(x,y) -> x.st-y.st);
		int i=0,c=1;
		for(int j=1;j<n;j++) {
			if(arr.get(j).st>=arr.get(i).fn) {
				c++;i++;
			}
		}
		System.out.println("No of works can be completed : "+c);
	}

}