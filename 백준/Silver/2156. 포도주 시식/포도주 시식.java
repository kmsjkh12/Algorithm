import java.io.*;
import java.util.*;

public class Main {
	static int arr [];
	static int dp [];
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		arr = new int [10001];
		dp = new int [10001];
		for(int i = 0 ; i < n ; i++) {
			arr[i]=sc.nextInt();
		}
		dp[0]=arr[0];
		dp[1]=arr[0]+arr[1];
		dp[2]= Math.max(dp[1],Math.max(arr[0]+arr[2],arr[1]+arr[2]));
		for(int i =3 ;i <n;i++) {
			dp[i]= Math.max(dp[i-1],Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
		}
		System.out.print(dp[n-1]);
		
	}
}