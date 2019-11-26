package com.basics;

public class ForwardAndReverseOrder {

	public static void main(String[] args) {
		int n=87;
		System.out.println("forward order");
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.println(i);
				
			}
		}
		System.out.println("reverse order");
		for(int i=n;i>=1;i--) {
			if(i%5==0) {
				System.out.println(i);
		}

	}

}

}