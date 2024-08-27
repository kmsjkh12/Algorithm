import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		System.out.print(fibo(N));
		
	}

	private static int fibo(int n) {
	if(n<=1) {
		return n;
		
	}
	else {
		return fibo(n-1) + fibo(n-2);
		}
	}
}