import java.util.*;
import java.io.*;

class Node {
	int x;
	int y;
	boolean boom;
	int time;
	public Node(int x, int y, boolean boom, int time){
		this.x=x;
		this.y=y;
		this.boom=boom;
		this.time = time;
	}
}
public class Main {
	
	static int testcase;
	static int N;
	static int M;
	
	static int dx [] = {-1,0,1,0};
	static int dy [] = {0,-1,0,1};
	
	static boolean visited[][][];
	
	static int map [][];
	static int count [][];
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		map = new int [N+1][M+1];
		visited = new boolean [N+1][M+1][2];
		count=  new int [N+1][M+1];
		for(int i = 1 ; i <= N ;i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j = 0 ; j < line.length();j++) {
				map[i][j+1] = line.charAt(j) - '0';
			}
		}
		
		dfs(1,1);
	
	}
	
	//1은 못감, 0은 감 
	private static void dfs(int x, int y) {
		Queue <Node> q= new LinkedList<>();
		q.add(new Node(x,y,false,0));
		
		while(!q.isEmpty()) {
			Node now= q.poll();
			int nx = now.x;
			int ny = now.y;
			boolean boom = now.boom;
			int time = now.time +1;
	
			if(nx == N && ny ==M) {
				System.out.print(time);
				return;
				
			}
			for(int i= 0 ; i < 4; i++) {
				int ox = nx+dx[i];
				int oy = ny+dy[i];
				
				if(ox > 0  && ox<=N && oy > 0 && oy <=M ) {
					if(map[ox][oy] == 0) {
						if(!boom && !visited[ox][oy][0]) {
							q.add(new Node(ox,oy,false,time));
							visited[ox][oy][0]= true;
					}
						else if(boom && !visited[ox][oy][1]) {
							q.add(new Node(ox,oy,true,time));
							visited[ox][oy][1]= true;	
						}
					}
					
					else if(map[ox][oy]==1){
						if(!boom ) {
							q.add(new Node(ox,oy,true,time));
							visited[ox][oy][1]= true;
						}
					}
			
				}
			}	
		}
		System.out.print("-1");
	}
	
}
