import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int sum = 0;
		for(int i = 1; i <= n; i++){
			System.out.print(1);
			for(int j = 2; j <= i; j++){
				System.out.print("+" + j);
			}
			sum += i;
			System.out.println("=" + sum);
		}
	}
}
