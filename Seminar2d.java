import java.io.FileWriter;
import java.lang.reflect.WildcardType;

public class Seminar2d {
    public static void main (String[] args) {
        String line = "TEST";
        int n = 10;
        res(line,n);
    }

    static void res(String line, int n){
        String s = stringRepeat(line, n);
        writeToFile(s);
    }

    static String stringRepeat(String line, int n){
        return line.repeat(n);
    }

    static void writeToFile(String text){
        try ( FileWriter writer = new FileWriter("test.txt", false);) {
        writer.write(text);
        writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        } 
    }
}
