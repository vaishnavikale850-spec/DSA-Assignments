import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean isSame = true;
		
		for(int i=0; i<size; i++){
			System.out.print("Enter num :");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++){
			for(int j = i+1; j<size-1; j++){
				if(arr[i]  == arr[j]){
					isSame = false;
					break;
				}
			}
		}
		System.out.print(isSame);
	}
}