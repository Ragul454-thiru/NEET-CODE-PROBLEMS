class Solution {
    public int scoreOfString(String s) {
        char words[]=s.toCharArray();
        int ans=0,finalans=0;
        for(int i=0;i<words.length-1;i++)
        {
            ans=(int)Math.abs((int)words[i]-(int)words[i+1]);
            finalans+=ans;
        }
        return finalans;

    }
}
