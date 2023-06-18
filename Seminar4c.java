import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;




public class Seminar4c {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        Scanner scanner = new Scanner(System.in);
        while (work){
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    print(list);
                    break;
                case "revert":
                    list.removeLast();
                    break;
                case "finish":
                    System.out.println("До новых встреч");
                    work = false;
                    break;
                default:
                list.add(line);
            }
        }

    }
    
    static void print(LinkedList<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());

        }
    }
}
