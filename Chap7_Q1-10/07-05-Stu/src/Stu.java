import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {
    private String name;
    private String depart;
    private String num;
    private double grade;

    public Student(String name, String depart, String num, double grade) {
        this.name = name;
        this.depart = depart;
        this.num = num;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDepart() {
        return depart;
    }

    public String getNum() {
        return num;
    }

    public double getGrade() {
        return grade;
    }

    public void survey() {
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        System.out.print(">>");

    }
}

class ArrayStu {
    private ArrayList<Student> stu = new ArrayList<Student>();
    public static Scanner scanner = new Scanner(System.in);

    public ArrayStu() {

    }

    private void survey() {
        System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String depart = st.nextToken().trim();
            String num = st.nextToken().trim();
            double grade = Double.parseDouble(st.nextToken().trim());

            Student s = new Student(name, depart, num, grade);
            stu.add(s);
        }
    }

    private void printArray() {
        for (int i = 0; i < stu.size(); i++) {
            System.out.println("--------------------------");
            System.out.println("이름:" + stu.get(i).getName());
            System.out.println("학과:" + stu.get(i).getDepart());
            System.out.println("학번:" + stu.get(i).getNum());
            System.out.println("학점평균:" + stu.get(i).getGrade());
        }
        System.out.println("--------------------------");
    }

    private void search() {
        while (true) {
            boolean flag = true;
            System.out.print("학생 이름 >> ");
            String name = scanner.nextLine();
            if (name.equals("그만"))
                break;
            for (int i = 0; i < stu.size(); i++) {
                Student s = stu.get(i);
                if (name.equals(s.getName())) {
                    System.out.println(s.getName() + ", " + s.getDepart() + ", " + s.getNum() + ", " + s.getGrade());
                    flag = false;
                }
            }
            if (flag == true)
                System.out.println("그런 이름은 없습니다.");

        }

    }

    public void run() {
        survey();
        printArray();
        search();
    }
}

public class Stu {
    public static void main(String[] args) {
        ArrayStu ar = new ArrayStu();
        ar.run();
    }
}
