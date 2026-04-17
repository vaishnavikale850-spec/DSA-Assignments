import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int op = 0;
		for(int i = 0;i<arr.length; i++){
			System.out.print("Enter num : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter k :");
		int k = sc.nextInt();

		int max = 0;
		for(int i =0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		int freq[] = new int[max+1];
		for(int i = 0; i<arr.length; i++){
			freq[arr[i]]++;
		}
		for(int i = 0; i<freq.length; i++){
			if(freq[i] > k){
				op = i;
			}
		}
		System.out.println(op);
	}
}