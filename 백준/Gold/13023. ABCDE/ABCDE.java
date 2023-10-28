import java.util.*;
import java.io.*;

public class Main {
	public static int N,M,X;
	public static LinkedList<Integer>[] arr;
	public static boolean [] visited;
	public static boolean [] friends;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new LinkedList[N];
		visited = new boolean[N];
		friends = new boolean[N];
		for(int i = 0 ; i < N ;i++) {
			arr[i] = new LinkedList<>();
		}
		
		for(int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end  = Integer.parseInt(st.nextToken());
			arr[start].add(end);
			arr[end].add(start);
		}
		
		boolean flag= true;
		
		for(int i = 0 ; i < N ; i++) {
			visited= new boolean[N];
			dfs(i,0);
		}
		System.out.println("0");
		
		
	}
	private static void dfs(int start,int depth) {
		if( depth == 4 ) {
			System.out.println(1);
			System.exit(0);
		}
		
		visited[start] = true;
		
		for(int v : arr[start]) {
			if(!visited[v]) {
				visited[v]=true;
				dfs(v,depth+1);
				visited[v]=false;
			}
		}
		
	}
}
