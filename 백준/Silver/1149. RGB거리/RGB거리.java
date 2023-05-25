import java.io.*;
import java.util.*;



public class Main {
	static int arr [][];
	static int dp [][];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		dp= new int [n+1][3];
		for(int i = 1 ; i<=n ;i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			dp[i][0]= Math.min(dp[i-1][1],dp[i-1][2]) +r;
			dp[i][1]= Math.min(dp[i-1][0],dp[i-1][2]) +g;
			dp[i][2]= Math.min(dp[i-1][0],dp[i-1][1]) +b;//red
		}
		System.out.print(Math.min(dp[n][0],Math.min(dp[n][1],dp[n][2]) ));
	}
	
}