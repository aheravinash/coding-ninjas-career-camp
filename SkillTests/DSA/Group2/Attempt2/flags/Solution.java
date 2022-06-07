public class Solution {

	public static long find_Ways(int N)
	{
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
		int nm1 = N - 1,
            count = helper(nm1, 'W', '0');
        count += helper(nm1, 'R', '0');
        return count;
	}
    public static int helper(int n, char placed, char preplaced){
        int count = 0,
        	nm1 = n - 1;
        if(nm1 > 0){
        	if(placed == 'W'){
            	count += helper(nm1, 'B', placed);
            	count += helper(nm1, 'R', placed);
        	}
        	else if(placed == 'B'){
            	if(preplaced == 'W') count+= helper(nm1, 'R', placed);
            	else if(preplaced == 'R') count+= helper(nm1, 'W', placed);
        	}
        	else{	// placed == 'R'
            	count += helper(nm1, 'B', placed);
            	count += helper(nm1, 'W', placed);
        	}
        }
        else if(nm1 == 0){
            count++;
        }
        return count;
    }
}

