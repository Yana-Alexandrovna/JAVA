//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HW9 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> Arraylist = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            Arraylist.add(rnd.nextInt(0,10));
        }
        double av = 0;
        double sum = 0;
        System.out.println(Arraylist);
        for (int i = 0; i < 10; i++){ 
        sum += Arraylist.get(i);
        }
        av = sum / Arraylist.size();  
    System.out.print("Максимальное: " + Collections.max(Arraylist) + " Минимальное: " + Collections.min(Arraylist) + " Среднее " + av);

}
}