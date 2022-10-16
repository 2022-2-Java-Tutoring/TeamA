import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		System.out.print("정수 3개 입력>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if(a<b && b<c) {
			System.out.println("중간 값은 " + b);
		}
		if(b<a && a<c) {
			System.out.println("중간 값은 " + a);
		}
		else {
			System.out.println("중간 값은 " + c);
		}
		scanner.close();
	}
}
