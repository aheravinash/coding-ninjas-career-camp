
public class Solution {
	public static int findPath(char[][] input, String target){
       //Write your code here
        char[] word = target.toCharArray();
        char word0 = word[0];
        int count = 0;
        int n = input.length;
        if(n == 0) return 0;
        int[] rowlen = new int[n];
        for(int i = 0; i < n; i++){
            rowlen[i] = input[i].length;
        }
        for(int i = 0; i < n; i++){
            int m = rowlen[i];
            for(int j = 0; j < m; j++){
                if(input[i][j] == word0){
                    if(m - j >= word.length){	// Right
                        int k = 1;
                        for(; k < word.length; k++){
                            if(input[i][j + k] != word[k])
                                break;
                        }
                        if(k == word.length){
                            count++;
                            //System.out.format("Word found at i = %d j = %d in direction RIGHT",i,j);
                        }
                    }
                    if(j + 1 >= word.length){	// Left
                        int k = 1;
                        for(; k < word.length; k++){
                            if(input[i][j - k] != word[k])
                                break;
                        }
                        if(k == word.length){
                            count++;
                            //System.out.format("Word found at i = %d j = %d in direction LEFT",i,j);
                        }
                    }
                    if(i + 1 >= word.length){	// Top
                        int k = 1;
                        for(; k < word.length; k++){
                            int imk = i - k;
                            if(rowlen[imk] > j){
                                if(input[imk][j] != word[k])
                                    break;
                            }
                            else break;
                        }
                        if(k == word.length){
                            count++;
                            //System.out.format("Word found at i = %d j = %d in direction TOP",i,j);
                        }
                    }
                    if(n - i >= word.length){	// Bottom
                        int k = 1;
                        for(; k < word.length; k++){
                            int ipk = i + k;
                            if(rowlen[ipk] > j){
                                if(input[ipk][j] != word[k])
                                    break;
                            }
                            else break;
                        }
                        if(k == word.length) count++;
                    }
                }
            }
        }
        return count;
    }
}

