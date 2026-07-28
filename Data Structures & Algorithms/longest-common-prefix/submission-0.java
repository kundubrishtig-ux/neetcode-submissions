class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null  || strs.length==0)
        {
            return "";
        }
        String profix=strs[0];
        for(int i=0;i<strs.length;i++)
        {
           while(!strs[i].startsWith(profix))
           {
            profix=profix.substring(0,profix.length()-1);
            if(profix.isEmpty())
            {
                return "";
            }
           } 

        }
        return profix;

    }
}