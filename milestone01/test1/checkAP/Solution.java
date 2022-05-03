import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), a0, a1, d, i = 0;
		if(n <= 2){
			System.out.print(true);
			return;
		}
		else{
			a0 = s.nextInt();
			++i;
			a1 = s.nextInt();
			++i;
			d = a1 - a0;
			a0 = a1;
			while(i < n){
				a1 = s.nextInt();
				++i;
				if(a1 == a0 + d){
					a0 = a1;
				}
				else{
					System.out.print(false);
					return;
				}
			}
			System.out.print(true);
		}
//		System.out.print('*');
//		System.out.println();
	}
}
