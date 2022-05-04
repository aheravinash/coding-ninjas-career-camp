import java.util.*;
import java.lang.*;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = s.nextInt();
        }
        int e = s.nextInt();
        s.close();
        System.out.println(linearSearch(A, e));
    }
    public static int linearSearch(int[] A, int e){
        for(int i = 0; i < A.length; i++){
            int elem = A[i];
            if(elem == e) return i;
        }
        return -1;
    }
}
