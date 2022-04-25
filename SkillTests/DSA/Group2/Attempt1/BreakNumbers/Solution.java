// Solution to Break Numbers problem

import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		breakNumbers(n, "", 1);
	}
	public static void breakNumbers(int n, String strToPrint, int startIndex){
		for(int i = startIndex; i <= n; i++){
			String strToPrint1 = strToPrint + i + " ";
			int nmi = n - i;
			if(nmi == 0){
				System.out.println(strToPrint1);
				return;
			}
			else if(nmi >= i) breakNumbers(n - i, strToPrint1, i);
		}
	}
}
