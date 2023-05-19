import java.io.*;
import java.util.*;


public class Main {
	static boolean visited [];
	static int arr [][];
	static int count;
	static int N,M,V;
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		N= sc.nextInt();
		M= sc.nextInt();
		V= sc.nextInt();
		arr =  new int[N+1][N+1];
		
		for(int i = 0 ; i <M; i++) {
			int a =sc.nextInt();
			int b= sc.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
		
		visited = new boolean[N+1];
		dfs(V);
		System.out.println("");

		visited = new boolean[N+1];
		bfs(V);
		
		
	}

	private static void bfs(int t) {
		// TODO Auto-generated method stub
		Queue <Integer> q = new LinkedList<>();
		q.add(t); 
		visited[t]=true;
		//3 
		System.out.print(t+ " ");
		while(!q.isEmpty()) {
			int temp = q.poll();
			
			for(int i = 1 ; i<N+1; i++) {
				if(!visited[i] && arr[temp][i]==1) {
					q.add(i);
					visited[i]=true;
					System.out.print(i + " ");
				}
			}
		}
		
	}

	//5,4 5,2 1,2 3,4 3,1 
	private static void dfs(int t) {
		// TODO Auto-generated method stub
		System.out.print(t+ " ");
		if(t==arr.length) {
			return;
		}
		visited[t] = true;
		
		
		for(int i = 1 ; i<N+1;i++) {        //2,4 4-> 3->
		if(!visited[i] && arr[t][i]==1) {
			dfs(i);
		}
		}
	}

	

	
}
