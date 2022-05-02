import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int middleNum = 1;
		System.out.println('*');
		while(middleNum <= n){
			System.out.print('*');
			for(int j = 1; j < middleNum; j++){
				System.out.print(j);
			}
			for(int j = middleNum; j >= 1; j--){
				System.out.print(j);
			}
			System.out.println('*');
			middleNum++;
		}
		middleNum -= 2;
		while(middleNum >= 1){
			System.out.print('*');
			for(int j = 1; j < middleNum; j++){
				System.out.print(j);
			}
			for(int j = middleNum; j >= 1; j--){
				System.out.print(j);
			}
			System.out.println('*');
			middleNum--;
		}
		System.out.println('*');
	}
}
