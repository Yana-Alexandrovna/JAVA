
//Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, 
//Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, 
//Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся 
//имена с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;


public class HW14 {

    public static <K, V extends Comparable<V> > Map<K, V>
    valueSort(final Map<K, V> map)
{
    Comparator<K> valueComparator = new Comparator<K>() {
        public int compare(K k1, K k2)
        {
            int comp = map.get(k1).compareTo(
                map.get(k2));
                    if (comp == 0)
                        return 1;
                    else
                        return comp;
        }
   };
   Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        sorted.putAll(map);
        return sorted;
}
    public static void main(String[] args) {
        List<String> line = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова" ,  
                       "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", 
                       "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");
        Map<String, Integer> map = new TreeMap<>();     
       for (String lines : line) {
           String name = lines.split(" ")[0];
           map.put(name, map.getOrDefault(name, 0) + 1);
       }
       for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue() >= 1) {
        Map sortedMap = valueSort(map);
        Set set = sortedMap.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext())
        {
            Map.Entry mp = (Map.Entry)i.next();
            System.out.print(mp.getKey() + ": ");
            System.out.println(mp.getValue());
            
        }
        break;
    }
}
}
}