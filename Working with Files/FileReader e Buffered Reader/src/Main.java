import java.io.*;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[]{"Good Morniong", "Good afternoon", "Good night"};

        String path = "//home//amorim//Documents//Plantas//Exemplo.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}