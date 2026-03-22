// Imagine a two pointer approach, check if the left pointer is smaller or the right one.
// If left one is smaller then increase it by 1 and if the right one is smaller decrease it by 1.
// Untill left pointer is smaller than the right one.
// Keep calculating area in between.

class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}