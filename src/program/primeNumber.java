package program;

public class primeNumber {

		  public static void main(String[] args) {

		    int num = 20;
		    boolean bool = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        bool= true;
		        break;
		      }
		    }

		    if (!bool)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}