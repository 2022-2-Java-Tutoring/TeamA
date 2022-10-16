import java.util.Scanner;
import java.util.Vector;

abstract class Shape {
    public Shape() {
    }

    public void paint() {
        draw();
    }

    abstract public void draw();
}

class Line extends Shape {
    public Line() {
    }

    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Circle extends Shape {
    public Circle() {
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Rect extends Shape {
    public Rect() {
    }

    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

public class GraEdit {
    private String name;
    private Scanner scanner = new Scanner(System.in);
    private Vector<Shape> v = new Vector<Shape>();

    public GraEdit(String name) {
        this.name = name;
    }

    public void insert() {
        int num;
        Shape s;
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        num = scanner.nextInt();
        switch (num) {
            case 1:
                s = new Line();
                v.add(s);
                break;
            case 2:
                s = new Rect();
                v.add(s);
                break;
            case 3:
                s = new Circle();
                v.add(s);
                break;
            default:
                System.out.println("1, 2, 3 중에 입력해주세요");
                return;
        }
    }

    public void delete() {
        int num;
        System.out.print("삭제할 도형의 위치>>");
        num = scanner.nextInt();
        if(v.size() <num){
            System.out.println("삭제할 수 없습니다.");
        }
        else {
            v.remove(num-1);
        }
    }

    public void showAll() {
        for(int i=0; i<v.size(); i++){
            v.get(i).paint();
        }
    }

    public void run() {
        int num;
        System.out.println("그래픽 에디터 " + name + "을 실행합니다.");
        
        while(true){
        	System.out.print("삽입(1), 삭제 (2), 모두 보기(3), 종료(4)>>");
        	num = scanner.nextInt();
            switch (num) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    showAll();
                    break;
            }
            if (num==4){
            	System.out.println(name + "을 종료합니다.");
                return;
            }
        }
        

    }

    public static void main(String[] args) {
        GraEdit e = new GraEdit("beauty");
        e.run();
    }
}
