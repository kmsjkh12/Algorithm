import java.io.*;
import java.util.*;
class Main {
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int N = Integer.parseInt(st.nextToken());
	    	int M = Integer.parseInt(st.nextToken());
	    	String Narr [] =new String [N];
	    	int count= 0;
	    	for( int i = 0 ; i < N ; i++) {
	    		st = new StringTokenizer(br.readLine());

	    		Narr[i] =st.nextToken();
	    	}
	    	for(int i = 0 ; i < M ;i++) {
	    		st = new StringTokenizer(br.readLine());

	    		String Mline = st.nextToken();
	    		for(int j = 0 ; j< N; j++) {
	    			if(Narr[j].equals(Mline)) {
	    				count++;
	    			}
	    		}

	    	}
	    	
	    	System.out.println(count);
}
	    
	    
		
}	