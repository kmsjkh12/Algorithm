
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main (String[]args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int count = 0;
		int M = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		int arr [][] =new int [N+1][N+1];
		boolean visited [] =new boolean [N+1];
		for(int i= 0 ; i < M ;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		q.add(1);
		visited[1]=true;
		
		while(!q.isEmpty()) {
			int a = q.poll();
			for(int i = 2 ; i <=N; i++) {
				if(!visited[i] && arr[a][i] == 1) {
					visited[i]=true;
					q.add(i);
					count++;
				}
			}
			
		}
		
		System.out.println(count);
		
	
		
		
		
		
		
	}	

	
}
