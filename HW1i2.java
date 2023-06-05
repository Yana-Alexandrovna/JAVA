
//Задача 1 и 2 Вычислить n-ое треугольного число (сумма чисел от 1 до n) Вычислить n! (произведение чисел от 1 до n)
        
import java.util.Scanner;
public class HW1i2 {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = 0;
    int sum = 0;
    int result = 0;
    System.out.println("Введите НАТУРАЛЬНОЕ число: ");
    if (!scn.hasNextInt()) {
        System.out.println("Ошибка");
    } else {
        n = scn.nextInt();
        if (n < 1)
            System.out.println("Ошибка, Вы ввели отрицательное число");
        else {
            System.out.printf("n-ое треугольного число: " + Triangle(n));
            System.out.println(" ");
            System.out.printf("факториал: " + Factorial(n));
        }
    }
    scn.close();
}


    static int Triangle(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }
        return sum;
    }

    static int Factorial(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= i + 1;
        }
        return result;
    }
}

