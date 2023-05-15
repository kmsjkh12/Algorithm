
import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		
		Stack<Character> stack = new Stack<>();
		int a= sc.nextInt();
		for(int i = 0; i<a;i++) {
			System.out.println(sort(sc.next()));
		}
		
	}

	private static String sort(String next) {
		// TODO Auto-generated method stub
		
		Stack <Character> stack = new Stack<>();
		for(int i = 0; i<next.length();i++) {
			char c = next.charAt(i);
			if(c=='(') {
				stack.push(c);
			}
			else if(stack.isEmpty()) {
				return "NO";
			}
			else {
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			return "YES";
		}
		else {
			return "NO";
		}
		
	}
	
}
