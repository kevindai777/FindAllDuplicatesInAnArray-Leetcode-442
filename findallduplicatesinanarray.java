//Java Solution

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                result.add(num);
            }
        }
        
        return result;
    }
}