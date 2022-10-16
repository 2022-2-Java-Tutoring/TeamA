import java.util.ArrayList;
import java.util.Scanner;

class Scans {
    private ArrayList<Character> a = new ArrayList<Character>();
    private Scanner scanner = new Scanner(System.in);
    private double sum;

    public Scans() {
        this.sum = 0;
    }

    private void setScore() {
        System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for (int i = 0; i < 6; i++) {
            char score = scanner.next().charAt(0);
            a.add(Character.valueOf(score));
        }
    }

    private double getAve() {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals('A'))
                sum += 4;
            else if (a.get(i).equals('B'))
                sum += 3;
            else if (a.get(i).equals('C'))
                sum += 2;
            else if (a.get(i).equals('D'))
                sum += 1;
            else if (a.get(i).equals('F'))
                sum += 0;
        }
        return sum/a.size();

    }
    public void run() {
        setScore();
        System.out.println(getAve());
    }
}

public class Average {
    public static void main(String[] args) {
        Scans scans = new Scans();
        scans.run();
    }
}
