//11번문제를 if-else이용해 푸는 방법
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) >>");
		int number;
		number = scanner.nextInt();
		
		if(number>=3 && number<=5)
			System.out.print("봄");
		else if(number>=6 && number<=8)
		System.out.print("여름");
		else if(number>=9 && number<=11)
			System.out.print("가을");
		else if(number==1 || number ==2 ||number==12)
			System.out.print("겨울");
		else
			System.out.print("잘못 입력하였습니다.");
		scanner.close();
			
	}

}
