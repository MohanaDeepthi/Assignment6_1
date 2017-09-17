package Assignment6_1;
//Declare an integer array of size 10. Initialize using for loop with 1 to 10, and print all even numbers from an array.

public class Assignment6_1 {
	public static void main(String args[]){
			System.out.println("Even numbers are :");
			
			int[] arr={10,20,33,45,57,60,70,80,99,100};
		
			for(int a:arr){
				if(a%2==0){
					System.out.print(a+"\t");
				}
				
			}
			
	}

}
