import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args)  {

        List<Integer> list = Arrays.asList(3,4,5,6,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String>  st2 = Stream.of("Teste", "Teste2");
        System.out.println(Arrays.toString(st2.toArray()));

    }
}
