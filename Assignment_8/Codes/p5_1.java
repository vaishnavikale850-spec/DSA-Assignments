import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int new_size = 0;
		int num = 0;
		for(int i = 0;i<arr.length; i++){
			System.out.print("Enter num : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<arr.length; i++){
			int count = 0;
			for(int j = 0; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(new_size < count){
				new_size = count;	
				num = arr[i];
			}
		}
		int left = 0;
		int right = 0;
		int sizeNew = arr.length - new_size;
		int newArray[] = new int[sizeNew];
		while(right < sizeNew){
			if(newArray[right] == 0 && arr[left] != num){
				newArray[right] = arr[left];
				right++;
			}
			left++;
		}
		System.out.print(Arrays.toString(newArray));
	}
}