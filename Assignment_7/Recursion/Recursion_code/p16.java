import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter num :");
			arr[i] = sc.nextInt();
		}
		int index = 0;
		int op = f(arr, index);
		System.out.print(op);
	}
	static int f(int[]arr, int index){
		if(arr.length-1 == index){
			return index;
		}
		int smallIndex =  f(arr, index+1);
		if(arr[index] < arr[smallIndex]){
			return index;
		}
		else{
			return smallIndex;
		}
	}
}