import java.io.*;
import java.util.*;

class Main {
	static int arr [];
	static int[] dp;
	public static void main (String[]args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		arr = new int [n+1];
		dp= new int [n+1];
		for(int i = 1 ; i <= n ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i]=0;
		}
			
		int result = 0;
		for(int i = 1; i<=n; i++) {
			dp[i]=1;
			for(int j = 1; j< i;j++) {
				if(arr[i]>arr[j]) {
					dp[i]= Math.max(dp[i], dp[j]+1);
				}
			}
			
			result = Math.max(result, dp[i]);
		}
		System.out.println(result);
		
	}
}

// 1 2 4 8 9 