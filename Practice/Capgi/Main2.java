package Capgi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("0");
        } else if (checkPrime(a) && checkPrime(b)) {
            System.out.println(Max(a, b));
        } else {
            System.out.println(Math.min(a, b));
        }

        sc.close();
    }

    static int Max(int x, int y) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

    static int Min(int x, int y) {
        int min;
        if (x < y) {
            min = x;
        } else {
            min = y;
        }
        return min;
    }

    static boolean checkPrime(int n) {
        if(n<=1)
        return false;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
