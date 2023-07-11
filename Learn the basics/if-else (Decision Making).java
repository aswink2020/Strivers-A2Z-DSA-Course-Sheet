import java.util.Scanner;
public class Solution {
    public static String compareIfElse(int a, int b) {
        if (a > b) {
            return "greater";
        } else if (a < b) {
            return "smaller";
        } else {
            return "equal";
        }
    }

    public static void main(String[] args) {
        // Example usage
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String result = compareIfElse(num1, num2);
        System.out.println(result);  // Output: smaller
    }
}
