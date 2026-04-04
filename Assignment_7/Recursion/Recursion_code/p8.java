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
		int min = f(arr, index+1);
		if(arr[index] > min){
			return min;
		}
		else{
			return arr[index];
		}
	}
}