package program;

import java.util.Scanner;

public class ReverseString {
	

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String....");
			String next = sc.next();
			int length = next.length();
			String rev="";
			for(int i=length-1;i>=0;i--) {
				rev=rev+next.charAt(i);
			}
			System.out.println(rev);
		}
		
	}
	
}
