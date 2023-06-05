//Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)


import java.util.Scanner;
 
// Driver class
public class HW4 {
    // main function
    public static void main(String[] args)
    {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Введите действие");
        char math = sc.next().charAt(0);
        double res = 0;
        switch (math) {
        case '+':
            res = a + b;
            break;
        case '-':
            res = a - b;
            break;
        case '*':
            res = a * b;
            break;
        case '/':
        if (b == 0) {
            System.out.println("Деление на ноль!");
        }
        else{
            res = a / b;
        }
            break;
        default:
            System.out.println("Вы ввели неверное действие");
        }
        System.out.printf("Результат" + res);
       
    }
}