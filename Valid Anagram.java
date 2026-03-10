class Solution {
    public boolean isAnagram(String s, String t) {
       char sarr[]=s.toCharArray();
       char tarr[]=t.toCharArray();
       Arrays.sort(sarr);
       Arrays.sort(tarr);
       if(s.length()!=t.length()) 
          return false;
        for(int i=0;i<sarr.length;i++)
        {
            if(sarr[i]!=tarr[i]) 
               return false;
        }  
        return true;

    }
}
