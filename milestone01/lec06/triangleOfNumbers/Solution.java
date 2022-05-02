import java.util.Scanner;
public class Solution{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		int middleNum = 1, boundaryNum = 1, spases = n - 1;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < spases; j++){
				System.out.print(' ');
			}
			for(int j = boundaryNum; j < middleNum; j++){
				System.out.print(j);
			}
			for(int j = middleNum; j >= boundaryNum; j--){
				System.out.print(j);
			}
			System.out.println();
			middleNum += 2;
			boundaryNum++;
			spases--;
		}
	}
}
