
import java.io.*;
import java.util.*;



public class Main {
	static Integer [] dp ;
	static int N;
	static int count;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		
		N = sc.nextInt();
		
		for(int i = 0 ; i<N;i++) {
			int t = sc.nextInt();
			dp = new Integer [11];
			
			dp[1]=1;
			dp[2]=2;
			dp[3]=4;
			
			
			for(int j = 4 ; j <= t ; j++) {
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
		System.out.println(dp[t]);
		}
		
		
		
	}
	}