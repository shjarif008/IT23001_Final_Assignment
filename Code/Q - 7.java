import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            if (root1 > 0 && root2 > 0)
                System.out.println("The smallest positive root is: " + Math.min(root1, root2));
            else
                System.out.println("No real roots.");
        }
    }
}
