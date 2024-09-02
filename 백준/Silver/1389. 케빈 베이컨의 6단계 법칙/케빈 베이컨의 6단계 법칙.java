
import java.util.*;


public class Main{
	
	private static int INF = 1000000000;
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
	
		int n= sc.nextInt();
		int m= sc.nextInt();
		
		int arr [][] = new int [n+1][n+1];
		
		int k[] = new int [n+1];
		
		for(int i = 1; i <= n;i++) {
			for(int j = 1; j<=n ;j++) {
				arr[i][j]= INF;
			}
		}
		for(int i = 1 ; i <=m; i++ ) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			arr[a][b]=1;
			arr[b][a]=1;
			
		
		}
		
		for(int z = 1; z <=n; z++) {
			for(int i = 1; i<= n ;i++) {
				for(int j = 1; j <= n; j++) {
					
					if( arr[i][j] == 1 && i == j) continue;
					if( arr[i][z] != INF && arr[z][j] != INF) {
						arr[i][j] = Math.min(arr[i][j], arr[i][z]+arr[z][j]);
					}
			}
		}
		}
		
		
		int min = Integer.MAX_VALUE;
		int index =Integer.MAX_VALUE;
		for(int i = 1; i<= n ;i++) {
			for(int j = 1; j <= n; j++) {
				if ( i==  j ) continue;
				k[i] += arr[i][j];
			
			}
			if( min > k[i]) {
				min = k[i];
				index= i;

			}
		}
		
		
		System.out.print(index);
		}	
}


//0 0 1 1 0
//0 0 0 0 0
//0 1 0 0 0
//0 0 1 0 1
//0 0 0 0 0
