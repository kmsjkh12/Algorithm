import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int [] arr = new int[a];
		
		for (int i = 0 ;i <a; i++) {
			arr[i] =sc.nextInt();
		}
		for (int i = 0 ; i <a-1;i++) {
			for (int j= 0 ; j<a-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
		
}
