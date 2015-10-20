package edu01;

import java.util.Random;

public class Dice 
{
	static int indicate() {
		Random rnd = new Random();
		int value = rnd.nextInt(6)+1;
		return value;
	}
	
	public static void main(String[] args) {
		for (int i=0; i<5; i++){
			System.out.println(indicate());
		}
	}
}
