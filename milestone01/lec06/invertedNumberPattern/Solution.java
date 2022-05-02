import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		for(int i = n; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
