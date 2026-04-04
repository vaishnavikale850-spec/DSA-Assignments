import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int max = 0;
		for(int i=0; i<size; i++){
			System.out.print("Enter num :");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		for(int i=0; i<size; i++){
			if(arr[i] == max){
				arr[i]= 0;
				break;
			}
		}
		max = 0;
		for(int i=0; i<size; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		System.out.print(max);
	}
}