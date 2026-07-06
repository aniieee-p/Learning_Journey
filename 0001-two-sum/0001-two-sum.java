import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int k = target - nums[i];

            if (map.containsKey(k)) {
                int p = map.get(k);
                return new int[]{p, i};
            }

            map.put(nums[i], i);
        }

        return null;
    }
}