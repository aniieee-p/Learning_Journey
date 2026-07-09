class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i = 0;
        int j = nums.length-1;
        while(i<j) {
            if(nums[i] + nums[j] == target)
            {
                ans[0]=i;
                ans[1]=j;
            }
            j--;
            if(j==i){
                i++;
                j=nums.length-1;
            }
        }
        return ans;
    }
}
