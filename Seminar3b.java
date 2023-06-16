import java.util.ArrayList;
import java.util.List;

public class Seminar3b {
    public static void main (String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add("1");
        list.add(15);
        list.add("пока");
        list.add(-8);
        list.add("привет");
        list.add(3.14);

        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            if (object instanceof Integer){
            list.remove(i);
            i--;
            }
        }
        System.out.println(list);
    }

}