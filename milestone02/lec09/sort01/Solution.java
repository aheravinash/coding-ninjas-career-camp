public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int n = arr.length, swap_i = 0;
		for(int i = 0; i < n -1; i++){
			if(arr[i] == 0) ++swap_i;
			else{
				if(arr[i+1] == 0){
					arr[swap_i] = 0;
					arr[i+1] = 1;
					++swap_i;
				}
			}
		}
    }
}
