import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(st.nextToken());
		
		for (int i = 0 ; i < N ; i++) {
			st=new StringTokenizer(br.readLine());
			String line = st.nextToken();
			if(line.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			else if(line.equals("top")){
				if(!stack.empty()) {
					System.out.println(stack.peek());
					}
					else {
						System.out.println("-1");
					}
				
			}
			else if(line.equals("size")) {
				System.out.println(stack.size());
			}
			else if(line.equals("empty")) {
				if(stack.empty()) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else if(line.equals("pop")) {
				if(!stack.empty()) {
				System.out.println(stack.pop());
				}
				else {
					System.out.println("-1");
				}
			}
		}
		
		
	}
	
}
