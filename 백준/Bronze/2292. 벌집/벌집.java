import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String [] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		
		int a=  sc.nextInt();
		int count = 1;
		int room  =1;
		
		for(int i = 1; i < a; i++) {
			if(room >= a) {
				break;
			}
		
			else {
				room = room + ( 6 * i);
				count++;
			}
		}
		System.out.print(count);
	}
		
		
}
