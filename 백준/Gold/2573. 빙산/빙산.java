
import java.io.*;
import java.util.*;



public class Main {
	static boolean [][] visited;
	static int dx[] = {-1,0,1,0};
	static int dy[]= {0,1,0,-1};
	static int N,M;
	static int map[][];
	static int zero [][];
	static int count;
	static int day;
	static int cd;
	public static void main(String[] args) throws IOException{
		Scanner sc =new Scanner (System.in);
		N =sc.nextInt(); 
		M =sc.nextInt(); 
		map = new int [N][M];
		zero = new int [N][M];
		day=0;              //날짜 
		 
							//빙산 입력을 받는다 
		for(int i = 0 ; i<N;i++) {
			for (int j = 0 ; j<M;j++) {
				map[i][j]= sc.nextInt();
				
			}
		}
		
		//빙산의 개수가 2개 이상이면 stop 
		while(true) {
		//녹이고 빼고
		//1년씩 더해줌 
		//빼기 할 빙산을 계산 
		cd =0;
		zero=new int [N][M];
		for(int i = 0 ; i<N;i++) {
			for (int j = 0 ; j<M;j++) {
					if(map[i][j]>0) {
				ice(i,j);
				cd++;
					}
				}
		}
		if(cd ==0) {
			System.out.println("0");
			break;
		}
		// 빼야 할 빙산 개수 구해짐 
		
		
		for(int i = 0 ; i<N;i++) {
			for (int j = 0 ; j<M;j++) {
				minos(i,j);
				}
		}
		//빙산 제거 
		

		day++;
		count = 0;
		visited= new boolean[N][M];
		for(int i = 0 ; i<N;i++) {
			for (int j = 0 ; j<M;j++) {
					if(!visited[i][j] && map[i][j]>0) {
				bfs(i,j);
				count++;
					}
					
				}
		}


		if(count>=2) {
			break;
		}
		
		}
		if(day!=0 && cd!=0) {
		System.out.println(day);
		}
		}
	private static void minos(int i, int j) {
		// TODO Auto-generated method stub
		map[i][j]= map[i][j] - zero[i][j]; 
	}
	
	
	private static void bfs(int x, int y) {
		// TODO Auto-generated method stub
		visited[x][y]=true;
		Queue <int [] > q = new LinkedList<>();
		q.add(new int[] {x,y});
		while(!q.isEmpty()) {
			int [] t = q.poll();

			for(int i = 0 ; i< 4;i++) {
			
			int tx = t[0]+dx[i];
			int ty = t[1]+dy[i];
			if(tx>=0 && ty>=0 && tx<N && ty<M) {
				if(!visited[tx][ty] && map[tx][ty]>0) {
					visited[tx][ty]= true;
					q.add(new int[] {tx,ty});
				}
				}
			}
		}
	
	}
	//얼음 위치 파악 
	private static void ice(int x, int y) {
		int cnt = 0;
		// TODO Auto-generated method stub
		for(int i = 0 ; i< 4;i++) {
			int tx = x+dx[i];
			int ty = y+dy[i];
			if(tx>=0 && ty>=0 && tx<N && ty<M) {
				if(map[tx][ty]<=0) {
				cnt++;
				}
			}
		}
		zero[x][y]= cnt;
	}
	//1년 지남 

	
}
