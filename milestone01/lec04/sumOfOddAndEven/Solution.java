// sum of odd and even digits of a number

import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(),
			evenSum = 0,
			oddSum = 0;
		while(n != 0){
			int digit = n % 10;
			if((digit & 1) == 0) evenSum += digit;
			else oddSum += digit;
			n = n / 10;
		}
		System.out.println(evenSum + " " + oddSum);
	}
}
