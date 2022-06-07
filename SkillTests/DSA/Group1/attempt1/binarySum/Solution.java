import java.util.*;
public class Solution {


	public static void main(String[] args) {
		/* Your class should be named Solution.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        char zero = '0', one = '1';
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
		for(int i = 0; i < t; i++){
            char[] A = s.next().toCharArray();
            char[] B = s.next().toCharArray();
            int n = A.length, m = B.length;
            if(m > n){
                char[] temp = A;
                A = B;
                B = temp;
                int c = m;
                m = n;
                n = c;
            }
            char[] C = new char[n];
            int j = n - 1, k = m - 1, p = n - 1;
            char carry = zero;
            while(k >= 0){
                int sum = A[j] + B[k] + carry;
                char addChar = zero;
                // 0 -> 48; 1 -> 49 (ASCII); 
                if(sum == 144){		// 0 + 0 + 0 = 00
                    carry = zero;
                }
                else if(sum == 145){	// 0 + 0 + 1 = 01
                    addChar = one;
                    carry = zero;
                }
                else if(sum == 146){	// 0 + 1 + 1 = 10
                    carry = one;
                }
                else{	//(sum == 147)	// 1 + 1 + 1 = 11
                    addChar = one;
                    carry = one;
                }
                C[p] = addChar;
                p--;
                j--;
                k--;
            }
            while(j >= 0 && carry == one){
                int sum = A[j] + carry;
                char addChar = zero;
                if(sum == 97){			// 0 + 1 = 01
                    addChar = one;
                    carry = zero;
                }
                else if(sum == 98){		// 1 + 1 = 10
                    carry = one;
                }
                C[p] = addChar;
                j--;
                p--;
            }
            while(j >= 0){
                C[p] = A[j];
                j--;
                p--;
            }
            String sum = String.valueOf(C);
            if(carry == one) sum = '1' + sum;
            System.out.println(sum);
        }
	}

}

