import java.util.*;

public class Seminar5 {
 public static void main(String[] args) {
        ex0();
    }
static void ex0(){

        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("234567", "Васильев");
        passports.add("345678", "Петров");
        passports.add("456789", "Иванов");
        passports.add("567890", "Петрова");
        passports.add("678901", "Иванов");
        
        System.out.println(passports.getByLastName("Иванов"));
   
    }
    
}
