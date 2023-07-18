import java.util.*;
public class Solution {
    public static int countDigits(int n){
        int count =0;
        int num =Math.abs(n);
        while (num != 0) {
            int digit = num % 10;
            
            if (digit != 0 && n % digit == 0) {
                count++;
            }
            
            num /= 10; 
        }
        return count;   // Write your code here.
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
}
