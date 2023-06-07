public class Seminar2a {
    
public static void main(String[] args) {     
    char a = 'a';
    char b = 'b';
    int n = 10;
    System.out.println(res(a, b, n));
}

static String res(char c1, char c2, int n) {
 if (n%2 != 0){
    return "Введено нечетное число";
 }
 StringBuilder stringBuilder = new StringBuilder();
 for (int i = 0; i < n / 2; i++){
    stringBuilder.append(c1);
    stringBuilder.append(c2);
 }
 return stringBuilder.toString();
}
}
