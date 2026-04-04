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
		boolean isEven = true;
	
		for(int i = 0 ; i<size-1; i++){
			if(arr[i] % 2 == 1){
				isEven= false;
				break;
			}
		}
		System.out.print(isEven);
	}
}