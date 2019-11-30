package io.hng.task;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		Demo d =new Demo();
		int n= s.nextInt();
		int j= d.test(n);
		System.out.println(j);
		
	}
	
	public int test(int n) {
		int x=0;
		int i=0;
		if(n==1)
		{
			System.out.println("Sorry! Try anther number");
			return -1;
		}
		else if(n==2) {
			return 1;
		}
		else {
			for(i=2;i<n;i++) {
				if(n%i== 0) {
					x=n/i;
					break;
				}
			}
			System.out.println(i + " Equal Parts each consisting of " + x + " elements");
		}
		
		return i;
		
	}

}
