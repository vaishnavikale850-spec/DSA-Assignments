/* 2. Print array in reverse order
Problem: Given an array `nums`, print its elements in reverse order.
* **Input Example: [1, 2, 3, 4, 5]
Output Example: 5 4 3 2 1
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
		for(int i = n-1; i>=0; i--){
			System.out.print(arr[i] + "  ");
		}
	}
}

