import java.util.*;
import java.io.*;

public class Main {
	static boolean visited [][] ;
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, -1, 0, 1};
	static int M;
	static int N;
	static int arr[][];
	public static void main(String [] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i =0 ; i < count; i++) {
			int bug = 0;
			
			M = sc.nextInt();
			N = sc.nextInt();
			int K = sc.nextInt();
			
			arr= new int [M][N];
			visited = new boolean [M][N];
			for(int j = 0 ; j < K; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				arr[x][y]= 1;	
			}
			
			for(int j = 0 ; j < M; j++) {
				for (int k = 0 ; k < N; k++) {
					if(arr[j][k]==1 && !visited[j][k]) {
						dfs(j,k);
						bug++;
					}
				}
			}
			
		System.out.println(bug);
		}
	}
	
	private static void dfs(int j, int k) {
		if(visited[j][k]) {
			return ;
		}
		visited[j][k]= true;
		
		for(int i = 0; i < 4; i++) {
			int nx = dx[i] + j;
			int ny = dy[i] + k;
			
			if(nx >=0 && nx <M && ny >=0 && ny <N) {
				if(!visited[nx][ny] && arr[nx][ny] ==1) {
					dfs(nx,ny);
				}
			}
			
		
		}
		
	}	
}
