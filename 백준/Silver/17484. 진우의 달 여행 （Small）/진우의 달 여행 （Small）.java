import java.io.*;
import java.util.*;



class Main {
	static int dx [] = {-1,0,1};   //가로 
	static int N;
	static int M;
	static int arr [][];
	static int min;
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int [N][M];
		min =  999999999;
		int sum = 0;
		for(int i = 0; i < N;i++) {
			for(int j = 0 ; j < M;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		for(int i = 0 ; i <M;i++) {
			dfs(0,i,5,0);
		}
		System.out.print(min);
		
	}
	private static void dfs(int n, int m, int dir,int result) {
		
		if(n==N) {
			min = Math.min(min, result);
			return;
		}
		result+=arr[n][m];
		n++;
		for(int i = 0 ; i < 3; i ++) {
			if(dir==i) {
				continue;
			}
			if(m+dx[i]<0 || m+dx[i]>=M) {
				continue;
			}
			dfs(n,m+dx[i],i,result);
		}
	}
}	