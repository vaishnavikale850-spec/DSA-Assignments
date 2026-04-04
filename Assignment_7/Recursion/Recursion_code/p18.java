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
		boolean op = f(arr, index);
		System.out.print(op);
	}
	static boolean f(int arr[], int index){
		if(index == arr.length-1){
			return true;
		}

		boolean isUnique = f(arr, index+1);

		if(arr[index] == arr[index+1]){
			return !(isUnique);
		}else{
			return isUnique;
		}
	}
}