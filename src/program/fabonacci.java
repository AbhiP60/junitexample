package program;


public class fabonacci {
	public static void main(String[] args) {
		int i=5;
		int x=0;
		int y=1;
		
		for (i=0;i<=5;i++) {
			int z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
		
	}
	
}
