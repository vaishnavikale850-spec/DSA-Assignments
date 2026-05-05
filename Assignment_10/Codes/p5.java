/* 5. Count even and odd numbers in an array
Problem: Given an array of integers `nums`, count and print the total number of even and
odd elements.
Input Example: [1, 2, 3, 4, 5, 6]
Output Example:
Even count: 3
Odd count: 3
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
		int e_count = 0;
		int o_count = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] % 2 == 0){
				e_count++;
			}
			else{
				o_count++;
			}
		}
		System.out.println("Even count is "+e_count);
		System.out.print("Odd count is "+o_count);
	}
}
