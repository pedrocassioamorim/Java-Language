import java.util.Set;
import java.util.TreeSet;

public class Main_TreeSet {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set){
            System.out.println(p);
        }

    }
}