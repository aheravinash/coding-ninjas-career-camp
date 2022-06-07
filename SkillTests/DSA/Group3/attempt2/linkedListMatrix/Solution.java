
/*
class Node{
    int data;
    Node right,down;
    Node(int data){
        this.data=data;
        right=null;
        down=null;
    }
}
*/
public class Solution{
    static Node construct(int arr[][],int n)
    {
        //Add your code here.
        Node head = new Node(arr[0][0]);
        Node row = new Node(arr[0][1]);
        head.right = row;
        for(int j = 2; j < n; j++){
            row.right = new Node(arr[0][j]);
            row = row.right;
        }
       	row = new Node(arr[1][0]);
        head.down = row;
        Node tail = new Node(arr[1][1]);
        row.right = tail;
        for(int j = 2; j < n; j++){
            tail.right = new Node(arr[1][j]);
            tail = tail.right;
        }
        for(int i = 2; i < n; i++){
            row.down = new Node(arr[i][0]);
            row = row.down;
            tail = new Node(arr[i][1]);
            row.right = tail;
            for(int j = 2; j < n; j++){
                tail.right = new Node(arr[i][j]);
                tail = tail.right;
            }
        }
        return head;
    }

}
