public class RecursionProblem2 {
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