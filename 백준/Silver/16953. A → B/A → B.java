import java.util.*;
import java.io.*;

public class Main {
	public static int N,M,K;
	
	public static int map[][];
	public static boolean visited[][];
	public static int dx [] = {-1,0,1,0};
	public static int dy [] = {0,-1,0,1};
	public static int min = Integer.MAX_VALUE;
	public static int you = 0;
	public static int count = 0;
	public static boolean flag= false;
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
	
		N = Integer.parseInt(st.nextToken());
		
		M = Integer.parseInt(st.nextToken());
		dfs(N,1);
		if(min == Integer.MAX_VALUE) {
		System.out.print("-1");
		}
		else {
			System.out.print(min);
		}
	}
	
	
	private static void dfs(long n,int count) {
		if(n==M) {
			min = Math.min(count, min);
			return;
		}
		
		else if(n>M) {
			return;
		}
		
		else {
			dfs(n*2, count+1);
			dfs(convert(n), count+1);
		}
	}
	
	
	private static long convert(long s) {
		
		String line = Long.toString(s);
		line+="1";
		return Long.parseLong(line);
		
	}
}