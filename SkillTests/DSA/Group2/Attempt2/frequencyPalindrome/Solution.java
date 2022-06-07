import java.util.*;
public class Solution {
	public static void main(String[] args) {
		/* Your class should be named Solution.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        //char[] A = input.toCharArray();
        int q = s.nextInt();
        int[] A = new int[q];
        int[] B = new int[q];
        for(int i = 0; i < q; i++){
            A[i] = s.nextInt();
            B[i] = s.nextInt();
        }
        s.close();
        for(int i = 0; i < q; i++){
            int a = A[i],
            	b = B[i],
            	n = b - a + 1,
            	c = (a + b) / 2;
            HashMap<Character, Integer> map = new HashMap<>(n/2);
            boolean ispalindrome = true;
            if((n & 1) == 0){
                for(int j = a; j <= c; j++){
                    Character key = input.charAt(j);
                    if(map.containsKey(key)) map.replace(key, map.get(key).intValue() + 1);
                    else map.put(key, 1);
                }
                for(int j = c + 1; j <= b; j++){
                    Character key = input.charAt(j);
                    if(map.containsKey(key)){
                        int freq = map.get(key).intValue();
                        if(freq > 1) map.replace(key, freq - 1);
                        else map.remove(key);
                    }
                    else{
                        System.out.println("No");
                        ispalindrome = false;
                        break;
                    }
                }
                if(ispalindrome) System.out.println("Yes");
            }
            else{
                for(int j = a; j < c; j++){
                    Character key = input.charAt(j);
                    if(map.containsKey(key)) map.replace(key, map.get(key).intValue() + 1);
                    else map.put(key, 1);
                }
                for(int j = c + 1; j <= b; j++){
                    Character key = input.charAt(j);
                    if(map.containsKey(key)){
                        int freq = map.get(key).intValue();
                        if(freq > 1) map.replace(key, freq - 1);
                        else map.remove(key);
                    }
                    else{
                        System.out.println("No");
                        ispalindrome = false;
                        break;
                    }
                }
                if(ispalindrome) System.out.println("Yes");
            }
        }
	}

}

