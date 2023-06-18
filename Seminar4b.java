import java.util.Scanner;
import java.util.LinkedList;

public class Seminar4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work){
            String line = scanner.nextLine();
            if (!line.contains("~")){
                System.out.println("Неверный формат строки");
                continue;
            }
            String text = line.split("~")[0];
            String num = line.split("~")[1];
            int position = Integer.parseInt(num);
            switch (text){
                case "print":
                    System.out.println(list.remove(position));
                    break;
                case "end":
                    System.out.println("До новых встреч");
                    work = false;
                    break;
                default:
                    list.add(position, text);


            }
        }
    }
}
