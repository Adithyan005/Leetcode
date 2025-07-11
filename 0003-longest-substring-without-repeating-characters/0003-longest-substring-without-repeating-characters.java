class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i,j,len=0,cnt=0,max=0;
        for(i=0;i<s.length();i++)
        {
            HashSet<Character>al=new HashSet<>();
            len=0;
            for(j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(al.contains(ch))
                {
                    break;
                }
                al.add(ch);
                len++;
            }
            max=Math.max(max,len);
        }
        return max;
    }
}