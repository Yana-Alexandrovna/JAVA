import java.util.ArrayList;
import java.util.List;

public class Seminar3c {
    public static void main (String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "детектив", "агата");
        addBook(shopBook, "сказки", "рыбка");
        addBook(shopBook, "детектив", "шерлок");
        addBook(shopBook, "сказки", "колобок");
        addBook(shopBook, "фэнтези", "гарри");
        addBook(shopBook, "фэнтези", "ночной");
        addBook(shopBook, "сказки", "курочка");
        System.out.println(shopBook);


    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)){
                List<String> list = shopBook.get(i);
                list.add(nameBook);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);
    }
}
