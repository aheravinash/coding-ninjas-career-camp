import java.util.Scanner;
public class Solution{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        int[] A = takeArrayInput(n);
        System.out.println(maximumSubarraySum(n, A));
    }
    public static int maximumSubarraySum(int n, int[] A){
        int maxSum = 0;
        for(int i = 0; i < n; i++){
            int sum = A[i];
            if(sum > maxSum) maxSum = sum;
            for(int j = i + 1; j < n; j++){
                sum += A[j];
                if(sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }
    public static int[] takeArrayInput(int n){
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = s.nextInt();
        }
        return A;
    }
}