class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(count==0)
                {
                  candidate=nums[i];
                }
                if(nums[i]==candidate)
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
        }
        return candidate;
    }
}