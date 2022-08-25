package br.com.tiagobarbosa.main;

import java.util.ArrayList;
import java.util.List;

public class TestWrappers {
    public static void main(String[] args) {

        int age = 30;
        Integer ageRef = Integer.valueOf(age); // Autoboxing
        System.out.println(ageRef);
        System.out.println(ageRef.doubleValue());
        System.out.println("Min value for Integer: " + Integer.MIN_VALUE);
        System.out.println("Max value for Integer: " + Integer.MAX_VALUE);
        System.out.println("Integer size: " + Integer.SIZE);
        System.out.println("Integer bytes: " + Integer.BYTES);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(age); // Autoboxing

        System.out.println("\n--------------------------------------------\n");
        Integer ageRef2 = Integer.valueOf(30); // Autoboxing
        System.out.println(ageRef2.intValue()); // Unboxing

        Double aDouble = Double.valueOf(23.4);
        System.out.println(aDouble.doubleValue());

        Boolean aFalse = Boolean.FALSE;
        Boolean aTrue = Boolean.TRUE;
        System.out.println(aFalse.booleanValue());

        Number refNumber = Float.valueOf(32.9F);

        List<Number> listNumbers = new ArrayList<>();
        listNumbers.add(ageRef2);
        listNumbers.add(aDouble);
        listNumbers.add(10);
        listNumbers.add(10.42);
    }
}
