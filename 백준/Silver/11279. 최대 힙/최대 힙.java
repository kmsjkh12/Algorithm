import java.io.*;
import java.util.*;
class Main {
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());
	    	for(int i =0 ; i < N;i++) {
	    		st = new StringTokenizer(br.readLine());
	    		int a = Integer.parseInt(st.nextToken());
	    		if(priorityQueueHighest.isEmpty()) {                 //비어있으
	    			if(a==0) {
	    				System.out.println("0");
	    			}
	    			else {
	    				priorityQueueHighest.add(a);
	    			}
	    		}
	    		else {
	    			if(a==0) {
	    				System.out.println(priorityQueueHighest.poll());
	    			}
	    			else {
	    				priorityQueueHighest.add(a);

	    			}
	    		}
	    	}
	    	
	    	
}
	    
	    
	    
	    
		
}	