public class twoNum {
    public int[] twoSum(int[] nums, int target) {
        int[] n = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    n[0] = i;
                    n[1] = j;
                    return n;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        twoNum sol = new twoNum();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println("target :" + target);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println("target :" + target2);
        for(int i=0;i<nums2.length;i++)
        {
            System.out.print(nums2[i]+" ");
        }
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");
    }
}
