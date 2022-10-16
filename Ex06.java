import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int number = scanner.nextInt();
		
		if(number>=1 && number<=99) {
			int a, b;
			a = number/10;
			b = number%10;
			
			if((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println("박수짝짝");
			}
			else if((a==3 || a==6 || a==9) || (b==3 || b==6 || b==9)) {
				System.out.println("박수짝");
			}
		}
		scanner.close();
	}

}
