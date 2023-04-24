import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		Queue <Integer> qd = new LinkedList<>();
		int c = sc.nextInt();
		for (int i = 1; i <c+1 ; i ++) {
			qd.add(i);
		}
		
	  	while(qd.size()>1) {          
			qd.poll();           //젤위에 지우
			int a = qd.poll();   //맨위 꺼
			qd.add(a);           //맨아래로 삽
		}
		System.out.println(qd.poll());
	}
}
