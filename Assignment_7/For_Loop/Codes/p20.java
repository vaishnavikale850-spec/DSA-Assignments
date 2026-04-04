import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean isDec= true;
		
		for(int i=0; i<size; i++){
			System.out.print("Enter num :");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size-1; i++){
			for(int j=i+1; j<size; j++){
				if(arr[i] <= arr[j]){
					isDec = false;
					break;
				}
			}
		}
		System.out.print(isDec);
	}
}