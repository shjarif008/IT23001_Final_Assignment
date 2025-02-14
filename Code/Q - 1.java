import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        String[] nums = sc.nextLine().split(", ");
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        
        for (String num : nums) {
            int n = Integer.parseInt(num);
            int sum = n * (n + 1) / 2;
            pw.print(sum + ", ");
        }
        
        pw.close();
    }
}
