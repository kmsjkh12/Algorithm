import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException{

		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st = new StringTokenizer(br.readLine());

	      
	      int T = Integer.parseInt(st.nextToken());
	      int arr [][];
	      int dp [][];
	      
	      for(int i= 0 ; i < T;i++ ) {
	    	  st = new StringTokenizer(br.readLine());
		      int n = Integer.parseInt(st.nextToken());
	    	  arr = new int [2][n+1];
	    	  dp = new int [2][n+1];
	    	  for(int j = 0 ; j < 2 ; j++) {
	    		  st = new StringTokenizer(br.readLine());
	    		  for(int k = 1 ; k <= n ; k++) {
	    			  arr[j][k]= Integer.parseInt(st.nextToken());
	    		  }
	    	 
	    	  }
	    	  dp[0][1] =arr[0][1];
	    	  dp[1][1] = arr[1][1];
	    	 
	    	  for(int j = 2 ; j<=n ;j++) {
	    		  dp[1][j]= Math.max(dp[0][j-1], dp[0][j-2])+arr[1][j];
	    		  dp[0][j]= Math.max(dp[1][j-1], dp[1][j-2])+arr[0][j];
	    	  }
		      System.out.println(Math.max(dp[0][n], dp[1][n]));

	      }
	}  
	
}
