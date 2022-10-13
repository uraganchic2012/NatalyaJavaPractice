package Homework11;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
//        Create a new file Homework11.java file with Main method in IntelliJ IDEA
//        Declare Array List of Integers #1 with values: -2, -3, 6, 3
//        Declare Array List of Integers #2 with values: -2, -4, 5,-3
//        Declare Array List of Array Lists of Integers #3
//        Include Array Lists #1 and #2 into the #3
//        Find a minimum value of Array List #3 and print it to the console
//        Create a new branch and commit your changes
//        Push your code to a remote repository
//        Create a pull request
//        Copy and paste the link of the pull request (or your branch) to the field below, so we can check your homework
//        List<Integer> arrayListOfInt1 = new ArrayList<Integer>(Arrays.asList(-2,-3,6,3));
        ArrayList<Integer> arrayListOfInt1 = new ArrayList<Integer>();
        arrayListOfInt1.add(-2);
        arrayListOfInt1.add(-3);
        arrayListOfInt1.add(6);
        arrayListOfInt1.add(3);

        System.out.println(arrayListOfInt1);

        for (Integer i : arrayListOfInt1) {
            System.out.println(i);
        }
//        for(Integer j=0; j <= arrayListOfInt1.size(); j++){
//        }
//        System.out.println(arrayListOfInt1);

        ArrayList<Integer> arrayListOfInt2 = new ArrayList<Integer>();
        arrayListOfInt2.add(-2);
        arrayListOfInt2.add(-4);
        arrayListOfInt2.add(5);
        arrayListOfInt2.add(-3);

        System.out.println(arrayListOfInt2);

        ArrayList<ArrayList<Integer>> arrayListOfInt3 = new ArrayList<ArrayList<Integer>>();
        arrayListOfInt3.add(arrayListOfInt1);
        arrayListOfInt3.add(arrayListOfInt2);
        System.out.println(arrayListOfInt3);
//        for(int x = 0; x< arrayListOfInt3.size(); x++) {
//            for(int y = 0; y< arrayListOfInt3.get(x).size(); y++){
//                System.out.println(arrayListOfInt3.get(x).get(y) + " ");
//        int arrayListOfIntMin = arrayListOfInt3.get(0);
        int minValue = arrayListOfInt3(0);
        for (int x = 0; x < arrayListOfInt3.size(); x++) {
            for (int y = 0; y < arrayListOfInt3.get(x).size(); y++) {
                if (arrayListOfInt3.get(x) < minValue)
                    System.out.println(arrayListOfInt3.get(x).get(y) + " ");
            }
        }
        System.out.println(arrayListOfInt3);
    }

    private static int arrayListOfInt3(int i) {
        int minValue = arrayListOfInt3(0);
        System.out.println("Minimum value of the arrayListOfInt3 is " + minValue);
    }
}