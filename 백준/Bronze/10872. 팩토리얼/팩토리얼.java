import java.util.*;

public class Main{
	static int arr [];
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();
		if( a < 2) {
			System.out.print("1");

		}
		else {
			System.out.print(factorial(a));

		}
	}
	
	public static int factorial(int n) {
		if(n ==1) {
			return 1;
		}
		
		return n *factorial (n-1);
	}
	
}
