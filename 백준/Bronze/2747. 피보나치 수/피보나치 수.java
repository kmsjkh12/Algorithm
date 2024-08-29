
import java.util.*;

public class Main{
	static int arr [];
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();
		arr= new int [a+1];
		arr[0] = 0;
		if( a >= 2) {
			arr[1]= 1;
			fibo(a+1);
			System.out.print(arr[a]);
		}
		else {
			arr[1]= 1;

			System.out.print(arr[a]);

		}
	}
	
	public static void fibo(int n) {
		
		for(int i = 2 ; i< n; i++) {
			arr[i] =arr[i-1] + arr[i-2];
		}
		
	}
	
}
