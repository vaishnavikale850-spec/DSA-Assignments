import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array ");

		System.out.print("Enter size of array 1:");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
	
		for(int i = 0;i<arr1.length; i++){
			System.out.print("Enter num : ");
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter second array ");

		System.out.println("Enter size of array 2:");
		
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
		int op = 0;
		
		for(int i = 0;i<arr2.length; i++){
			System.out.print("Enter num : ");
			arr2[i] = sc.nextInt();
		}
		for(int i = 0; i<arr1.length; i++){
			int num = arr1[i];
			for(int j = 0; j<arr2.length; j++){
				if(arr1[i] != arr2[j]){
					op = num;
					
				}
			}			
		}
		System.out.println(op);
	}
}