class Solution {
    public int maxArea(int[] height) {

        int j = height.length - 1;
        int i = 0;
        int maxarea = 0;

        while (i < j) {

            int width = j - i;

            int area = width * Math.min(height[i], height[j]);

            if (maxarea < area) {
                maxarea = area;
            }

            if (height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return maxarea;
    }
}