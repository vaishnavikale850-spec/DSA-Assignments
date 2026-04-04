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
		int output = f(arr, index);
		System.out.print(output);
	}
	static int f(int arr[], int index){
		if(index == arr.length-1){
			return arr[index];
		}
		int num = f(arr, index+1);
		int op = 0;
		if(arr[index] > 0 || num>0){
			op = num % 10 + arr[index]%10;
			num/=10;
			arr[index] /= 10;
		}
		return op;
		
	}
}