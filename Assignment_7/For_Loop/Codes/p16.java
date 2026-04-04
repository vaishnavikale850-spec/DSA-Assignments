import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int index = 0;
		int min = 9;
		for(int i=0; i<size; i++){
			System.out.print("Enter num :");
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<size; i++){
			if(arr[i] < min){
				min = arr[i];
				index = i;
			}
		}
		System.out.print(index);
	}
}