//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке. Collections.frequency()

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HW7 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Меркурий");
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Меркурий");
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Меркурий");
        planets.add("Земля");
    System.out.println(planets);  
    int i = 0;
    ArrayList<String> count = new ArrayList<String>();
   while (i < planets.size()) {
        //System.out.println(planets.get(i)+ ": " + Collections.frequency(planets, planets.get(i)));
        count.add(planets.get(i)+ ": " + Collections.frequency(planets, planets.get(i)));
        i++; 
        }
       System.out.print(count.stream().distinct().collect(Collectors.toList()));
    } 
    
}
