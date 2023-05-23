
import java.io.*;
import java.util.*;



public class Main {

	public static void main(String[] args) throws IOException{
		Scanner sc =new Scanner (System.in);

		int x, y, h;

		while(true) {
			x= sc.nextInt();
			y= sc.nextInt();
			h= sc.nextInt();
			
			int MAX= Math.max(x, Math.max(y,h));
			
			if(x==0 && y==0 && h==0) {
				break;
			}
			if(MAX==x) {
				int sum = y+h;
				if(MAX>=sum) {
					System.out.print("Invalid");
					continue;
				}
			}
			
			if(MAX==y) {
				int sum = x+h;
				if(MAX>=sum) {
					System.out.print("Invalid");
					continue;
				}
			}
			if(MAX==h) {
				int sum = y+x;
				if(MAX>=sum) {
					System.out.println("Invalid");
					continue;
				}
			}
			if( x==y && y==h && h==x) {
				System.out.println("Equilateral");
				continue;
			}
			if (x==y || y==h || x==h ) {
				System.out.println("Isosceles");
				continue;
			}
			if(x!=y && y!=h && x!=h) {
				System.out.println("Scalene");
				continue;
			}
		}
		
	}


	
}
