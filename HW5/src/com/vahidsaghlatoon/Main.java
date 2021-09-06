package com.vahidsaghlatoon;

public class Main {

    public static void main(String[] args) {
        // is prime method
//        System.out.println(isPrime(23, 2));
        Container container = new Container();
        container.menu();
    }

    public static boolean isPrime(int num, int div) {
        if (num < 2)
            return true;
        else if (div == num / 2)
            return true;
        else if (num % div == 0)
            return false;
        else
            return isPrime(num, div + 1);
    }
}
