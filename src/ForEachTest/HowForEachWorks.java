package ForEachTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HowForEachWorks {

    public static void main (String...a) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Consumer<Integer> action = System.out::println;
        numberList.stream().forEach(action);
    }
}
