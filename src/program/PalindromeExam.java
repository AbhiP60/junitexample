package program;

import java.util.Scanner;

public class PalindromeExam {
	public static void main(String[] args) {
		
	try (Scanner x = new Scanner(System.in)) {
			System.out.println("enter the string/number");
			String next = x.next();
		
			int l = next.length();
			String rev="";
			for(int i=l-1;i>=0;i--) {
				rev= rev+next.charAt(i);
			}
			if(next.equals(rev)) {
				System.out.println("the given string is palindrome");
			}else {
				System.out.println("Not palindrome");
			}
		}

		}
   
	}

	

