/* 4. Find the maximum and minimum element
Problem: Given an array of integers `nums`, find and print the maximum and minimum elements in the array.
Input Example: [5, 8, 2, 10, 3]
Output Example: Maximum: 10
				Minimum: 2*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("Max is "+max);
		System.out.print("Min is "+min);
	}
}
