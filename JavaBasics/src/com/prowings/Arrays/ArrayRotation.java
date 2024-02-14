package com.prowings.Arrays;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int index = 1;

		System.out.println(Arrays.toString(rotateRight(nums, index, nums.length)));
		System.out.println(Arrays.toString(rotateLeft(nums, index, nums.length)));

	}

	public static int[] rotateLeft(int[] nums, int index, int length) {
		int[] rotateLeft = new int[length];

		for (int i = 0; i < length; i++) {
			rotateLeft[(i - index + length) % length] = nums[i];
		}
		return rotateLeft;
	}
	

	public static int[] rotateRight(int[] nums, int index, int length) {
		int[] rotateRight = new int[length];

		for (int i = 0; i < length; i++) {
			rotateRight[(index + i) % length] = nums[i];
		}
		return rotateRight;
	}
}
