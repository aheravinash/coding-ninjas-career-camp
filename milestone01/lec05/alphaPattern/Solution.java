import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		char printChar = 'A';
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < i; j++){
				System.out.print(printChar);
			}
			System.out.println();
			printChar++;
		}
	}
}
