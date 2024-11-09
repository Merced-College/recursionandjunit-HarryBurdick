public class RecursionProblems {
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
    
    public static int Recursion2(String str) {
        if (str.length() < 2)
            return 0;

        if (str.substring(0, 2).equals("hi")) {
            return Recursion2(str.substring(2)) + 1;
        }
        return Recursion2(str.substring(2));

    }

    public static int Recursion3(String str) {
        if (str.length() < 3)
            return 0;

        if (!str.startsWith("x") && str.contains("hi")) {
            return Recursion3(str.substring(3)) + 1;
        }
        return Recursion3(str.substring(3));

    }

    public static int Recursion4(String str, String sub) {
        if (str.length() < 3)
            return 0;

        if (str.substring(0, 3).contains(sub)) {
            if (str.length() >= 6) {
                String nextSub = str.substring(3);
                if (nextSub.contains(sub)) {
                    return Recursion4(nextSub.substring(3), sub) + 1;
                } else {
                    return Recursion4(str.substring(3), sub) + 1;
                }
            } else {
                return Recursion4(str.substring(3), sub) + 1;
            }
        }
        return Recursion4(str.substring(3), sub);

    }

    public static String Recursion5(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {

            return Recursion5(str.substring(1));
        } else {
            return str.charAt(0) + Recursion5(str.substring(1));
        }
    }
}