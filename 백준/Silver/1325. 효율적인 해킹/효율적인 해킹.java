import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
	
	public static ArrayList<Integer>[] arr;
	public static boolean [] visited;
	public static int N;
	public static int [] result;
	public static int count;
	public static void main (String[]args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new ArrayList[N+1];
		result = new int[N+1];
		int max = Integer.MIN_VALUE;
		for(int i = 1 ; i <= N ;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for(int i =0 ; i <M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
		}
		for(int i = 1; i <= N; i++) {
				visited= new boolean[N+1];
				dfs(i);
		}
		for(int i  =1; i<=N;i++) {
			if(result[i]> max) {
				max=result[i];
			}
		}
		for(int i  =1; i<=N;i++) {
			if(result[i] == max) {
				System.out.print(i + " ");
			}
		}
	}
	private static void dfs(int n) {
		visited[n] =true;
		for(int a : arr[n]) {
			if(visited[a]) continue;
			result[a]++;
			dfs(a);
			
		}
	}		
}
