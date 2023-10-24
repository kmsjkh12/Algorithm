import java.util.*;
import java.io.*;
public class Main {
	public static ArrayList<Node>[] arr;
	public static boolean [] visited;
	public static int N,Q;
	public static int [] result;
	public static int count;
	public static void main (String[]args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		arr = new ArrayList[N+1];

		for(int i = 1 ; i <=N;i++) {
			arr[i] =new ArrayList<>();
		}
		for(int i = 0 ; i <N-1;i++ ) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); 
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			arr[a].add(new Node(b,c));
			arr[b].add(new Node(a,c));
		}
		for(int i = 0 ; i < Q;i++) {
			st = new StringTokenizer(br.readLine());

			int k = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			System.out.println(bfs(v,k));
			
			
		}
	}
	private static int bfs(int index, int cost) {
		Queue<Integer> q = new LinkedList<>();
		q.add(index);
		int count =0;
		visited = new boolean [N+1];
		visited[index]=true;
		  // 구해야 하는 값 
		while(!q.isEmpty()) {
			int now = q.poll();
			for(Node node : arr[now]) {
				if(!visited[node.index] && cost<= node.cost) {
					q.add(node.index);
					visited[node.index]=true;
					count++;
				}
			}
			
	}
		return count;
	}
}

class Node {
	int index;
	int cost;
	public Node(int index, int cost) {
		this.index=index;
		this.cost=cost;
		
	}
}	
