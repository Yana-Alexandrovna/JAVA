//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.LinkedList;

public class HW12 {
    public static void main(String[] args) {
         LinkedList<Integer> list = new LinkedList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         System.out.println(list);
        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
}
}