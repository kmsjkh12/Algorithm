import java.io.*;
import java.util.*;
class Main {
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	        StringBuilder sb = new StringBuilder();

	    	Queue<Integer> q= new LinkedList<>();
	    	
	    	int N = Integer.parseInt(st.nextToken());
	    	int K = Integer.parseInt(st.nextToken());
	    	sb.append("<");
	    	for (int i = 1 ; i <= N ;i++) {
	    		q.add(i);
	    	}
	    	
	    	while(!q.isEmpty()) {
	    		for(int i = 0;i<K-1;i++) {
	    			int num = q.poll();
	    			q.add(num);
	    		}
	    		sb.append(q.poll()).append(", ");
	    	}
	    	sb.delete(sb.length()-2, sb.length());
	    	sb.append(">");
	    	System.out.print(sb);
}
	    
	    
		
}	