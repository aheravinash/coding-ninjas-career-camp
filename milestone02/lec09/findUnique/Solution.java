public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
        int n = arr.length;
		boolean[] twin = new boolean[n];
		for(int i = 0; i < n-1; i++){
			if(twin[i]) continue;
			else{
				for(int j = i+1; j < n; j++){
					if(arr[j] == arr[i]){
						twin[i] = true;
						twin[j] = true;
						break;
					}
				}
				if(!twin[i]) return arr[i];
			}
		}
		if(twin[n-1]) return -1;
		else return arr[n-1];
    }
}
