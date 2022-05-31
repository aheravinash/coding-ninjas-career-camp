import java.util.HashMap;
/* 

    Following is the class defined to represent the node of a generic tree

    class TreeNode<T> {
        T data;
        ArrayList<TreeNode<T>> children;

        public TreeNode(T data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        public int numChildren() {
            return this.children.size();
        }

        public TreeNode<T> getChild(int index) {
            if (index > this.children.size()) {
                return null;
            }

            return this.children.get(index);
        }
    }

*/


public class Solution {


    public static int countSpecialNodes(TreeNode<Integer> root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = fun(root, map);
        return count;
    }
    
    public static int fun(TreeNode<Integer> root, HashMap<Integer, Integer> map){
        if(root == null) return 0;
        Integer key = root.data;
        if(map.containsKey(key)) return 0;
        map.put(key,1);
        int count = 1,
        	n = root.children.size();
        for(int i = 0; i < n; i++){
            count += fun(root.children.get(i), map);
        }
        map.remove(key);
        return count;
    }
}
