import java.util.*;
import java.io.*;

public class Main {
	public static int N,M,start,end;
	public static Edge arr [];
	public static int dist [] ;
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
	
		N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());	
		
		M = Integer.parseInt(st.nextToken());

		arr = new Edge [M];
		dist = new int [N+1];
	
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine());	
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			arr[i] = new Edge(s,e,w);
		}
		
		st = new StringTokenizer(br.readLine());	

		start = Integer.parseInt(st.nextToken());
		end =Integer.parseInt(st.nextToken());
		
		
		
		Bellman();
		
		System.out.print(dist[end]);
		
	}
	private static void Bellman() {
		// TODO Auto-generated method stub
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		dist[start] = 0;
		
		for(int i = 0 ; i <N-1;i++) {
			for(Edge edge : arr) {
				if(dist[edge.x] !=Integer.MAX_VALUE) {
					if(dist[edge.y] > dist[edge.x] + edge.w) {
						dist[edge.y] = dist[edge.x] + edge.w;
					}
				}
			}
		}	
	}
    public static class Edge {
	int x;
	int y;
	int w;
	
	Edge(int x, int y, int w){
		this.x=x;
		this.y=y;
		this.w=w;
	}

}
}