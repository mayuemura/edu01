package edu01;

import java.io.*;

public class Tax {

	public static void main(String[] args) throws java.io.IOException {
		
		System.out.println("please input price");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int price = Integer.parseInt(in.readLine());

		//String arg = args[0];
		//int price = Integer.parseInt(arg);
		
		int beforeTax = (int)Math.round(price * 1.08);
		int tax = beforeTax - price;
		System.out.println("before tax --> " + beforeTax);
		System.out.println("tax --> " + tax);
	}
}
