/* 34. Check if array is palindrome
Problem: Given an array of integers `nums`, return `true` if the array is a palindrome, otherwise return `false`.
Input Example: [1, 2, 3, 2, 1]
Output Example: true*/

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
		boolean isPal = true;	
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			if(arr[left] != arr[right]){
				isPal = false;
				break;
			}
			left++;
			right--;
		}
		System.out.println(isPal);
	}
}
