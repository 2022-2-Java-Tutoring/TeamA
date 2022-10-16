import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>> ");
		double p1, p2, r;
		p1 = scanner.nextDouble();
		p2 = scanner.nextDouble();
		r = scanner.nextDouble();
		
		System.out.print("점 입력>> ");
		double x, y;
		x = scanner.nextDouble();
		y = scanner.nextDouble();
		
		double distance = Math.sqrt((x-p1)*(x-p1)+(y-p2)*(y-p2));
		if(distance<r)
			System.out.println("점" + x + "," + y + "은 원 안에 있습니다.");
		else
			System.out.println("점" + x + "," + y + "은 원 밖에 있습니다.");
		
		scanner.close();
	}
}
