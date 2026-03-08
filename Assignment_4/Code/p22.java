//Time Complexity = O(1)
//Space Complexity = O(1)

class Demo{
	public static void main(String[]args){
		for(int i = 1; i<=4; i++){
			for(int j = 1; j <= 4; j++){
				if(i == 1 || j == 4 || i == 4 || j == 1){
					System.out.print("0");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
			
	}
}