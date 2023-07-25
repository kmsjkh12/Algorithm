import java.io.*;
import java.util.*;



class Main {
	
	public static class Node {
		int end;
		int cost;
		public Node(int end, int cost) {
			this.end = end;
			this.cost = cost;
		}
	}
	
	static ArrayList<Node>[] list;
	static boolean visited[];
	static int arr [];
	static boolean isEven;
	
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		visited = new boolean [V+1];
		list = new ArrayList[V+1];
		arr = new int [V+1];
		
		for(int i =1 ; i <=V ; i++) {
			list[i] = new ArrayList<>();
			arr[i]= Integer.MAX_VALUE;
		}
		for(int i =0 ; i < E ; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			list[start].add(new Node(end,cost));
			list[end].add(new Node(start,cost));
		}
		PriorityQueue<Node> q = new PriorityQueue<>((o1,o2)->o1.cost- o2.cost);
		q.add(new Node(1,0));
		visited[1]=true;
		arr[1]=0;
		while(!q.isEmpty()) {
			Node node = q.poll();
			for(Node i : list[node.end]) {
				if(!visited[i.end]) {
					arr[i.end] =i.cost+ node.cost; 
					q.add(new Node(i.end,arr[i.end]));
					visited[i.end]=true;
				}
				else if(visited[i.end] && arr[i.end]> i.cost+node.cost) {
					arr[i.end]=i.cost+node.cost;
					q.add(new Node(i.end,arr[i.end]));
					visited[i.end]=true;

				}
			}
		}
		System.out.print(arr[V]);
	}
	
}