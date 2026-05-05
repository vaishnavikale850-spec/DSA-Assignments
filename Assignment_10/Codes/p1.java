/*1. Take array input from user and print it
Problem:
Write a program that takes an integer `n` as input, followed by `n` integers, stores them in an array, and then prints the elements of the array.
Input Example:
5
1 2 3 4 5
Output Example:
1 2 3 4 5
*/

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
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + "  ");
		}
	}
}

