class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;
        int[] count = new int[n + 1];

      //frequency count ki phle
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }

        List<Integer> ans = new ArrayList<>();

        // array traversing
        for (int i = 1; i <= n; i++) {

            // Frequency Count
            // System.out.println(i + " -> " + count[i]);


            // Missing Number
            if (count[i] == 0) {
                ans.add(i);   
            }


            // Unique Number
            // if (count[i] == 1) {
            //     ans.add(i);
            // }


            // Duplicate Number
            // if (count[i] > 1) {
            //     ans.add(i);
            // }
            
        }

        return ans;
    }
}