import java.util.*;
class InsertionSort{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i = 0; i<size; i++){
			System.out.print("Enter num: ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		for(int i = 1; i<size; i++){
			int current = arr[i];
			int left = i-1;
			while( left >= 0 && arr[left] > current){
				arr[left+1] = arr[left];	
				left--;
			}
			arr[left+1] = current;
		}
		System.out.println(Arrays.toString(arr));
	}	
}