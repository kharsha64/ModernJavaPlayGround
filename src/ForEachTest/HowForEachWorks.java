package ForEachTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HowForEachWorks {

    public static void main (String...a) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //Consumer<Integer> action = System.out::println;
        //numberList.stream().forEach(System.out::println);
        //numberList.forEach(System.out::println);
        Print pp = new Print();
        Consumer<Integer> squareNumber = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                integer = integer * integer;
                pp.printer(integer);
            }
        };

        numberList.forEach(squareNumber);

    }
}

class Print {
    public void printer(Object obj) {
        System.out.println(obj.toString());
    }
}
