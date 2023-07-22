import java.io.*;
import java.util.*;

class Main {
	static String S;
	static String T;
	static StringBuilder sb;
	static boolean tb= false;
	static int max;
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		S = st.nextToken();
		st = new StringTokenizer(br.readLine());
		T = st.nextToken();
		sb.append(S);
		max = T.length();
		System.out.print(ab(S,T));
	
	}

	public static int ab(String s, String t) {
		
		if(s.length() == t.length()) {
			if(s.equals(t)) {
				return 1;
				
			}
			return 0;
		}
		int ans = 0; 
		if(t.charAt(0) == 'B') {
			String substring = t.substring(1);
            StringBuilder sb = new StringBuilder(substring);
            String string = sb.reverse().toString();
            ans += ab(s, string);		
            }
		
		 if (t.charAt(t.length() - 1) == 'A') {
	            ans += ab(s, t.substring(0, t.length() - 1));
	     }
		 return ans > 0 ? 1 : 0;
	}

	
		
}	