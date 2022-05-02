import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		char startChar = (char)('A' + n - 1);
		for(int i = 1; i <= n; i++){
			char currChar = startChar;
			for(int j = 0; j < i; j++){
				System.out.print(currChar++);
			}
			startChar--;
			System.out.println();
		}
	}
}

