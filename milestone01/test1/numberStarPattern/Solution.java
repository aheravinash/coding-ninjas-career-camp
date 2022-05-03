import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j > i; j--) System.out.print(j);
            System.out.print('*');
            for(int j = i - 1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }
}
