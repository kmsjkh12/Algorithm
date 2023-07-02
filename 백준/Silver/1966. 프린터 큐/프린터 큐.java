import java.io.*;
import java.util.*;
class Main {
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	
	    	int t = Integer.parseInt(st.nextToken());
	    	
	    	for(int i = 0 ; i < t ; i++) {
	    		st = new StringTokenizer(br.readLine());
	    		int N = Integer.parseInt(st.nextToken());
	    		int M = Integer.parseInt(st.nextToken());
	    		st = new StringTokenizer(br.readLine());
	    		Queue<int[]> q = new LinkedList<>();
	    		for(int j = 0 ; j < N ;j++) {
	    			q.offer(new int [] { j, Integer.parseInt(st.nextToken())} );	
	    		}
	    		int count=0;
	    		while(!q.isEmpty()) {
	    			int [] front = q.poll();
	    			boolean fo = true;
	    			
	    			for(int qe[] : q) {
	    				if(qe[1]>front[1]) {
	    					fo=false;
	    					break;
	    				}
	    			}
	    			
	    			
	    			if(fo) {
	    				count++;
	    				if(front[0]==M) {
	    					break;
	    				}
	    			}
	    			else {
	    				q.add(front);
	    			}
	    		}
	    		
	    		
	    		System.out.println(count);
	    	}

	    	
	    	
	    }
		
}	