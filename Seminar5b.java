import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Seminar5b {
public static void main(String[] args) {
    String line = "Мороз и солнце день чудесный \n" +
                  "Еще ты дремлешь друг прелестный \n" +
                  "Пора красавица проснись. \n" ;
    ex3(line);
    }
    

    static boolean ex1(String s1, String s2) {
        if (s1.length()!= s2.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])) {
                if (c2[i]!= map.get(c1[i])) {
                    return false;
                }
            } else {
                map.put(c1[i], c2[i]);
            }
        }
    return true;
}

    static boolean ex2(String line) {
        Stack<Character> stack = new Stack<>();
        char[] c1 = line.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        for (int i = 0; i < c1.length; i++) {
            if(map.containsKey(c1[i])) {
                stack.push(c1[i]);
            }
            if (map.containsValue(c1[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) == c1[i]) {
                    return false;
                }
            }
        }
    return stack.isEmpty();    
}

    static void ex3(String line) {
        line = line.replace("\n", " ");
        line = line.replace(".", " ");
        String[] words = line.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String word : words) {
            int len = word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);
    }
}
