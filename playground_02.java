/*
some examples from: https://www.cs.utexas.edu/~scottm/cs307/codingSamples.htm

 */


package com.company;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        out.println("Hello World! 2019 (BIOINFORMATICS)");
        out.println("Poopie");

        another_one();
        another_two();

        out.println("10 Factorial");
        out.println(factorial(10));
    }

    public static void another_one() {
        out.println("in poopie");

    }

    private static void another_two() {
        out.println("in poopie two ");

    }

    public static int factorial(int n) {
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }




}
