
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int n = arr.length;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(arr[j] == arr[i]) return arr[j];
			}
		}
		return -1;
    }
}
