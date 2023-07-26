import java.io.*;
import java.util.*;



class Main {

	public static class Node{
		int start; 
		int end;
		public Node(int start, int end) {
			this.start=start;
			this.end=end;
		}
		
	}
	
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> now = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int count = 0;
		PriorityQueue<Node> q = new PriorityQueue<>((o1,o2)-> o1.start-o2.start);
		PriorityQueue<Node> q1 = new PriorityQueue<>((o1,o2)-> o1.start-o2.start);
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			int start= Integer.parseInt(st.nextToken());
			int end= Integer.parseInt(st.nextToken());
			q.add(new Node(start,end));
		}
		now.add(q.peek().end);
		count++;
		q.poll();

		while(!q.isEmpty()) {
			Node node = q.poll();

			boolean tag = false;
			for(int j= 0 ; j< now.size();j++) {
				//만약에 회의가 종료되면 들어갈 회의가 있을때 
				if(node.start>=now.get(j)) {
					tag=true;
					now.remove(j);
					now.add(node.end);
					break;
				}
			}
			
			if(!tag) {
				count++;
				now.add(node.end);
			}
			
		}
		System.out.print(count);
	}
}