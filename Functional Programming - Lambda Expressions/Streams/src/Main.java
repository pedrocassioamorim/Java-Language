import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // Como criar uma Stream a partir de uma Coleção: list.
        //Stream<Integer> st1 = list.stream();
        //
        Stream<Integer> st1 = list.stream().map( x -> x*10);

        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");

        System.out.println(Arrays.toString(st2.toArray()));

        //Iterate - criando uma Stream infinita
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);

        //Uso da função limit para estabelecer o limit da stream.
        System.out.println(Arrays.toString(st3.limit(20).toArray()));

        // Sequencia de Fibonacci
        //Stream<Long> st4 = Stream.iterate(new long[]{0L, 1L}, p -> new long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(1000).toArray()));

    }
}