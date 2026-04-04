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
		System.out.print("Enter key :");
		int key = sc.nextInt();
		int op = f(arr, index, key);
		System.out.print(op);
	}
	static int f(int arr[], int index, int key){
		if(index == arr.length){
			return -1;
		}
		int lastOccur = f(arr, index+1, key);
	
		if(lastOccur != -1){
			return lastOccur;
		}

		if(key == arr[index]){
			return index;
		}
		
		else{
			return -1;
		}
	}
}