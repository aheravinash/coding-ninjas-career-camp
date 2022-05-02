import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int spaces = (n - 1) / 2, stars = 1;
		while(stars <= n){
			for(int j = 0; j < spaces; j++){
				System.out.print(' ');
			}
			for(int j = 0; j < stars; j++){
				System.out.print('*');
			}
			System.out.println();
			spaces--;
			stars += 2;
		}
		spaces++;
		stars -= 2;
		if((n & 1) == 1){
			spaces++;
			stars -= 2;
		}
		while(stars >= 1){
			for(int j = 0; j < spaces; j++){
				System.out.print(' ');
			}
			for(int j = 0; j < stars; j++){
				System.out.print('*');
			}
			System.out.println();
			spaces++;
			stars -= 2;
		}
	}
}
