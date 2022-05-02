import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int spaces = n - 1;
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < spaces; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j ++){
				System.out.print(j);
			}
			System.out.println();
			spaces--;
		}
	}
}
