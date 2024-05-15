import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path:");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getParent: " + path.getPath());
        System.out.println(path.createNewFile());


//        File[] folders = path.listFiles(File :: isDirectory);
//        System.out.println("FOLDERS:");
//        for (File folder : folders){
//            System.out.println(folder);
//        }
//
//        File[] files = path.listFiles(File ::isFile);
//        System.out.println("FILES: ");
//        for (File file : files){
//            System.out.println(file);
//        }
//
//        boolean success = new File(strPath + "//subdir").mkdir();
//        System.out.println("Directory created succefully: "+ success);


        sc.close();
    }
}