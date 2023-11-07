import java.util.*;
import java.io.*;

public class Main {
	public static int N,M,K;
	
	public static int map[][];
	public static boolean visited[][];
	public static int dx [] = {-1,0,1,0};
	public static int dy [] = {0,-1,0,1};
	public static int me = Integer.MIN_VALUE;
	public static int you = 0;
	public static int count = 0;
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
	
		N = Integer.parseInt(st.nextToken());
		
		M = Integer.parseInt(st.nextToken());
		
		K = Integer.parseInt(st.nextToken());
		
		map= new int [N+1][M+1];
		visited= new boolean[N+1][M+1];
		
		for(int i = 0 ; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			map[s][e]=1;	
		}	
		
		for(int i = 1 ; i < N+1 ; i++) {
			for(int j = 1 ; j < M+1 ; j++) {
				if( !visited[i][j] && map[i][j] == 1 ) {
					count =0;
					dfs(i,j);	
					me= Math.max(me,count);
				}
			}
			
		}	
		System.out.print(me);
	}
	
	
	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		if (visited[x][y]) {
			return;
		}
		count++;
		
		visited[x][y] = true;
		
		for(int i = 0 ; i < 4; i++) {
			int nx = x+dx[i];
			
			int ny = y+dy[i];
			
			if(nx>0 && nx<= N && ny>0 && ny<=M) {
				if(map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs( nx , ny );
				}
			}
		}
		
}}