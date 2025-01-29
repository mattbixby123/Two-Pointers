// Two Sum II - Input array is sorted
public class TwoIntegerSumII {
    public int[] twoSum(int[] numbers, int target) {
        // initialize two pointers at start and end of sorted array
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            // calculate current sum of elements at both pointers
            int curSum = numbers[l] + numbers[r];

            if (curSum > target) {
                // if sum too large, decrease right pointer to try smaller number
                r--;
            } else if (curSum < target) {
                // if sum too small, increase left pointer to try larger number
                l++;
            } else {
                // found the target sum, return indices (1-based per problem)
                return new int[] { l + 1, r + 1 };
            }
        }
        // no solution found
        return new int[0];
    }
}

//reference link to practice problem: https://neetcode.io/problems/two-integer-sum-ii