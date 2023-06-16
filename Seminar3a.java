import java.util.ArrayList;
import java.util.List;


public class Seminar3a {
    public static void main (String[] args) {
    List<Integer> list = createList(2, 8, 10);
    System.out.println(list);
    list.sort(null);
    System.out.println(list);  
    }

    public static List<Integer> createList(int min, int max, int count){
        List<Integer> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            int rnd = (int)(Math.random() * (max - min) + min);
            list.add(rnd);
        }
        return list;
    }
}
