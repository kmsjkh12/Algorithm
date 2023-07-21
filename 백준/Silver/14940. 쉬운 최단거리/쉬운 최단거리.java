import java.io.*;
import java.util.*;

class Main {
	static boolean visited [][];
	static int [][] count;
	static int dx []= {-1,0,1,0};
	static int dy [] = {0, -1, 0 ,1};
	static int endX;
	static int endY;
	static int N;
	static int M;
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int [][] map = new int [N][M];
		count= new int [N][M];
		visited= new boolean[N][M];
		endX=0;
		endY=0;
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j= 0 ; j < M; j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]==2) {
					endX = i;
					endY = j;  
					visited[i][j]=true;
					//목표지점 
				}
				else if (map[i][j]==0) {
					visited[i][j]= true;
					//갈수없는 지점 
				}
			}
		}
		
		
		for(int i = 0 ; i < N ; i++) {
			for(int j= 0 ; j < M; j++) {
				if(i== endX && j==endY) {
					continue;
				}
				if(!visited[i][j]) {
				}
			}
		}
		dfs(endX,endY);

		for(int i = 0 ; i < N ; i++) {

			
			for(int j= 0 ; j < M; j++) {
				if(!visited[i][j]) {
					count[i][j]=-1;
				}
				System.out.print(count[i][j] + " ");
			}
			System.out.println();

		}
		
		
	}
	private static void dfs(int x, int y) {
		
		Queue <int [] > q = new LinkedList<>();
		q.add(new int [] { x,y});
		// TODO Auto-generated method stub
		
		while(!q.isEmpty()) {
			int [] now = q.poll();
			
			
			for(int i = 0 ; i < 4; i ++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				
				if( nx >= 0 && nx<N && ny >=0 && ny<M) {
					if(!visited[nx][ny]) {
					visited[nx][ny]=true;
					count[nx][ny] = count[now[0]][now[1]]+1;
					q.add(new int [] {nx,ny});
					}
				}
				
				
			}
		}
				
	}
	
}	