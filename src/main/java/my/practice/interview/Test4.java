package my.practice.interview;

public class Test4 {

    public static void main(String[] args) {

        int n = 121, temp = n, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10; // 0 + 121%10 = 1   // 10 + 12%10 = 12      // 120 + 1%10 = 121
            temp /= 10; // 121/10 = 12      // 12/10 = 1    // 1/10 = 0
        }

        System.out.println(n == rev);

    }
}
