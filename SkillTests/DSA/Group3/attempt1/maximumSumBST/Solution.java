public class Solution {
    static public int maxSumBST(BinaryTreeNode<Integer> root) 
    {
        // Write your code here
        if(root == null) return 0;
        int[] A = new int[4];
        fun(root, A);
        return A[1];
    }
    
    public static void fun(BinaryTreeNode<Integer> root, int[] A){
        int rootData = root.data.intValue();
        if(root.left == null && root.right == null){
            A[0] = 1;			// isBST; 1 if true; 0 if false
            A[1] = rootData;	// maxSum
            A[2] = rootData;	// minimum node
            A[3] = rootData;	// maximum node
            return;
        }
        if(root.left == null){
            fun(root.right, A);
            if(A[0] == 1 && rootData < A[2]){
                A[1] += rootData;	// update maxSum
                A[2] = rootData; 	// minimum node
            }
			else{
                A[0] = 0;	// not a BST
            }
            return;
        }
        if(root.right == null){
            fun(root.left, A);
            if(A[0] == 1 && rootData > A[3]){
                A[1] += rootData;	// update maxSum
                A[3] = rootData; 	// maximum node
            }
			else{
                A[0] = 0;	// not a BST
            }
            return;
        }
        fun(root.left, A);
        int leftBST 	= A[0],
        	leftMaxSum 	= A[1],
        	leftMin		= A[2],
        	leftMax 	= A[3];
        fun(root.right, A);
        int rightBST	= A[0],
        	rightMaxSum	= A[1],
        	rightMin	= A[2],
        	rightMax 	= A[3];
        if((leftBST & rightBST) == 1 && rootData > leftMax && rootData < rightMin){
            A[1] = leftMaxSum + rootData + rightMaxSum;
            A[2] = leftMin;
            A[3] = rightMax;
        }
        else{
            A[0] = 0;	// not a BST
            A[1] = (leftMaxSum > rightMaxSum ? leftMaxSum : rightMaxSum);
        }
    }
    

}

