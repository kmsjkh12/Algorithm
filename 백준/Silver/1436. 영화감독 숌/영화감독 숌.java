import java.io.*;
import java.util.*;

public class Main {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int number =666;
		int count = 1;
		
		while( count !=N) {
			number++;
			if(String.valueOf(number).contains("666")){
				count++;
			}
		}
		System.out.println(number);
	}
}
