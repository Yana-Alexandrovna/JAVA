public class Seminar1c {
    public static void main(String[] args) { 
        int a = 3;
        int b = 0;
        System.out.println(pow(a,b));
}

static double pow(int a, int b){
    if (b == 0 || a == 1){
        return 1;
    }
    double a1 = a;
    double res = 1;
    if (b < 0){
        b = -b;
        a1 = 1.0/a;
    }
    for (int i = 0; i < b; i++){
        res *=a1;
    }
    return res;
}
}