import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader buffer =new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer token = new StringTokenizer(buffer.readLine()); 
		int suNo= Integer.parseInt(token.nextToken()); 
		int No= Integer.parseInt(token.nextToken()); 
		long [] s = new long[suNo+1];
		token = new StringTokenizer(buffer.readLine()); 
		for(int i =1 ;i <=suNo; i++) {
			s[i] = s[i-1] +Integer.parseInt(token.nextToken());
		}
		for(int q = 0 ; q<No ; q++) {
			token = new StringTokenizer(buffer.readLine()); 
			int i = Integer.parseInt(token.nextToken());
			int j = Integer.parseInt(token.nextToken());
			System.out.println(s[j]-s[i-1]);

		}
		
	}
}
