import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		int index = 1;
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter num :");
			arr[i] = sc.nextInt();
		}
		int op = f(arr, index);
		System.out.print(op);
	}
	static int f(int arr[], int index){
		if(arr.length % 2 == 0){
			if(index == arr.length-1){
			return arr[index];
			}
		}
		else{
			if(index == arr.length){
				return 0;
			}
		}
		return arr[index]+f(arr, index+2);
		
	}
}