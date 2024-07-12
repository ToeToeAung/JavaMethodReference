package MethodRef;

import java.util.function.BiFunction;
public class StaticMethodReference {
public static void main(String[] args) {
    BiFunction<Integer, Integer, Integer>  maxFunction = Math:: max;
    int max = maxFunction.apply(10, 2);
    System.out.println("Maximum number is "+max);
}
}
