import java.util.Scanner;

public class Main {

	static String line;
	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);

	line = sc.next();
	
	int arr [] = new int[2];


	if(line.charAt(0)== '0') {
		arr[0]++;
	}
	else {
		arr[1]++;
	}
	for(int i = 1 ; i < line.length(); i++) {
		if(line.charAt(i-1) != line.charAt(i)) {
			if(line.charAt(i) == '0') {
				arr[0]++;
			}
			else {
				arr[1]++;
			}
		}
	}
	System.out.print(Math.min(arr[0], arr[1]));
	}
}
