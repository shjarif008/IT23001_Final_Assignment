import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.equals(new StringBuilder(s).reverse().toString()) ? s + " is a palindrome." : s + " is not a palindrome.");
    }
}
