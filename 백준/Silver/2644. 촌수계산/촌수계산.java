import java.io.*;
import java.util.*;


public class Main {
	static boolean visited[];
	static int arr [][];
	static int count;
	static int n,x,y,m;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		m = sc.nextInt();
		visited= new boolean[n+1];
		arr= new int[n+1][n+1];
		for(int i = 0 ;i<m; i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			arr[a][b]=1;
			arr[b][a]=1;
		}
			dfs(x,0);
			if(count==0) {
				System.out.println("-1");
			}
			else {
				System.out.print(count);
			}
	}

	private static void dfs(int start, int d) {
		// TODO Auto-generated method stub
		//x => start , y => end
		
		visited[start]=true;
		
		if(start==y) {
			count=d;
			return;
		}
		
		for(int i = 1 ; i<n+1;i++) {
			if(!visited[i] && arr[start][i]==1) {
				dfs(i,d+1);
			}
		}
		
	}



	
	

	
}
