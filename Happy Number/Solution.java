public class Solution {

    private int getNumber(int n) {
        int totalSum = 0;
        while (n > 0) {
            int a = n % 10;
            n /=10;
            totalSum += a * a;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNumber(n);
        }
        return n == 1;
    }
}
