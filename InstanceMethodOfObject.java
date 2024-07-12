package MethodRef;
import java.util.function.Supplier;
public class InstanceMethodOfObject {
public static void main(String[] args) {
    String myString = "Hello World";

    Supplier<String> mySupplier =  myString ::toLowerCase;
    System.out.println(mySupplier.get());


}
}
