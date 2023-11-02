import java.util.*;
import java.io.*;

public class Main {
	public static int N, max,count;
	public static int [][]map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		map = new int [N][N];
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0 ; j < N ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int k = 0 ; k < N; k++) {
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < N ; j++) {
					if(map[i][k] == 1 && map[k][j] == 1) {
						map[i][j] = 1; 
					}
				}
			}
		}
		for(int i = 0 ; i < N ; i++) {
			for (int j = 0 ; j < N ; j++) {
				System.out.print(map[i][j] +  " ");
			}
			System.out.println();

		}
		
	}
}
