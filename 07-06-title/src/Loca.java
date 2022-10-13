import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
    private int first, second;

    public Location(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void findLocation(String city) {
        System.out.println(city + " " + first + " " + second);
    }
}

public class Loca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("도시, 경도, 위도를 입력하세요");
        HashMap<String, Location> hm = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            System.out.print(">>");
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str, ",");
            String name = st.nextToken();
            int first = Integer.parseInt(st.nextToken().trim());
            int second = Integer.parseInt(st.nextToken().trim());
            hm.put(name, new Location(first, second));
        }
        System.out.println("----------------------------------");
        Set<String> key = hm.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            Location s = hm.get(temp);
            s.findLocation(temp);
        }
        System.out.println("----------------------------------");
        while (true) {
            System.out.print("도시 이름 >> ");
            String city = sc.next();
            if (city.equals("그만"))
                break;
            Location s = hm.get(city);
            if (s == null)
                System.out.println(city + "는 없습니다.");
            else
                s.findLocation(city);
        }
        sc.close();
    }
}