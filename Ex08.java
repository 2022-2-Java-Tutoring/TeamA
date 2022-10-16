import java.util.Scanner;

public class Ex08 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오>> ");
		int x1, x2, y1, y2;
		x1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y1 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		if(inRect(x1, x2, 100, 100, 200, 200) || 
				inRect(y1, y2, 100, 100, 200, 200)||
				inRect(x1, y2, 100, 100, 200, 200)||
				inRect(y1, x2, 100, 100, 200, 200))
			System.out.println("사각형이 겹칩니다.");
		
		else if((inRect(100, 100, x1, x2, y1, y2) &&
				inRect(100, 200, x1, x2, y1, y2) &&
				inRect(200, 100, x1, x2, y1, y2) &&
				inRect(200, 200, x1, x2, y1, y2)))
				System.out.println("사각형이 겹칩니다.");
		
		else if((inRect(x1, x2, 100, 100, 200, 200) &&
				inRect(y1, y2, 100, 100, 200, 200) &&
				inRect(y1, x2, 100, 100, 200, 200) &&
				inRect(x1, y2, 100, 100, 200, 200)))
				System.out.println("사각형이 겹칩니다.");
		else
			System.out.println("사각형이 겹치지 않습니다.");
		scanner.close();
	}
}
