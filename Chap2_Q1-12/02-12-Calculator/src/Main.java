import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.print("Expression >> ");
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		char op = sc.next().charAt(0);
		double n2 = sc.nextDouble();

		double res = calc(op, n1, n2);
		System.out.printf("%f %c %f의 계산 결과는 %f", n1, op, n2, res);
		sc.close();
	}

	static double calc(char op, double n1, double n2)
	{
		if (op == '/')
		{
			if (n2 == 0) System.out.print("0으로 나눌 수 없습니다.");
			else return n1 / n2;
		}
		else switch (op)
		{
			case '+': return n1 + n2;
			case '-': return n1 - n2;
			case '*': return n1 * n2;
			default: System.out.print("사칙연산이 아닙니다.");
		}
		System.exit(0);
		return 0;
	}
}
