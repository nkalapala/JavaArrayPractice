import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        //print numbers 1 to 100 using array
        //datatype object = new datatype with size
        int[] myIntArray1 = new int[100];
        for (int i = 0; i < myIntArray1.length; i++) {
            myIntArray1[i] = i;
            System.out.println(myIntArray1[i]);
        }
       //print names in string array
        String[] myStringArray = {"String1", "String2", "String3", "String4", "String5"};
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }
        //average of numbers in array
        int[] myIntArray2 = {10, 20, 30, 40, 50, 60};
        int total = 0;
        for (int i = 0; i < myIntArray2.length; i++) {
            total += myIntArray2[i];
        }
        System.out.println("Total is " + total);
        int average = total / myIntArray2.length;
        System.out.println("Average value of array is: " + average);

        //ascending order
        int[] a = {6, 9, 3, 5, 8};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
                System.out.println("Ascending order is:" + a[i]);

        }
        //descending order
        int[]b = {23,45,38,79,63,56};
        for (int i=0;i<b.length;i++) {
            for (int j = i + 1; j < b.length;j++){
                if (b[i] < b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
            System.out.println("Descending order is:" +b[i]);
        }

    }
}