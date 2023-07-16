import java.io.*;
import java.util.*;



class Main {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		
	
		int N = sc.nextInt();

		for(int i = 0 ; i< N;i++) {
			arr.add(new ArrayList<>());
		}
		for(int i = 0 ; i < N-1 ; i++) {
			int start = sc.nextInt()-1;
			int end = sc.nextInt()-1;
			arr.get(start).add(end);
			arr.get(end).add(start);

		}
		

		boolean[] visited = new boolean[N];
		int[] parent = new int[N];
		
		Queue<Integer> q = new LinkedList<>();
		q.add(0);visited[0]=true;
		
		while(!q.isEmpty()) {
			int now = q.poll();
			for(int i : arr.get(now)) {
				if(!visited[i]) {
					visited[i]=true;
					q.add(i);
					parent[i]=now;
				}
			}
		}
		for(int i =1 ; i <N;i++) {
			System.out.println(parent[i]+1);
		}
	}
}	