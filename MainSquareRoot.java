public class MainSquareRoot{
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int x1 = 4;
        int x2 = 8;
        
        System.out.println("Square root of " + x1 + ": " + solution.mySqrt(x1));
        System.out.println("Square root of " + x2 + ": " + solution.mySqrt(x2));
    }
}

class Solution {
    public int mySqrt(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }
}
