/*class BinaryTreeNode<T> {
 public T data;
 public BinaryTreeNode<T> left;
 public BinaryTreeNode<T> right;

 public BinaryTreeNode(T data) {
 this.data = data;
 left=null;
 right=null;
 }*/
public class solution {

	static boolean isIsomorphic(BinaryTreeNode<Integer> n1, BinaryTreeNode<Integer> n2) {
		/*Your class should be named solution. 
		*Don't write main().
		*Don't take input, it is passed as function argument.
		*Don't print output.
		*Taking input and printing output is handled automatically.
		*/
        if(n1 == null && n2 == null) return true;
        if(n1 == null || n2 == null) return false;
        if(n1.data.equals(n2.data)){
            boolean ans1 = isIsomorphic(n1.left, n2),
                    ans2 = isIsomorphic(n1.right, n2.left);
            return (ans1 && ans2);
        }
        return false;
	}
}
