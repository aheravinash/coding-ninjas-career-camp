import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),
            i = 0,
            num,
            prevNum,
            diff,
            prevDiff,
            flip = 0;
        if(n == 1){
            num = s.nextInt();
            System.out.println(true);
        }
        else if(n == 2){
            num = s.nextInt();
            prevNum = num;
            num = s.nextInt();
            diff = num - prevNum;
            if(diff == 0){
                System.out.println(false);
            }
            else{
                System.out.println(true);
            }
        }
        else{
            num = s.nextInt();
            i++;
            prevNum = num;
            num = s.nextInt();
            i++;
            diff = num - prevNum;
            if(diff == 0) flip += 2;
            prevNum = num;
            prevDiff = diff;
            do{
                num = s.nextInt();
                i++;
                diff = num - prevNum;
                if(diff == 0) flip += 2;
                else if(diff * prevDiff < 0) flip++;
                prevNum = num;
                prevDiff = diff;
            }while(i < n);
            if(flip < 2) System.out.println(true);
            else System.out.println(false);
        }
    }
}
