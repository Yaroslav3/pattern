package pattern.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalTests {

    private static String outherString = "two";

    public static void main(String[] args) {

        functionalInterfaceGame();

//        functionRefferenseGame();

//        streamPlay();

//        List<String> list = new ArrayList<>();
//        Collections.addAll(list, "qwe", "asd", "qweee");
//
//        Stream<String> stringStream = list.stream()
//                .filter(string -> string.length() > 1);
//        list.add("asdweeew");
//        stringStream.forEach(System.out::println);
    }

    private static void streamPlay() {
        List<String> collect = Stream.of("p", "qw", "r", "eee")
                .filter(string -> string.length() > 3)
                .map(FunctionalTests::getStringDescriptions)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    private static String getStringDescriptions(String string) {
        return "String: " + string + " with length" + string.length();
    }

    private static void functionRefferenseGame() {
        String[] words = {"a", "c", "f", "p"};

        Arrays.sort(words, (String::compareToIgnoreCase));
        System.out.println(Arrays.toString(words));
    }

    private static void functionalInterfaceGame() {
        String one = "one";
        String two = outherString;
        Test test = () -> {
            boolean result = one.equalsIgnoreCase(two);
            String notOne;
            if (!result) {
//                 one = outherString;
                notOne = one;
            }
            System.out.println(result);
            return result;
        };
        test.test();
    }
}
