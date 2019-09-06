
// Java program to demonstrate working of Arrays.toString()
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {-2, 0, 2, 3, 1, 1, 2};

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i-1] + arr[i+1]){
                System.out.println((arr[i]));
            }
        }



        /*
        int[] arr = {1, 2, 3, 4, 5};
        int total = sum(arr);

        System.out.println("Expected:\t 15");
        System.out.println("Got:\t\t" + total);


        int[] arr1 = new int[100];
        System.out.println(Arrays.toString(arr1));
        */




    }


    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            sum += num;
        }

        return sum;

    }
}
