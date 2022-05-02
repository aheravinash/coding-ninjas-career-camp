import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(),
			c = s.nextInt();
		if(c == 1){
            int sum = 0;
            for(int i = 1; i <= n; i++) sum += i;
            System.out.println(sum);
        }
        else if(c == 2){
            int prod = 1;
            for(int i = 1; i <= n; i++) prod *= i;
            System.out.println(prod);
        }
        else{
            System.out.println(-1);
        }
	}
}
