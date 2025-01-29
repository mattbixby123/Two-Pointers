import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Three Sum - Find all unique triplets that sum to zero
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort array to handle duplicates and use two pointer technique
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        // iterate through each number as potential first number of triplet
        for (int i = 0; i < nums.length; i++) {
            // if current number > 0, impossible to sum to 0 with sorted array
            if (nums[i] > 0) break;
            // skip duplicates for first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // use two pointers for remaining two numbers
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    // sum too large, decrease right pointer
                    r--;
                } else if (sum < 0) {
                    // sum too small, increase left pointer
                    l++;
                } else {
                    // found valid triplet, add to result
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++; r--;
                    // skip duplicates for second number
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}

// reference link to sandbox practice for problem: https://neetcode.io/problems/three-integer-sum