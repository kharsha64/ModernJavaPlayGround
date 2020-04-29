package LearnOptional;

import java.util.Optional;

public class OptionalBasics {

    public static void main (String... a) {
        //Optional<String> gender = Optional.of("M");
        Optional<String> gender = null;

        System.out.println("gender : " + gender);
        //System.out.println("gender value : " + gender.ifPresent(gender.get()));
    }
}
