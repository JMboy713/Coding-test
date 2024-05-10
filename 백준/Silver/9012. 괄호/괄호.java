import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.nextLine();
		for (int j = 0; j < i; j++) {
			String s = sc.nextLine();
			Stack<String> objects = new Stack<>();
			char[] charArray = s.toCharArray();
			String answer= "YES";
			for (char c : charArray) {
				if (c == '(') {
					objects.push("(");
				} else {
					if (objects.isEmpty()) {
						answer= "NO";
						break;
					} else {
						objects.pop();
					}
				}
			}
			if (!objects.isEmpty()) {
				answer= "NO";
			}
			System.out.println(answer);
		}


	}
}