package program;

import java.util.Scanner;

public class evenodd{
	
public static void main(String[] args) {
	
	try (Scanner x = new Scanner(System.in)) {
		System.out.println("Enter the number...");
		int nxt = x.nextInt();
		
		if(nxt % 2==0) {
			System.out.println("the number is even");
		}else {
			System.out.println("the number is odd");
		}
		
	}
	
		
	
	
	
} 
}






