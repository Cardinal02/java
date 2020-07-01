package exercise2;

import java.util.Arrays;

public class Types {

    public static void main(String[] args) {
        boolean number;
        number = false;
        int[] myArray = new int[]{3, 4, 5, 6, 76, 12, 2};
        String movieA = "Harry and the Hendersons";
        String movieB = "Star Wars";
        char male = 'm';
        char female = 'f';

        System.out.println("The value of the boolean variable number is "+ number);
        System.out.println("The value of the integer array myArray is "+ Arrays.toString(myArray));
        System.out.println("The value of the string movieA is "+ movieA);
        System.out.println("The value of the string movieB is "+ movieB);
        System.out.println("The value of the character variable male is "+ male);
        System.out.println("The value of the character variable female is "+ female);
    }

}

//    This class has syntax errors, that will prevent your other classes from running.  So... work on this file first to resolve the issues.
//    boolean number;
//    const myArray = [3, 4, 5, 6, 76, 12, 2];
//    Character movieA = 'Harry and the Hendersons';
//    Character movieB = 'Star Wars';
//    double male = 'm';
//    double female = 'f';
//
//    //the above instance variables have mistakes with their data types.  Fix the data types so the main method correctly displays the value of all of the variables
//
//    public static void main() {
//        System.out.println("There are variables that have been declared in this Accessible class.  Fix the code so that all the variables can be accessed by the main method.  print out the values of every variable once the code has been refactored.");
//    }
