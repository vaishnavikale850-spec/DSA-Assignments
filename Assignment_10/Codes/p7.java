/*  7. Calculate average of array elements
Problem: Given an array of integers `nums`, calculate and print the average of its elements.
Input Example: [10, 20, 30]
Output Example: 20.0
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter element : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++){
			sum+=arr[i];
		}
		float avg = sum / n;
		System.out.println("Average is " + avg );
	}
}
