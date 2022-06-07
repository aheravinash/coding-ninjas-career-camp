import java.util.*;
public class solution {
	public static void makeRowsCols0(int [][]input) {
		// Write your code here
		int row = input.length;
        int col = input[0].length;
        HashMap<Integer,Integer> rowmap = new HashMap<>(row);
        HashMap<Integer,Integer> colmap = new HashMap<>(col);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
               	if(input[i][j] == 0){
                   	if( ! rowmap.containsKey(i)) rowmap.put(i, 1);
                    if( ! colmap.containsKey(j)) colmap.put(j, 1);
               	}
            }
        }
        for(int i : rowmap.keySet()){
            for(int k = 0; k < col; k++) input[i][k] = 0;
        }
        for(int j : colmap.keySet()){
            for(int k = 0; k < row; k++) input[k][j] = 0;
        }
	}
}
