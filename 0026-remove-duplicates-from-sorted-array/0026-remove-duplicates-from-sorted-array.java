class Solution {
    public int removeDuplicates(int[] nums) {
        int uniquePointer = 1;
        int returnValue = 1;
        for(int i = 1; i<nums.length;i++)
        {
            if(nums[i]!= nums[i-1]) 
            {
                nums[uniquePointer] = nums[i];
                uniquePointer++;
                returnValue++;
            }
        }
        return uniquePointer;
    }
}