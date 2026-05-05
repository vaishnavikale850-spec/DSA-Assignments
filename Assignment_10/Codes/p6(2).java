/*  6. Print elements at even and odd indices
Problem:  Given an array of integers `nums`, print all elements located at even indices and all
elements located at odd indices.
Input Example: [10, 20, 30, 40, 50]
Output Example:
Elements at even indices: 10 30 50
Elements at odd indices: 20 40
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
		System.out.print("Elements at even indices are " );
		for(int i = 0; i<arr.length; i+=2){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("Elements at odd indices are " );
		for(int i = 1; i<arr.length; i+=2){
			System.out.print(arr[i] + " ");
		}
	}
}
