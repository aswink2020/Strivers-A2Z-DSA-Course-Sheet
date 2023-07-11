import java.util.*;

public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        double area = 0;
        switch (ch) {
            case 1:
                area = (double)Math.PI * a[0]*a[0];
                break;
            case 2:
                area = a[0] * a[1];
                break;
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double[] a = new double[2];
        for (int i = 0; i < 2; i++) {
            a[i] = sc.nextDouble();
        }
        double result = areaSwitchCase(ch, a); // Assuming index 0 for circle radius
        System.out.println(result);
    }
}
