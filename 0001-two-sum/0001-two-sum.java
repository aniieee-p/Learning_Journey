class Solution {
    public int[] twoSum(int[] nums, int target) {
        // BRUTE FORCE

        // for(int i =0; i<nums.length;i++){
        //     for(int j =i+1; j< nums.length; j++){
        //         if(nums[i]+nums[j]== target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }


        // BETTER 
        
        // create a map to store key-value pairs
        // key:nums[i], value:i
        HashMap<Integer, Integer> map = new HashMap<>();
        // for each index calculate diff
        for(int i =0; i<nums.length;i++){
            // cal diff
            int diff = target - nums[i];
            // search diff in map
            Integer j = map.get(diff);
            // if diff is found, get j
            if(j != null) {
                // return i,j as answer
                return new int[]{i,j};
            }
            map.put(nums[i], i);
        }


        return null;
    }
}