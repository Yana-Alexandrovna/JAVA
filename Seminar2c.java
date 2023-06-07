public class Seminar2c {
    public static void main(String[] args) { 
       String line = "Потоп";
       String line2 = "gjnfg";
       System.out.println(isPolindrom2(line));
       System.out.println(isPolindrom2(line2));
    }

    static boolean isPolindrom1(String line){
        line = line.toLowerCase();
        for(int i = 0, j = line.length()-1; i < j; i++, j--){
            if(line.charAt(i) != line.charAt(j)){
                return false;
            }
        }
        return true;
    }

    static boolean isPolindrom2(String line){
        line = line.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(line);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(line);
        
    }
}
