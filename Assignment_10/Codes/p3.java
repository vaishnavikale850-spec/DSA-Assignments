/* 3. Find the sum of all array elements
Problem: Given an array of integers `nums`, find and print the sum of all its elements.
Input Example: [10, 20, 30, 40]
Output Example: 100

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
		for(int i = n-1; i>=0; i--){
			sum += arr[i];
		}
		System.out.print("Sum is "+sum);
	}
}

