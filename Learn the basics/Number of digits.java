import java.util.Scanner;
public class Solution {
	public static int count(int n){
		int digit=0;
		while(n!=0){
			digit +=1;
			n/=10;
		}
		return digit;
	}
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(count(n));
	}

}
