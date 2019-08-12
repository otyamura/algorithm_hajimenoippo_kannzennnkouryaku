import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;

        a = scn.nextInt();
        b = scn.nextInt();

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;

            }
        }

        System.out.println(a);

        System.out.print("Type two numbers to get their GCD.\nFirst Number:");
        a = scn.nextInt();
        System.out.print("Second Number:");
        System.out.println("GCD is " + getGCD(a, scn.nextInt()));
    }

    // Get Greatest Common Measure from two numbers.
    // Using Euclidean Algorithm
    // site:https://ja.wikipedia.org/wiki/%E3%83%A6%E3%83%BC%E3%82%AF%E3%83%AA%E3%83%83%E3%83%89%E3%81%AE%E4%BA%92%E9%99%A4%E6%B3%95
    static int getGCD(int big, int small) {
        int mod = big % small;
        if (mod == 0)
            return small;
        else
            return getGCD(small, mod);
    }
}