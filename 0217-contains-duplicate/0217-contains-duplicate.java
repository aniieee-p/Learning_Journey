class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set = new HashSet<>();
        //for each:works on arrays'value not on indexing 
        for(int i : nums)
        {
            if (set.contains(i))
            return true;
            set.add(i);
        }
        return false;
    }
}