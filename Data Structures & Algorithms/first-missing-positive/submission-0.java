class Solution {
    public int firstMissingPositive(int[] nums) {
        int missing=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==missing)
           {
            missing++;
           }
            
        }
        return missing;
    }
}