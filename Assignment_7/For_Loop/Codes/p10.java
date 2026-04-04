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
		boolean isPal = true;
		int left = 0;
		int right = arr.length-1;
		while(left < right){
			if(arr[left] != arr[right]){
				isPal = false;
				break;
			}
			left++;
			right--;
		}
		System.out.print(isPal);
	}
}