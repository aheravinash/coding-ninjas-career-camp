import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(),
            n = 1,
            term;
        s.close();
        for(int i = 1; i <= x;){
            term = 3 * n + 2;
            if(term % 4 == 0){
                n++;
                continue;
            }
            System.out.print(term + " ");
            n++;
            i++;
        }
        System.out.println();
    }
}
