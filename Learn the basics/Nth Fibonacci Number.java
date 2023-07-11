import java.util.Scanner;
public class Solution {
	public static int fib(int n){
		int firsttTerm = 0,secondTerm = 1;
		if (n<=1){
			return n;
		}
		
		for(int i=0;i<n-1;i++){
			int newTerm = firsttTerm + secondTerm;
			firsttTerm = secondTerm;
			secondTerm = newTerm;
		}
		return secondTerm;
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(fib(n));
		


		}
	}
