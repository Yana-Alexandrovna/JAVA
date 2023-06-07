

public class Seminar2i {
    public static void main (String[] args) {
        res();
    }

    static void res(){
        String[] filesPath = getFilesName("JAVA");
        writeToFile(filesPath);
    }
    static void writeToFile(String[] array){
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
            try(FileWriter writer = new FileWriter("files.txt", false)) {
                for (String s: array){
                    writer.write(s);
                    writer.write("\n");
                }
                writer.flush();
            } catch (Exception e){
                logger.severe(e.toString());
            }
            fileHandler.close();
        }
        static String[] getFilesName(String path){
            File file = new File(path);
            return file.list();
        }
    }
    