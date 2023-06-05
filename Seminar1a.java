
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalTime;


public class Seminar1a {
    public static void main (String[] args) {
        int[] array = new int[]{3,2,5,3};
        int val = 3;
        int[] res = ex2(array, val);
        System.out.println(Arrays.toString(res));

    }

    static int[] ex2(int[] array, int val){
       int[] res = new int[array.length];
       Arrays.fill(res, val);
       for (int i = 0, j = 0; i < array.length; i++) {
        if (array[i] != val){
            res[j] = array[i];
            j++;
        }
    }
    return res;
}

    static void ex1() {
        int[] array = new int[] { 1, 1, 0, 1, 1, 1 };
        int max = 0;
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        if (count > max) {
            max = count;
        }
        System.out.println(max);
    }

    static void ex0() {
        System.out.println("Name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good Day, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Good Evening, " + name + "!");
        } else {
            System.out.println("Good Night, " + name + "!");
        }
    }
}
    

    


    

    
    

    
    
