import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int [9];
		int sum = 0;
		for(int i =0; i < 9 ;i ++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			if(i<  8) {
				st = new StringTokenizer(br.readLine());
			}
		}
		for(int i = 0 ; i < 8; i++) {
			for(int j = i+1; j< 9 ; j++) {
				if(sum - arr[i] - arr[j] ==100) {
					arr[i] =0;
					arr[j] =0;
					Arrays.sort(arr);
					for (int k  = 0; k < 9; k++) {
						if(arr[k] != 0) {
							System.out.println(arr[k]);
						}
					}
                    return;
				}
			}
		}
		
	}
}