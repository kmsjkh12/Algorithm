import java.io.*;
import java.util.*;



class Main {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int arr [] =new int [N];
		boolean check = false;
		for(int i = 0 ; i< N ; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] != 0) {
				check=true;
			}
		}

		int start = 0;
		int end = X-1;
		int max = 0;
		int count =0;
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += arr[i];
		}
		
		while (true) {
			if(max<sum) {
				max=sum;
				count=1;
			}
			else if(max==sum) {
				count++;
			}
			
			start++;
			end++;
			if(end==N) {
				break;
			}
			sum = sum - arr[start-1]  +arr[end];
		
			
		
			
			
			
		}
		
		if(!check) {
			System.out.print("SAD");
		}
		else {
		System.out.println(max);
		System.out.print(count);
		}
	}
}	