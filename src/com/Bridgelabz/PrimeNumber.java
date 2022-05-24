package com.Bridgelabz;

public class PrimeNumber {
    static int i, m;
    static int flag = 0;
    static int number = 12;

    public static void main(String[] args) {
        m = number / 2;

        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number ");
        } else {
            for (i = 2; i <= m; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number");
                }
            }
        }
        if (flag == 0) {
            System.out.println(number + " is prime number");
        }
    }
}
