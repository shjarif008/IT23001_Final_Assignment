import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int low = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            if (isFactorion(i)) System.out.print(i + ", ");
        }
    }

    static boolean isFactorion(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) res *= i;
        return res;
    }
}
