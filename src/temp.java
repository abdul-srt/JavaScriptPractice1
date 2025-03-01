import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
    int arr[]={0,1,2,3,5,6,7,8};
        System.out.println( Solution.missingNumber(arr));
    }

    static class Solution {
        public static int missingNumber(int[] nums) {
            Arrays.sort(nums);
            int ans = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != i) {
                    ans = i;
                    break;

                }
            }
            return ans;
        }
    }
}