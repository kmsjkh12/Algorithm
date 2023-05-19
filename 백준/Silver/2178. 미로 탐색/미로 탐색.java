import java.io.*;
import java.util.*;


public class Main {
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0 , -1};
	static boolean visited [][];
	static int arr [][];
	static int count;
	static int N,M;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr= new int[N][M];
		visited = new boolean[N][M];
		for(int i = 0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j=0; j<M; j++) {
				arr[i][j]= Integer.parseInt(line.substring(j,j+1));
			}
		}
		BFS(0,0);

		System.out.println(arr[N-1][M-1]);
	}
	private static void BFS(int w, int h) {
		// TODO Auto-generated method stub
		Queue<int []> q = new LinkedList<>();
		q.add(new int[] {w,h});
		
		while(!q.isEmpty()) {
			int [] temp = q.poll();
			for(int i = 0 ; i<4;i++) {  //상하좌우 검
				int temp_x= temp[0]+dx[i];
				int temp_y= temp[1]+dy[i];
				
				if(temp_x >= 0 && temp_y >=0 && temp_x<N && temp_y < M) {
					if(arr[temp_x][temp_y]!=0 && !visited[temp_x][temp_y]) {
						visited[temp_x][temp_y]= true;
						arr[temp_x][temp_y] = arr[temp[0]][temp[1]]+1;
						q.add(new int[] {temp_x,temp_y});
					}
				}
			}
		}
		
	}
	

	
}
