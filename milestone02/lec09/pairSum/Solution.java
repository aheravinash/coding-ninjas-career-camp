public class Solution {  

    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int n = arr.length, pairs = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
            	if(arr[j] + arr[i] == x){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
