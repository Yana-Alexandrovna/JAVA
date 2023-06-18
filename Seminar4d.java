
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;

public class Seminar4d {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7};
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
       Queue<Integer> queue = new LinkedList<>();
       queue.addAll(Arrays.asList(arr));
       printStackWithIterator(stack);
    }
     
    static void printStack(Stack<Integer> stack){
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    static void printQueue(Queue<Integer> queue){
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static void printStackWithIterator(Stack<Integer> stack){
        ListIterator<Integer> iterator = stack.listIterator(stack.size());
        while (iterator.hasPrevious());
            System.out.println(iterator.previous());
    }

    }
