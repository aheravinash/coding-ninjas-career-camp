import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		if(n < 2) return;
		// sieve of Eratosthenes
		boolean[] notPrime = new boolean[n+1];
		System.out.print(2 + " ");
		for(int i = 3; i <= n; i += 2){
			if( ! notPrime[i]){
				System.out.print(i + " ");
				for(int j = i * i; j <= n; j += i){
					notPrime[j] = true;
				}
			}
		}
		System.out.println();
	}
}
