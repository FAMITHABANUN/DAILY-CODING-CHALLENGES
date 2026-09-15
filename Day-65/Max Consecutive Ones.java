class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1) // if nums[i] = 1, increment count and track maxCount
            {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else    // if nums[i] = 0, reset count to zero.
                count = 0;
        }

        return maxCount;
    }
}