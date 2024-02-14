package com.prowings.enumumeration;

import java.util.Scanner;

public class EnumDayTest {

	public static Day day;

	public EnumDayTest() {

	}

	public EnumDayTest(Day day) {
		this.day = day;
	}

	public static  void dayFeelsLike() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad!!!");
			break;
		
		case FRIDAY:
			System.out.println("Friday's are better!!");
			break;
		
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best!!");
			break;
		
		default:
			System.out.println("Midweek days are so so!!!");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day!!!");
		String input = sc.next();
		
		EnumDayTest e1 = new EnumDayTest(Day.valueOf(input));
		e1.dayFeelsLike();
		

	}
}
