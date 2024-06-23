import java.util.*;

public class Main {
		static int N;
		static int arr[];
		static int anwser [];
		static int max = Integer.MIN_VALUE;
		static boolean visit [];
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
      
		N = sc.nextInt();
		arr = new int [N];
		anwser= new int [N];
		visit =new boolean[N];
		for(int i = 0 ; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		dfs(0);
		
		
		
		
		System.out.print(max);
	}
		
	public static void dfs(int depth) {
		if(depth == N) {
			int sum = 0;
			for(int i = 0 ; i < N-1; i++) {
				sum+= Math.abs(anwser[i]- anwser[i+1]);
			}
			
			max = Math.max(max,  sum);
			return;
		}
		
		for(int i = 0 ; i < N ; i++) {
			if(!visit[i]) {
				anwser[depth] = arr[i];
				visit[i] = true;
				dfs(depth+1);
				visit[i] = false;
			}
		}
	}
}	