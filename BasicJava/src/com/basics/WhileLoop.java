package com.basics;

public class WhileLoop {

	public static void main(String[] as) {
		int n=Integer.parseInt(as[0]);
		//int n=10;
		System.out.println("forward order");
		int i=1;
		while(i<=n) {
			if(i%5==0) {
				System.out.println(i);
			}
			i++;
			
		}
		System.out.println("reverse order");
		i=n;
		while(i>=1) {
			if(i%5==0) {
				System.out.println(i);
			}
			
		}
		i--;
		

	}

}
