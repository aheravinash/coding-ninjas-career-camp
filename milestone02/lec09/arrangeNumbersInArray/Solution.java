import java.util.*;
import java.lang.*;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
      /*  int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = s.nextInt();
        }
        s.close();
        System.out.println();
      */
        arrangeNumbers(n);
    }
    public static void arrangeNumbers(int n){
        int[] A = new int[n];
        int j = 0, i = 1;
        for(; i <= n; i += 2){
            A[j++] = i;
        }
        i = n;
        if((i & 1) == 1) i--;
        for(; i > 1; i -= 2){
            A[j++] = i;
        }
        printArray(A);
    }
    public static void printArray(int[] A){
        System.out.println("*** Printing Array ***");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("\n***");
    }
}
