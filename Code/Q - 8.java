import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) System.out.println("Letter");
        else if (Character.isWhitespace(ch)) System.out.println("Whitespace");
        else if (Character.isDigit(ch)) System.out.println("Digit");
    }
}
