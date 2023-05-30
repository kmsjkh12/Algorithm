import java.io.*;
import java.util.*;



public class Main {
	static boolean map[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int arr [] = new int [n];
		int count = 0;
		int start=  0;
		int end = n-1;
		int sum = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i< n ;i++) {
			arr[i]=  Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		st = new StringTokenizer(br.readLine());
		int x=  Integer.parseInt(st.nextToken());
		
		while(end>start) {
			
			sum=arr[start]+arr[end];
			if(sum==x) {
				count++;
			}
			
			if(sum<=x) {
				start++;
			}
			else {
				end--;
			}
		}
		System.out.print(count);
	}
}
