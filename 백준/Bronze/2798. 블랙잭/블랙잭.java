import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int M= sc.nextInt();
		int [] arr = new int [N];
		int sum = 0;
		for(int i = 0 ;i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i< M-2; i++) {
			for(int j = i+1;j<N-1; j++ ) {
				for(int k = j+1 ; k<N; k++) {
					int max = arr[i]+arr[j]+arr[k];
					if(max <=M && sum <max) {
						sum=max;
					}
				}
			}
		}
		System.out.println(sum);
	
	}

	
}

