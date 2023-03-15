import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> MyList= Arrays.asList(1,2,3,4,5,6,7,8);
         System.out.println("-----takeWhile-----");
        MyList.stream()
                .takeWhile(e->e>4)
                .forEach(System.out::println);

        System.out.println("-----dropWhile-----");
        MyList.stream()
                .dropWhile(e->e>4)
                .forEach(System.out::println);
    }
}