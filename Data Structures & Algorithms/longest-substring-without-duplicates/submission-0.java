class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> res=new HashSet<>();
        int max=0;
        int i=0;
        for(int j=0;j<s.length();j++)
        {
            while(res.contains(s.charAt(j)))
            {
                res.remove(s.charAt(i));
                i++;
            }
            res.add(s.charAt(j));
            max=Math.max(max,j-i+1);
        }
        return max;

    }
}
