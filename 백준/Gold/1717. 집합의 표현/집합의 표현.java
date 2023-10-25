
import java.util.*;
import java.io.*;

public class Main {
	public static int N,M;
	public static int arr [];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N =Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int [N+1];
		for(int i = 0 ; i <=N; i++) {
			arr[i] = i;
		}
		
		
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int q = Integer.parseInt(st.nextToken());	
			int a = Integer.parseInt(st.nextToken());	
			int b = Integer.parseInt(st.nextToken());	
			
			
			if(q==0) {
				union(a,b);
			}
			if(q==1) {
				if(checkSum(a,b)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");

				}
			}
		}
		
	}
	private static int find(int a) {
		if(a==arr[a]) {
			return a;
		}
		else {
			return arr[a] = find(arr[a]);
		}
	}
	private static void union(int a, int b) {
		// TODO Auto-generated method stub
		a= find(a);
		b = find(b);
		
		if(a!=b) {
			arr[b]= a;
		}
	}
	private static boolean checkSum(int a, int b) {
		int findA = find(a);
		int findB= find(b);
		if(findA == findB) {
			return true;
		}
		return false;
	}
}
