class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list=new ArrayList<>();
        int st=0;
        int end=0;
        int max=0;
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                if(max<list.size()) max=list.size();
                end++;
            }
            else{
                list.remove(Character.valueOf(s.charAt(st)));
                st++;
            }
        }
        return max;
    }
}