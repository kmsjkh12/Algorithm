import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int min = (N< M) ? N : M;
		
		int gcd = 0;
		
		for(int i = 1; i <= min ; i++) {
			if( N % i ==0 && M % i ==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
		System.out.print(N*M /gcd);
	}
}