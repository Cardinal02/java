package udemy_exercises;

import java.util.Arrays;
import java.util.Scanner;


class Sorting {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] sortIntegers(int[] nums) {
        int[] sortedArray = Arrays.copyOf(nums,nums.length);
        boolean flag =true;
        int temp;
        while (flag){
            flag=false;
            for(int i=0;i<sortedArray.length-1;i++){
                if (sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]= temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

    public static void printNums(int[] array) {
            System.out.println(Arrays.toString(array));
   }

    public static int[] getNums(int capacity) {
        int[] enteredArray = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r" );
        for(int i=0;i<enteredArray.length;i++){
            enteredArray[i]= scanner.nextInt();
        }
        return enteredArray;
    }

    private static void reverse(int[] numbers) {

        int maxIndex = numbers.length -1;
        int halfLength = numbers.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[maxIndex -i];
            numbers[maxIndex - i] = temp;
        }
    }
//    void reverse(int[] numbers) {
//
//    }

    public static void main(String[] args) {
        System.out.println("This is the Sorting Class");
        int[] myArray = getNums(5);
        printNums(myArray);
        System.out.println("Sorted array is " + Arrays.toString(sortIntegers(myArray)));
        reverse(myArray);
        printNums(myArray);
    }

}
/*

public class Main {

    public static void main(String[] args) {

        int[] array = { 1, 5, 3, 7, 11, 9, 15};

        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }
}
*/
