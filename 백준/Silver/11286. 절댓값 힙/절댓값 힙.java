import java.io.*;
import java.util.*;
class Main {
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	PriorityQueue<Integer> q = new PriorityQueue<>((o1,o2)->
	    	Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));
	    
	    	for(int i =0 ; i < N;i++) {
	    		st = new StringTokenizer(br.readLine());
	    		int a = Integer.parseInt(st.nextToken());
	    		if(a==0) {
	    			if(q.isEmpty()) {
	    			System.out.println("0");
	    			}
	    			else {
	    			System.out.println(q.poll());
	    			}
	    		}
	    		else {
	    			q.add(a);
	    		}
	    		}
	    	
	    
	    	}
	    
	    
	    
	    
	    
		
}	