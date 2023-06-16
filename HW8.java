//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.Rdn;

public class HW8 {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(10);
    for (int i = 0; i < 10; i++){ 
        int rnd = (int) (Math.random() * 10);
        list.add(rnd); 
    }
    System.out.println(list);
    for (int i = 0; i < list.size(); i++){
            if ((Integer) list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
    }
    System.out.println(list);
    }
}



