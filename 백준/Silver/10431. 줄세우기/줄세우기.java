import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String [] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		
		int count = sc.nextInt();
		int studentcount = 20;
		for(int i = 0 ; i < count; i++) {
			int num = sc.nextInt();
			
			int arr [] = new int [20];
			
			int max = 0;
			int student = 1;
			int back = 0;
			int maxindex =0;
			for(int j =0 ; j< studentcount; j++) {	
				arr[j] = sc.nextInt();
			}
			
			max = arr[0];
			
			for(int j =1 ; j < studentcount; j++) {
				
				for(int k = j-1; k>= 0; k--) {
					if(arr[k]>arr[j]) {
						back++;
					}
				}
			}
			System.out.print(num+ " ");
			System.out.println(back);
		}
	}	
}
