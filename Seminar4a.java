
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Seminar4a {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000 ; i++){
            list1.add(i);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - timeStart);
}
}