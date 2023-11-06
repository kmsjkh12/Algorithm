import java.util.*;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		int t = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int count = 0;
		
		for(int i = 0 ; i < t ; i ++) {
			if(checkIsPrimeNumber(Integer.parseInt(st.nextToken()))) {
				count++;
			}
			
		}
		System.out.print(count);
		
		
	}
	static boolean checkIsPrimeNumber(int num) {
		if(num == 1) {
			return false;
		}
		for(int i=2 ; i*i<=num; i++) {
			if(num%i ==0) {
				return false; //num이 i의 배수면 소수가 아니므로 false
			}
		}
		return true;
	}
}