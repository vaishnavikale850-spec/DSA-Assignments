/*19. Remove duplicates from sorted array
Problem: Given a sorted array `nums`, remove the duplicates in-place such that each unique element appears only once. Return the new length of the array.
Input Example: [1, 1, 2, 2, 3, 4]
Output Example: 4 (The array becomes [1, 2, 3, 4] after modification)*/

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
		System.out.println("Array: " + Arrays.toString(arr));
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
		}
		System.out.println(arr.length - count);
	}
}