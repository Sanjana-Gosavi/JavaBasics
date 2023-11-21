package com.prowings.basics;

import java.util.Scanner;


public class BoxVolume {

	public static void main(String args[])
	{
		int l;
		int b;
		int h;
		int volume;
		
		System.out.println("Enter the length breadth and height of box:");
		Scanner sc = new Scanner(System.in);
		
		l = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		
		volume = l * b * h;
		System.out.println("Volume of Box is:" +volume);
		
	}
}
