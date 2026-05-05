/*21. Two Sum problem (find pair with given sum)
Problem: Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
Input Example: nums = [2, 7, 11, 15], target = 9
Output Example: [0, 1] 
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
		 int [] op = new int[2];
		System.out.print("Enter target : ");
		int target = sc.nextInt();
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] + arr[j] == target){
					op[0] = i;
					op[1]= j;
				}
			}
		}
		System.out.println("Indices are "+ Arrays.toString(op));
	}
}
