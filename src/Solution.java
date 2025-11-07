public class Solution {
    static int solve(int n, String osf, int index) {
        if (index == n) {
            System.out.println(osf);
            return 1;
        }
        int x = solve(n, osf + "H", index + 1);
        int y = solve(n, osf + "T", index + 1);
        return x + y;
    }


    static void ans(int n, int element, String print) {
        if (element == n) {
            System.out.println(print);
            return;
        }
        if (element > n) return;

        for (int i = 1; i <= 6; i++) {

            ans(n, element + i, print + i);

        }
    }


    static int celebrity(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return celebrity(n - 1) + (n - 1) * celebrity(n - 2);

    }

    public static void main(String[] args) {
//        int result = solve(3, "", 0);
//        System.out.println(result);

//        ans(10, 0, "");

        System.out.println(celebrity(4));
    }

}