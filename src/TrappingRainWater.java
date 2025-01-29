// Trapping Rain Water
public class TrappingRainWater {
    public int trap(int[] height) {
        // handle edge cases
        if (height == null || height.length == 0) {
            return 0;
        }

        // initialize two pointers and max heights seen from left/right
        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int res = 0;

        while (l < r) {
            if (leftMax < rightMax) {
                // move left pointer inward
                l++;
                // update max height seen from left
                leftMax = Math.max(leftMax, height[l]);
                // add trapped water at current position
                // (difference between max height and current height)
                res += leftMax - height[l];
            } else {
                // same logic for right side
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}
// reference link to sandbox practice for problem: https://neetcode.io/problems/trapping-rain-water
