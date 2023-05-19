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
		arr =  new int[N+1][N+1];
		
		for(int i = 0 ; i <M; i++) {
			int a =sc.nextInt();
			int b= sc.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
		
		visited = new boolean[N+1];
		dfs(1);
		System.out.print(count);
		
	}

	private static void dfs(int t) {
		// TODO Auto-generated method stub
		visited[t]= true;
		
		for(int i = 1; i <N+1; i++) {
			if(!visited[i] && arr[t][i]==1) {
				dfs(i);
				count++;

			}
		}
	}

	
	

	
}
