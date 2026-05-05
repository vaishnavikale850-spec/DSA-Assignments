/*33. Union of two arrays
Problem: Given two integer arrays `nums1` and `nums2`, return an array of their union. The union should contain each distinct element that appears in either or both arrays.
Input Example: nums1 = [1, 2, 3], nums2 = [2, 4, 5]
Output Example: [1, 2, 3, 4, 5]
*/

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter size of array 2 : ");
		int n2 = sc.nextInt();
		int [] arr1 = new int[n1];
		int [] arr2 = new int[n2];
		for(int i = 0; i<arr1.length; i++){
			System.out.print("Enter element in 1st array : ");
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i<arr2.length; i++){
			System.out.print("Enter element in 2nd array : ");
			arr2[i] = sc.nextInt();
		}

		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2 : " + Arrays.toString(arr2));

		int max1 = 0;
		int max2 = 0;
		for(int i = 0; i<arr1.length; i++){
			if(max1<arr1[i]){
				max1 = arr1[i];
			}
		}	
		for(int i = 0; i<arr2.length; i++){
			if(max2<arr2[i]){
				max2 = arr2[i];
			}
		}
		int max = 0;	
		if(max1 > max2){
			max = max1;
		}	
		else{
			max = max2;
		}
		int union [] = new int[max+1];
		for(int i = 0; i<arr1.length; i++){
			for(int j = 0; j<union.length; j++){
				if(arr1[i] != union[j]){
					union[j] = arr1[i];
				}
			}	
		}
		for(int i = 0; i<arr2.length; i++){
			for(int j = 0; j<union.length; j++){
				if(arr2[i] != union[j] && union[j] == 0){
					union[j] = arr2[i];
				}
			}	
		}
		System.out.println("Union of arrays "+ Arrays.toString(union));
	}
}
