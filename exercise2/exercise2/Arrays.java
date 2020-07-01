package exercise2;

public class Arrays {


    public static void main(String[] args) {
        //Take the arrays.js file, and refactor the code into Java in this file.
        int[] nums = {10, 23, 3, 4, 5, 2, 1};
        printNums(nums);
        String[] greetings = {"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
        printGreeting(greetings);
        boolean[] binaries = {false, true, true, true, false, false, false, true, true, true, true, true, false, true, false, false, true, false};
        printBinaries(binaries);

    }
    private static void printNums(int[] array){
            for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }

    private static void printGreeting(String[] array){
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }
    private static void printBinaries(boolean[] array){
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }
}

    //void printGreetings() {};
    //void printBinaries() {};










