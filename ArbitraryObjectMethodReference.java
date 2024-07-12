package MethodRef;
import java.util.Arrays;
import java.util.List;

public class ArbitraryObjectMethodReference {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("cat","dog","tiger");
        stringList.forEach(System.out::println);
    }
}
