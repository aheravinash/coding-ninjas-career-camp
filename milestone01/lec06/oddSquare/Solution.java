import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		n = 2 * n - 1;
		int endNum = -1;
		for(int i = 1; i <= n; i += 2){
			for(int j = i; j <= n; j += 2){
				System.out.print(j);
			}
			for(int j = 1; j <= endNum; j += 2){
				System.out.print(j);
			}
			System.out.println();
			endNum += 2;
		}
	}
}
