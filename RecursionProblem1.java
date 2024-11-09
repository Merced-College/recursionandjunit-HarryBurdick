public class RecursionProblem1 {
    public static int Recursion1(int n){
        //base case if n == 0, no 8s are currently present
        if(n == 0) return 0;

        // if the last digit has an 8
        if (n % 10 == 8){
            // checks if the second to last digit present is also an 8
            if ((n / 10) % 10 == 8){
                // if it is then count it double and continue recursively with the rest
                return 2 + Recursion1(n / 10);
            }else{
                //otherwise count it as a 1 and continue recursively with the rest
                return 1 + Recursion1(n / 10);
            }
        }else{
            // if the final digit is not an 8, continue with the rest of the number given
            return Recursion1(n / 10);
        }
    }
}
