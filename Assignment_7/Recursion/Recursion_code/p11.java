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
		int op = f(arr, index);
		System.out.print(op);
	}
	static int f(int arr[], int index){
		if(index == arr.length-1){
			return arr[index];
		}
		if(arr[index] > arr[index+1]){
			int temp = arr[index];
			arr[index] = arr[index+1];
			arr[index+1] = temp
		}
		return f(arr, index+1);
	}
}