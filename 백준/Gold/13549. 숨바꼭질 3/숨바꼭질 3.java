import java.io.*;
import java.util.*;



class Main {
	public static class Node{
		int x;
		int time;
		public Node (int x, int time ) {
			this.x = x;
			this.time = time;
		}
	}
	static int max = 100000;
	static int min = Integer.MAX_VALUE;
	static boolean visited[];
	static int N;
	static int M;
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visited= new boolean [100001];

		dfs();
		System.out.print(min);
	}

	private static void dfs() {
		Queue <Node> q= new LinkedList<>();
		q.offer(new Node(N,0));
		
		while (!q.isEmpty()) {
			Node node = q.poll();
			
			visited[node.x]=true;
			if (node.x == M) {
				min = Math.min(min,node.time);
			}
			if(node.x *2 <=max && visited[node.x *2] ==false ) {
				q.offer(new Node(node.x * 2, node.time));
			}
			if(node.x +1 <=max && visited[node.x +1] ==false ) {
				q.offer(new Node(node.x + 1, node.time+1));
			}
			if(node.x -1 >=0 && visited[node.x -1] ==false ) {
				q.offer(new Node(node.x - 1, node.time+1));
			}
		}
		
		
		
	}
		
}	