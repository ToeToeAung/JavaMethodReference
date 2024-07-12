package MethodRef;
import java.util.function.Function;
public class ConstructureReference {
    public static void main(String[] args) {
        Function<char[], String> stringConstructor = String::new; // String Constructor
        char[] charArray = {'J', 'a', 'v', 'a'};
        String newString = stringConstructor.apply(charArray);
        System.out.println(newString);
    }
}
