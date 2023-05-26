import java.io.*;
import java.util.*;



public class Main {
	static int arr [];
	static long dp [];
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		dp = new long [91];
		
		dp[0]=0;
		dp[1]=1;
		dp[2]=1;
		dp[3]=2;
		
		
		for(int i=4;i<=n;i++) {
			dp[i]= dp[i-2]+dp[i-1];
		}
		System.out.print(dp[n]);
	}
}