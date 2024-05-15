import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

       Map<String, String> cookies = new TreeMap<>();

       cookies.put("username", "Maria");
       cookies.put("email", "maria@gmail.com");
       cookies.put("phone", "99771122");

       System.out.println();

       System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
        System.out.println();
       cookies.remove("email");
        System.out.println();
       System.out.println("ALL COOKIES");
       for (String key : cookies.keySet()){
           System.out.println(key + ": " + cookies.get(key));
       }

       cookies.put("phone", "08000000");

        System.out.println();
        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        System.out.println("Phone number: " + cookies.get("phone"));

        System.out.println("Email: " + cookies.get("email"));

        System.out.println("Size: " + cookies.size());
    }
}