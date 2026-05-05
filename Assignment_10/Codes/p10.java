/* 10. Copy array elements to another array
Problem: Given an array `nums`, create a new array `new_nums` of the same size and copy all elements from `nums` to `new_nums`. Print the new array.
Input Example: [1, 5, 9, 13]
Output Example: [1, 5, 9, 13]
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
		int [] new_arr = new int[n];
		for(int i = 0; i<arr.length; i++){
			new_arr[i] = arr[i];
		}
		System.out.println("Input array : " + Arrays.toString(new_arr));
		System.out.println("Output array : "+ Arrays.toString(new_arr));
	}
}
