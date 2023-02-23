import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //o metodo map ira aplicar uma função a cada elemento da stream
        Stream<Integer> str = list.stream().map(x -> x * 10);
        Stream<String> str2 = Stream.of("Maria,João,Pedro");
        Stream<Integer> str3 = Stream.iterate(0, x -> x + 2);
        Stream<Long> str4=Stream.iterate(new Long[]{0L,1l},p-> new Long[]{p[1],p[0]+p[1]}).map(p->p[0]);

        // o metodo toArray() sera responsavel por tranformar cada elemento incluso na lista em um vetor enquanto
        System.out.println(Arrays.toString(str.toArray()));
        System.out.println(Arrays.toString(str2.toArray()));
        System.out.println(Arrays.toString(str3.limit(10).toArray()));
        System.out.println(Arrays.toString(str4.limit(10).toArray()));

    }
}