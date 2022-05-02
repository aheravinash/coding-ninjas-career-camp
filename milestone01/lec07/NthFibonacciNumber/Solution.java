import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int a = -1, b = 1, c;
		for(int i = 0; i <= n; i++){
			c = b;
			b = a + b;
			a = c;
		}
		System.out.println(b);
	}
}
