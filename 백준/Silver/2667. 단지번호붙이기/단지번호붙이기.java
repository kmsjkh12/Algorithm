
import java.io.*;
import java.util.*;


public class Main {
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static boolean visited [][];
	static int arr [][];
	static int count;
	static int N,M,V;
	static int num;
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N= Integer.parseInt(st.nextToken());
		arr =  new int[N][N];
		visited= new boolean[N][N];
		for(int i = 0 ; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j=0;j<N;j++) {
			arr[i][j]=Integer.parseInt(line.substring(j,j+1));
		
			}
		}
			
		num=1;
			int a= 0;
			for(int i = 0 ; i<N;i++) {
			for(int j=0 ; j<N;j++) {
			if(!visited[i][j] && arr[i][j]!=0) {
				num++;
				bfs(i,j,num);
				a++;
				}
				}
			}
			Collections.sort(list);
			
			System.out.println(a);
			for(int i = 0 ; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
	}

	private static void bfs(int w, int h,int num) {
		// TODO Auto-generated method stub
		Queue<int []> q = new LinkedList<>();
		count=1;
		q.add(new int [] {w,h});
		visited[w][h]=true;

		while(!q.isEmpty()) {
			int [] s = q.poll();
			for(int i = 0 ; i<4 ; i++) {
				int tx = s[0]+dx[i];
				int ty = s[1]+dy[i];
				
				if(tx>=0 && tx<N && ty>=0 && ty<N){
					if(!visited[tx][ty] && arr[tx][ty]==1) {
						q.add(new int[]{tx,ty});
						visited[tx][ty]=true;
						count++;
					}
				}
			}
		}
		list.add(count);
	}

	

	
	

	
}
