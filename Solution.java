import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int values = nums.length;
        int[] squares = new int[values];
        
        for (int i = 0; i < values; i++) {
            squares[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(squares);
        
        return squares;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);
        
        System.out.println(Arrays.toString(result));
    }
}
