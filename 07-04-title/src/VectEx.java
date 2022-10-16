import java.util.*;

public class VectEx {
    private Scanner scanner = new Scanner(System.in);
    private Vector<Integer> vec = new Vector<Integer>();

    public void check() {
        int rain;
        while (true) {
            System.out.print("강수량 입력 (0 입력시 종료)>>");
            rain = scanner.nextInt();
            if (rain == 0)
                return;
            vec.add(Integer.valueOf(rain));
            printRain();
        }

    }

    public void printRain() {
        int sum = 0;
        for (int i = 0; i < vec.size(); i++) {
            System.out.print(vec.get(i) + " ");
            sum += vec.get(i);
        }
        System.out.println();
        System.out.println("현재 평균" + sum / vec.size());
    }

    public static void main(String[] args) {
        VectEx v = new VectEx();
        v.check();
    }
}
