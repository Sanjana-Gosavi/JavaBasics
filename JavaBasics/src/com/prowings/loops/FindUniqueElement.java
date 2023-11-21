package com.prowings.loops;

import java.util.Arrays;

public class FindUniqueElement {
	
	public static void main(String[] args) {
		
		
		 findUniqueElement();
	}

	public static void findUniqueElement() {
		
		int arr[] = {7,8,9,1,2,7,8,9};
		
		for(int i = 0; i < arr.length;i++)
		{
			int count = 0;
			for(int j = 0;j < arr.length;j++)
			{
				if(arr[j] == arr[i])
					count++;
			}
			if(count == 1)
			{
				System.out.println(arr[i]);
			}
		}
	}
}