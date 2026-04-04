import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			System.out.print("Enter num :");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter target :");
		int target = sc.nextInt();
		int max = 0;
	
		for(int i = 0 ; i<size; i++){
			if(arr[i] == target && i > max){
				max = i;
			}
		}
		System.out.print(max);
	}
}