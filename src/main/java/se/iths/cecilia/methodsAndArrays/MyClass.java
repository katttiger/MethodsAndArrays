package se.iths.cecilia.methodsAndArrays;

public class MyClass {

    public void arrayToString(String[] stringArray) {
        for (String string : stringArray) {
            System.out.println(string);
        }
    }

    public int findMaxNumberInArray(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double findHighestNumber(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public void printFullName(String firstName, String LastName) {
        System.out.println(firstName + " " + LastName);
    }
}
