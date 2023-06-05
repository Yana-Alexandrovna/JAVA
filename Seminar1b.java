

public class Seminar1b {
    public static void main(String[] args) { 
        String line = "Добро пожаловать на курс по Java";
        String res = reverseLine(line);
        System.out.println(res);
    }



    static String reverseLine(String line){
        String[] array = line.split(" ");
        String res = "";
        for (int i = array.length - 1; i >= 0; i--) {
            res += array[i];
            res += " ";
        }
        return res;
    }
}

