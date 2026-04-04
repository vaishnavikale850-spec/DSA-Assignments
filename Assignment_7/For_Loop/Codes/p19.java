import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		
		for(int i=0; i<size; i++){
			System.out.print("Enter num :");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++){
			while(arr[i]> 0){
				sum+= arr[i] % 10;
				arr[i] = arr[i] / 10;
			}
		}
		System.out.print(sum);
	}
}