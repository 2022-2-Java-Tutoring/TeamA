import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");
		int p1, p2;
		double r1;
		p1 = scanner.nextInt();
		p2 = scanner.nextInt();
		r1 = scanner.nextDouble();
		
		System.out.print("두번쨰 원의 중심과 반지름 입력>> ");
		int p3, p4;
		double r2;
		p3 = scanner.nextInt();
		p4 = scanner.nextInt();
		r2 = scanner.nextDouble();
		
		double distance = 0;
		distance = Math.sqrt((p1-p2)*(p1-p2) + (p3-p4)*(p3-p4));
		if(distance<=r1+r2)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 안겹친다.");
		scanner.close();
		
	}

}
