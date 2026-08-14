class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        for(int i=0;i<=s2.length()-n;i++)
        {
            String temp=s2.substring(i,i+n);
            char[] a=s1.toCharArray();
            char[] b=temp.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b))
            {
                return true;
            }

        }
        return false;
    }
}
