impprt java.util.Scanner;
public class Solution {
    public static int reverse(int x) {
        int digit = 0,rev =0;
        while(x!=0){
            digit = x%10;
            rev = rev*10+digit;
            x/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        System.out.println(reverse(x));
    }
}
