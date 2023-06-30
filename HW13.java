

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HW13 {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones =  phones +"\n"+ el +" " ;
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    } 

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов", 123, bookPhone);
        addNumber("Сидоров", 456, bookPhone);
        addNumber("Петров", 12345, bookPhone);
        addNumber("Иванов", 123456789, bookPhone);
        addNumber("Иванов", 789, bookPhone);
        addNumber("Сидоров", 6789, bookPhone);
        printBook(bookPhone);
    }
}

