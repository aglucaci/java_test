//Assignment 1

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Q1 part 1
        System.out.println("Expecting 1, got: " + countDigits(0));
        System.out.println("Expecting 1, got: " + countDigits(9));
        System.out.println("Expecting 2, got: " + countDigits(12));
        System.out.println("Expecting 3, got: " + countDigits(120));
        System.out.println("Expecting 3, got: " + countDigits(900));
        System.out.println("Expecting 4, got: " + countDigits(1000));
        System.out.println("Expecting 5, got: " + countDigits(10000));
        System.out.println("Expecting 6, got: " + countDigits(100000));
        System.out.println("Expecting 6, got: " + countDigits(700640));

        //Q1 part 2
        System.out.println("\n");
        System.out.println("Expecting 3, got: " + nthDigitBack(0, 123));
        System.out.println("Expecting 2, got: " + nthDigitBack(1, 123));
        System.out.println("Expecting 1, got: " + nthDigitBack(2, 123));
        System.out.println("Expecting 0, got: " + nthDigitBack(3, 123));
        System.out.println("Expecting 0, got: " + nthDigitBack(0, 0));
        System.out.println("Expecting 8, got: " + nthDigitBack(3, 18023));

        //Q1 part 3

    }

    public static int countDigits(int num) {
        /* May need to use absolute value of num */
        int x;
        int divider = 10;
        int count = 1;
        //if (num < divider){
        //    return 1;
        //}
        //x = num / divider;
        x = num; // abs of num
        while (x >= divider) {
            x = x / divider;
            count += 1;
            //System.out.println(x);
        }
        return count;

    }

    public static int nthDigitBack(int n, int num) {
        // check if this is a bogus call
        if (n > countDigits(num)) {
            return 0;
        }
        int x;
        x = num;
        /*
        while (n > 0) {
            x = x % 10;
            n -= 1;
        }
        */
        // return (x % 10) / n;
        for (int i = 0; i <= n - 1; i++){
            x = x / 10;
            //System.out.println(x);
        }
        x = x % 10;
        // retrieve nth digit from the right side of num
        return x;
    }

    public static
}
