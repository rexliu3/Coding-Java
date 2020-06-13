public class Recursion {
    public static void main(String[] args) {
        System.out.println(trinomialBrute(24, 12));
        System.out.println(trinomialDynamic(24, 12));
    }

    public static long trinomialBrute(int n, int k) {
        if (n == 0 && k == 0) {
            return 1;
        } else if (k < -n || k > n) {
            return 0;
        } else {
            return trinomialBrute(n - 1, k - 1) + trinomialBrute(n - 1, k) + trinomialBrute(n - 1, k + 1);
        }
    }

    public static long trinomialDynamic(int n, int k) {
        int total = 0;
        int one, two, three;
        one = k;
        two = k;
        three = k;
        for(int i = n; n >= 0; i--) {
            if (n == 0 && one == 0) {
                total += 1;
            } else if (one < -n || one > n) {
            } else {
                one -= 1;
            }
            if (n == 0 && two == 0) {
                total += 1;
            } else if (two < -n || two > n) {
            }
            if (n == 0 && three == 0) {
                total += 1;
            } else if (three < -n || three > n) {
            } else {
                three += 1;
            }
        }
        return total;
    }

    public static void RevesPuzzle(int n) {
        int k = (int) (n + 1 - Math.sqrt(2*n + 1));

    }

}