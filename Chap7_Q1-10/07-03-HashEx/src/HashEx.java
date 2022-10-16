import java.util.HashMap;
import java.util.Scanner;

public class HashEx {
    private String country;
    private int popul;
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Integer> nations = new HashMap<String, Integer>();

    public HashEx() {
    }

    private void setCoPo() {
        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000");
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            country = scanner.next();
            if (country.equals("그만"))
                break;
            popul = scanner.nextInt();
            nations.put(country, popul);
        }
    }

    private void search() {
        String con;
        while (true) {
            System.out.print("인구 검색 >>");
            con = scanner.next();
            
            if(con.equals("그만")){
                return;
            }
            else if (nations.get(con) == null) {
                System.out.println(con + " 나라는 없습니다.");
            } 
            else
                System.out.println(con + "의 인구는 " + nations.get(con));

        }

    }

    public static void main(String[] args) {
        HashEx hs = new HashEx();
        hs.setCoPo();
        hs.search();
    }
}
