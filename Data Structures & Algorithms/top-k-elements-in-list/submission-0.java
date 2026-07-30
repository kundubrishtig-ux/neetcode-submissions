class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index=0;
        int[] ans=new int[k];
        while(index<k)
        {
            int maxIndex=0;
            int maxElement=0;
            for(int key:map.keySet())
            {
            if(map.get(key)>maxIndex)
            {
                  maxIndex=map.get(key);
                  maxElement=key;
            }
            }
               ans[index]=maxElement;
            index++;
            map.remove(maxElement);

        }
        return ans;
    }
}
