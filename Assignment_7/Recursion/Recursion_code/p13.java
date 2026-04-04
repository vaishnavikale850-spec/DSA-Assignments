import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		int index = 0;
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter num :");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter target : ");
		int target = sc.nextInt();
		
		boolean op = f(arr, index, target);
		System.out.print(op);
	}
	static boolean f(int arr[], int index, int target){
		if(index == arr.length){
			return false;
		}
		if(arr[index] == target){
			return true;
		}
		
		return f(arr, index+1, target);
	}
}