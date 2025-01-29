// Container With Most Water
public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        // initialize two pointers at start and end
        int l = 0;
        int r = heights.length - 1;
        int res = 0;

        while (l < r) {
            // calculate area between lines at current pointers
            // area = width * height (height is min of two lines)
            int area = Math.min(heights[l], heights[r]) * (r - l);
            // update max area if current area is larger
            res = Math.max(res, area);

            // move pointer with smaller height inward
            // (can't get larger area with smaller height)
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}

// reference link to sandbox practice for problem: https://neetcode.io/problems/max-water-container