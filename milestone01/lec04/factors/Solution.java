// print all factors of a number

import java.util.Scanner;
import java.lang.Math;
import java.util.Stack;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(),
			lim = (int)(Math.sqrt(n));
		s.close();
		Stack<Integer> stack = new Stack<>();
		System.out.print("1 ");
		stack.push(n);
		for(int i = 2; i <= lim; i++){
			if(n % i == 0){
				System.out.print(i + " ");
				stack.push(n / i);
			}
		}
		if(lim * lim == n) stack.pop();
		while(stack.size() > 0){
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}
}
