import java.io.*;
import java.util.*;
class Main {
	    public static void main(String args[]) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	Stack<Integer> stack =new Stack<Integer>();
	    	Stack<Integer> index =new Stack<Integer>();

	        int a=  Integer.parseInt(st.nextToken());
        	st = new StringTokenizer(br.readLine());
        	StringBuilder sb = new StringBuilder();
	       
        	for(int i = 1 ; i <=a; i++) {
        		int num = Integer.parseInt(st.nextToken());
        		
        		while(true) {
        			if(!stack.isEmpty()) {
        				int top = stack.peek();
        				if(top>num) {
        					System.out.print(index.peek()+ " ");
        					stack.push(num);
        					index.push(i);
        					break;
        				}
        				else {
        					stack.pop();
        					index.pop();
        				}
        			}
        			else {
        				System.out.print("0 ");
        				stack.push(num);
        				index.push(i);
        				break;
        			}
        		}
	        }
	       
	       
}
	    
	    
		
}	