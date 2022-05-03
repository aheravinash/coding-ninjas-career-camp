import java.util.*;
import java.lang.*;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),
            stars = 0;
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= i; j++) System.out.print(j);
            for(int j = 0; j < stars; j++) System.out.print('*');
            for(int j = i; j > 0; j--) System.out.print(j);
            stars += 2;
            System.out.println();
        }
    }
}
