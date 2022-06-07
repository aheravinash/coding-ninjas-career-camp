import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
        for(int k = 0; k < t; k++){
            int n = s.nextInt();
            int[] 	fish 		= new int[n],
            	  	right 		= new int[n],
            		left		= new int[n];
            for(int i = 0; i < n; i++){
                fish[i] = s.nextInt();
            }
            for(int i = 0; i < n; i++){
            	spanleft(fish, left, i);
            }
            for(int i = n - 1; i >= 0; i--){
                spanright(n, fish, right, i);
            }
            int maxFish = -1,
            	maxCount = -1;
            String maxDirection = "";
            for(int i = 0; i < n; i++){
                int direction = s.nextInt();
                if(direction == 1){		// Right
                    int count = right[i];
                    if(count > maxCount){
                        maxCount = count;
                        maxFish = fish[i];
                        maxDirection = "Right";
                    }
                    else if(count == maxCount){
                        int thisFish = fish[i];
                        if(thisFish > maxFish){
                            maxFish = thisFish;
                            maxDirection = "Right";
                        }
                    }
                }
                else{					// Left
					int count = left[i];
                    if(count > maxCount){
                        maxCount = count;
                        maxFish = fish[i];
                        maxDirection = "Left";
                    }
                    else if(count == maxCount){
                        int thisFish = fish[i];
                        if(thisFish > maxFish){
                            maxFish = thisFish;
                            maxDirection = "Left";
                        }
                    }
                }
            }
            System.out.println(maxFish + " " + maxDirection);
        }
	}
    public static void spanleft(int[] fish, int[] left, int i){
        int currFish = fish[i],
        	j = i - 1,
        	nextFish = currFish - 1;
        while(j >= 0 && nextFish < currFish){
            nextFish = fish[j];
            j--;
        }
        if(nextFish >= currFish){
            left[i] = 1 + left[j + 1];
        }
    }
    public static void spanright(int n, int[] fish, int[] right, int i){
        int currFish = fish[i],
        	j = i + 1,
        	nextFish = currFish - 1;
        while(j < n && nextFish < currFish){
            nextFish = fish[j];
            j++;
        }
        if(nextFish >= currFish){
            right[i] = 1 + right[j - 1];
        }
    }

}

