

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам

import java.util.Collections;
import java.util.LinkedList;

public class HW10 {
    public static void main(String[] args) {
         LinkedList<String> list = new LinkedList<>();
         list.add("1");
         list.add("2");
         list.add("3");
         list.add("4");
         list.add("5");
         System.out.println(list);
         Collections.reverse(list);
         System.out.println(list);

    }
    
}
