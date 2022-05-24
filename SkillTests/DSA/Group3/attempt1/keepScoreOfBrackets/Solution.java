import java.util.*;
class Solution {
    static public int scoreOfParentheses(String S) {
        // Write your code here
        Integer ans = 0;
        Stack<Integer> valueStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        Character add = '+',
        		  multiply = '*';
        int n = S.length();
        for(int i = 0; i <  n; i++){
            char currChar = S.charAt(i);
            if(currChar == '('){
                if(ans.equals(0)){
                	valueStack.push(3);
                	operatorStack.push(multiply);
                }
                else{
                    valueStack.push(ans);
                    operatorStack.push(add);
                    ans = 0;
                    valueStack.push(3);
                	operatorStack.push(multiply);
                }
            }
            else{
                Integer value = valueStack.pop();
                Character op = operatorStack.pop();
                while(op.equals(add)){
                    ans = ans + value;
                    value = valueStack.pop();
                    op = operatorStack.pop();
                }
                if(op.equals(multiply)){
                    if(ans.equals(0)){
                        ans = value;
                    }
                    else{
                        ans = ans * value;
                    }
                }
            }
        }
        while(valueStack.size() > 0){
            Integer value = valueStack.pop();
            Character op = operatorStack.pop();
            if(op.equals(add)){
                ans = ans + value;
            }
            else{
                if(ans.equals(0)){
                    ans = value;
                }
                else{
                    ans = ans * value;
                }
            }
        }
        return ans.intValue();
    }
}
