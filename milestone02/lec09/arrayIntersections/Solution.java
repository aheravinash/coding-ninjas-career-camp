
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int n1 = arr1.length, n2 = arr2.length;
		boolean[] printed = new boolean[n2];
		for(int i = 0; i < n1; i++){
			for(int j = 0; j < n2; j++){
				if(arr2[j] == arr1[i] && !printed[j]){
					System.out.print(arr2[j]+" ");
					printed[j] = true;
					break;
				}
			}
		}
		System.out.println();
    }
}
