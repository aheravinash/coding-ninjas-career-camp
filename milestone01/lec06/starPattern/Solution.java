import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int spaces = n - 1, stars = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < spaces; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < stars; j++){
				System.out.print('*');
			}
			System.out.println();
			stars += 2;
			spaces--;
		}
	}
}
