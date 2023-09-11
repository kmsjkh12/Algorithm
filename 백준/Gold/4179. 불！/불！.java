import java.io.*;
import java.util.*;



class Main {
	
	static Character[][] map;
	static Queue<int []> jihun = new LinkedList<>();
	static Queue<int []> fire = new LinkedList<>();
	
	static boolean jihunvisited[][];
	static boolean firevisited[][];
	
	static int dx [] = {-1,0,1,0};
	static int dy [] = {0,-1,0,1};
	
	static int R;
	static int C;
	
	public static void main (String[]args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new Character[R][C];
		firevisited = new boolean [R][C];
		jihunvisited = new boolean [R][C];
		for(int i = 0 ; i < R ; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			
			for (int j = 0 ; j <C; j++) {
				map[i][j]=line.charAt(j);
				
				if(map[i][j]=='F') {
					fire.offer(new int [] {i,j});
					firevisited[i][j]=true;
				}
				else if(map [i][j] =='J') {
					jihun.offer(new int [] {i,j});
					jihunvisited[i][j]=true;
				}
			}
		}
		bfs();
        System.out.println("IMPOSSIBLE");

	}

	private static void bfs() {
		// TODO Auto-generated method stub
		int time = 0;
		
		while(!jihun.isEmpty()) {
			int fireS = fire.size();
			int jihunS = jihun.size();
			
			
			for(int i = 0 ; i < fireS ; i++) {
				int [] fireN = fire.poll();
				
				for(int j = 0 ; j < 4; j++) {
					int nx = fireN[0] + dx[j];
					int ny = fireN[1] + dy[j];
					
					//불이 없는곳으로 사방향으로 번져야함 
					if(!isIn(nx,ny) ||  firevisited[nx][ny] || map[nx][ny] =='#' )
						continue;
					
					firevisited[nx][ny]=true;
					map[nx][ny]='F';
					fire.offer(new int [] {nx,ny});
				}
			}
			for(int i = 0 ; i < jihunS ; i++) {
				int [] jihunN = jihun.poll();
				
				for(int j = 0 ; j < 4; j++) {
					int nx = jihunN[0] + dx[j];
					int ny = jihunN[1] + dy[j];
					
					if(!isIn(nx,ny)) {
						time++;
						System.out.println(time); 
						System.exit(0);
						
					}
					 
					if(jihunvisited[nx][ny] || map[nx][ny] !='.' )
						continue;
					
					jihunvisited[nx][ny]=true;
					jihun.offer(new int [] {nx,ny});
				}
			}
			
			time++;
		}
		
	}
	 private static boolean isIn(int x, int y){
	        return 0<=x && x<R && 0<=y && y<C;
	    }
}


// 1 2 4 8 9 