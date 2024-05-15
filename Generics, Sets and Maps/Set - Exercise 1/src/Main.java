import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("How many students for course A?");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter number of #" + (1 + i) + " student:");
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.println("How many students for course B?");
        int m = sc.nextInt();
        for (int i = 0 ; i < m ; i++){
            System.out.println("Enter number of #" + (1 + i) + " student:");
            int number = sc.nextInt();
            b.add(number);
        }

        System.out.println("How many students for course C?");
        int r = sc.nextInt();
        for (int i = 0 ; i < r ; i++){
            System.out.println("Enter number of #" + (1 + i) + " student:");
            int number = sc.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>(a);

        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}