import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),
            spaces = n - 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < spaces; j++) System.out.print(" ");
            for(int j = i; j >= 1; j--) System.out.print(j);
            for(int j = 2; j <= i; j++) System.out.print(j);
            System.out.println();
            spaces--;
        }
	}
}

