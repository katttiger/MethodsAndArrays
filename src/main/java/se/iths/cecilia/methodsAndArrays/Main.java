package se.iths.cecilia.methodsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MyClass object = new MyClass();

        String[] stringarray = {"Hello", "World", "!"};
        object.arrayToString(stringarray);
        System.out.println("----");

        int[] intArray = {111, 20, 345};
        System.out.println("Array: " + Arrays.toString(intArray));
        System.out.println(object.findMaxNumberInArray(intArray));

        System.out.println("----");


        System.out.println("Enter first double: ");
        double a = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter second double; ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Highest number: " + object.findHighestNumber(a, b));

        System.out.println("----");
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter first name: ");
        String lastName = sc.nextLine();
        object.printFullName(firstName, lastName);
    }
}
