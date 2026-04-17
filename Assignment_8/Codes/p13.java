import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int newarr[] = new int[size];
		for(int i = 0; i<arr.length; i++){
			System.out.print("Enter num : ");
			arr[i] = sc.nextInt();
		}
		for(int i =0; i<arr.length; i++){
			int count = 0;
			for(int j =0; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			newarr[i] = count;
		}
		System.out.println(Arrays.toString(newarr));
	}
}