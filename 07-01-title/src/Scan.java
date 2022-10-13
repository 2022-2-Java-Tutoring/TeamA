import java.util.Scanner;
import java.util.Vector;

class GetInteger {
	private Scanner scanner = new Scanner(System.in);
	private Vector<Integer> v = new Vector<Integer>();
	public GetInteger() {
	}
	public void getInt() {
		System.out.print("정수(-1이 입력될 때까지)>>");
		while (true) {
			int a = scanner.nextInt();
			if (a == -1) {
				break;
			}
			v.add(Integer.valueOf(a));
		}
	}

	protected void printBig(Vector<Integer> v) { // 큰 수를 찾는 함수
		int big = v.get(0);
		for (int i = 0; i < v.size(); i++) {
			if (big < v.get(i))
				big = v.get(i);
		}
		System.out.println("가장 큰 수는 " + big);
	}

	public void run() {
		getInt();
		printBig(v);
	}
}

public class Scan {
	public static void main(String[] args) {
		GetInteger g = new GetInteger();
		g.run();
	}
}
