import java.util.*;
/***********
 
Following is the Linked list node structure already written 
 
class ListNode<t> {
	public t data;
	 public ListNode<t> next;
	 public ListNode(t data)
	 {
		 this.data=data;
	 }
}

************/


public class solution {

	public static void make2List(ListNode<Integer> head) {
		// Write your code here
		Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();
        int i = 0;
        while(head != null){
            if((i & 1) == 0){
                A.push(head.data);
            }
            else{
                B.push(head.data);
            }
            head = head.next;
            i++;
        }
        while(A.size() > 0){
            System.out.print(A.pop() + " ");
        }
        System.out.println();
        while(B.size() > 0){
           System.out.print(B.pop() + " ");
        }
	}
}


