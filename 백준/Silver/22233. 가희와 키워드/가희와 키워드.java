import java.io.*;
import java.util.*;



class Main {
	public static void main (String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<String> list = new HashSet<>();
        StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			String line =st.nextToken();
			list.add(line);
		}
		for(int i = 0 ; i < M; i ++) {
			st = new StringTokenizer(br.readLine());

			String str1 = st.nextToken();
			String[] words = str1.split(",");
			for(int j = 0 ; j < words.length;j++) {
				if(list.contains(words[j])) {
					list.remove(words[j])
					;
				}
			}
			sb.append(list.size() + "\n");
		}
		System.out.println(sb);
	}
	
}	