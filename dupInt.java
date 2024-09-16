
class dupInt {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Has duplicate: " + sol.hasDuplicate(nums1));
        
        int[] nums2 = {1, 2, 3, 4, 2};
        System.out.println("Has duplicate: " + sol.hasDuplicate(nums2));
        
        int[] nums3 = {};
        System.out.println("Has duplicate: " + sol.hasDuplicate(nums3));
    }
}
