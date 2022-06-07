public class Solution
{

    static int minLandingCover(TreeNode<Integer> root) {
        //Write your code here
        if(root == null) return 0;
        int[] A = new int[3];
        A[0] = 0;	// min no. of landings
        A[1] = 0;	// covered? 0 is false; 1 is true;
        A[2] = 0;	// landing here? 0 is false; 1 is true;
        fun(root, A);
        if(A[1] == 0) A[0]++;
        return A[0];
    }
    
    static void fun(TreeNode<Integer> root, int[] A){
        int n = root.children.size();
        if(n == 0){		// no children; leaf node; needs cover
            A[1] = 0;
            A[2] = 0;
            return;
        }
        boolean landHere = false,
        		covered = false;
        for(int i = 0; i < n; i++){
            fun(root.children.get(i), A);
            if(A[2] == 0 && A[1] == 0) landHere = true;
            if(A[2] == 1) covered = true;
        }
        if(landHere){
            A[0]++;
            covered = true;
            A[1] = 1;
            A[2] = 1;
        }
        else{	// no landing necessary here
            A[2] = 0;
            if(covered){
                A[1] = 1;
            }
        	else A[1] = 0;
        }
    }

    static void printAns(int allowed, int ans)
    {
        if (ans <= allowed)
        {
            System.out.println(ans + " Mission Successful");
        }
        else{
            System.out.println(ans + " Mission Unsuccessful");
        }
    }

}
