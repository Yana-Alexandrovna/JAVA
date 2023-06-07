public class Seminar2b {

    public static void main(String[] args) { 
        String line = "aaaabbbcdd";
        System.out.println(res(line));
    }
    

    static String res(String line){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < line.length(); i++){
            if (line.charAt(i) == line.charAt(i-1)){
                count++;
            } else {
                stringBuilder.append(line.charAt(i-1));
                if (count != 1){
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(line.charAt(line.length()-1));
        if (count != 1){
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}
