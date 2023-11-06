import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int arr [] = new int [b+1];
		int i = 1;
		int index =1;
		arr[0]= 1;
		while(true) {
			if(index== b+1) {
				break;
			}
			for(int j = 0 ; j <i; j++) {
				arr[index] = arr[index-1]+ i;
				index++;
				if(index== b+1) {
					break;
				}
			}
			i++;
			
		}
		System.out.print(arr[b]-arr[a-1] );
	}
}