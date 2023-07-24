import java.io.*;
import java.util.*;



class Main {
	static boolean visited [][];
	static int arr [][];
	static int N;
	static int L;
	static int R;
	static int dx [] = { -1,0,1 ,0 };
	static int dy [] = {0 ,-1,0 ,1 };
	static boolean tag;	
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());  //N*N
		L = Integer.parseInt(st.nextToken());  //두 나라 인구차가 이상 
		R = Integer.parseInt(st.nextToken());  //두 나라 인구차가 이하 
		arr =new int [N][N];
		for(int i = 0 ; i < N ; i++) {
			//입력 
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < N ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		System.out.print(dfs());
	
		
		
		
		
		
	}
	private static int dfs() {
		// TODO Auto-generated method stub
		int count=0;
		while(true) {
			tag= false;
			visited= new boolean [N][N];

			for(int i = 0 ; i < N; i++) {
				for(int j = 0 ; j < N; j++) {
					
					if(!visited[i][j]) {
					move(i,j);
					}
					
				
				}
			}
			if(tag) {
				count++;
			}
			else {
				break;
			}
		}
		return count;
	
	}	
	
	
	private static void move(int x, int y) {  //국경선을열어줌 
		Queue  <int []> q = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<int []> w = new ArrayList<>();

		q.add(new int [] {x,y});  //첫 값을 넣어줌 
		visited[x][y]= true;
		while(!q.isEmpty()) {
			int [] now = q.poll();
			for(int i = 0 ; i < 4 ; i ++) {
				int nowx = now[0]+dx[i];
				int nowy = now[1]+dy[i];
				
			
					if(nowx>=0 && nowx <N && nowy>=0 && nowy<N) {
						if(!visited[nowx][nowy]) {
						int result = Math.abs(arr[now[0]][now[1]] - arr[nowx][nowy]);
						if(L<=result &&  result<=R) {
							q.add(new int [] {nowx,nowy});
							visited[nowx][nowy] =true;
							w.add(new int [] {nowx,nowy});
							list.add(arr[nowx][nowy]);
							tag=true;  //값이 변경
						}
					}
				}
			}
		}
		
		if(tag) {
			list.add(arr[x][y]);
			w.add(new int [] {x,y});
		int sum [] = new int [2];
		int re = 0;
		for(int i = 0 ; i < list.size();i++) {
			re+=list.get(i);
		}
		sum[0]= re;
		sum[1]= list.size();
		swap(sum, w);
		}
	}

	
	private static void swap(int[] sum, ArrayList<int[]> w) {
		for(int i = 0 ; i < w.size();i++) {
			int [] now = w.get(i);
			arr[now[0]][now[1]]=sum[0]/sum[1];
			
		}
	}
}