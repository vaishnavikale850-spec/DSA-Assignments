/* 17. Reverse an array in place
Problem: Given an array of integers `nums`, reverse the array without using any extra space.
Input Example: [1, 2, 3, 4]
Output Example: [4, 3, 2, 1]
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
		System.out.println("Array: " + Arrays.toString(arr));
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			right--;
			left++;
		}
		System.out.println("Reverse array: "+ Arrays.toString(arr));
	}
}