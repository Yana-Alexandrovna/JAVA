
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
//first() - возвращает первый элемент из очереди, не удаляя

import java.util.LinkedList;


public class HW11 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); 
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
        System.out.println(list);
        enqueue(list, 6);
        System.out.println(list);
        dequeue(list);
        System.out.println(list);
        first(list);
        System.out.println(list);
    }
    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }
    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }
    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
        