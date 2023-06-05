// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

public class HW3 {
    public static void main(String[] args) {
        int i, j;
        boolean check;
        System.out.print(1 + " ");
        for (i = 2; i < 1000; i++) {
            check = true;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }
    }
}