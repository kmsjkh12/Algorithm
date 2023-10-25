import java.util.*;
import java.io.*;

public class Main {
	public static int N,M,X;
	public static String [][] map;	
	public static Queue<int [] > q;
	public static int dx [] = {-1,0,1,0};
	public static int dy [] = {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		map = new String [N][M];
		q = new LinkedList<>();
	
		
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j = 0 ; j < M; j++) {
				map[i][j]=line.substring(j,j+1);
			}
		}	
		
		int time = 0;
		while(time++ < X) {
			if(time%2==0) {
				allBoom();
			}
			if(time%2 ==1) {
				fireBoom();
			}
		}
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < M; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println("");
		}
	}
	
		public static void allBoom() {
			for(int i = 0 ; i < N;i++) {
				for(int j = 0 ; j < M; j++) {
					if(map[i][j].equals("O")) {
						q.add(new int[] {i,j});
					}
					map[i][j]= "O";
				}
			}	
		}
		
		public static void fireBoom() {
			while(!q.isEmpty()) {
				int [] now = q.poll();
				map[now[0]][now[1]]= ".";
				for(int i = 0 ; i < 4; i++) {
					int nx = now[0] + dx[i];
					int ny = now[1] + dy[i];
					if(nx>=0 && nx <N && ny >=0 && ny <M  && map[nx][ny].equals("O")) {
							map[nx][ny]=".";
						
					}
					
				}
			}
		}

	}
