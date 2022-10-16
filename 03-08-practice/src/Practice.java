import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇개?");
		int cnt = scanner.nextInt();
		int array[] = new int[cnt];
		
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*100+1);
			if(i>0) {
				for(int j=0; j<i; j++) { // 배열에 있는 값이면 초기화함
					if(array[i] == array[j]) {
						array[i] =(int)(Math.random()*100+1);
						j--;
					}
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + "	");
			if((i+1)%10 == 0)
				System.out.println();
		}
		scanner.close();
	}
}
