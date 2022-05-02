import java.util.Scanner;
public class Solution{
        public static void main(String[] args){
            // Using Newton-Raphson method
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            double n = N,
                   tol = 0.01,
                   x0 = n / 2.0,
                   x1 = 0.5 * (x0 + n / x0),
                   error = x0 - x1;
            if(error < 0) error = x1 - x0;
            while(error > tol){
                x0 = x1;
                x1 = 0.5 * (x0 + n / x0);
                error = x0 - x1;
                if(error < 0) error = x1 - x0;
            }
            System.out.println((int)x1);
        }
}
