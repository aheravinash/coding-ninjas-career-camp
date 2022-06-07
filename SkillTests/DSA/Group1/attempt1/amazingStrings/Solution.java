import java.util.*;
public class Solution {
	public static String amazingStrings(String first, String second,String third) {
		// Write your code here.
        int f = first.length(), s = second.length(), t = third.length();
        int fps = f + s;
        if(fps > t || fps < t) return "NO";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < f; i++){
            char curr = first.charAt(i);
            if(map.containsKey(curr)){
                int value = map.get(curr).intValue() + 1;
                map.replace(curr, value);
            }
            else{
                map.put(curr, 1);
            }
        }
        for(int i = 0; i < s; i++){
            char curr = second.charAt(i);
            if(map.containsKey(curr)){
                int value = map.get(curr).intValue() + 1;
                map.replace(curr, value);
            }
            else{
                map.put(curr, 1);
            }
        }
        for(int i = 0; i < t; i++){
            char curr = third.charAt(i);
            if(map.containsKey(curr)){
                int value = map.get(curr).intValue();
                if(value == 0) return "NO";
                map.replace(curr, value - 1);
        	}
            else return "NO";
        }
        return "YES";
	}
}

