class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int ind=0;
        if(ruleKey.equals("type")) ind=0;
        else if(ruleKey.equals("color")) ind=1;
        else ind=2;
        for(int i=0;i<items.size();i++){
           String str=items.get(i).get(ind);
           if(str.equals(ruleValue)){
            count++;
           }

            }
        return count;
    }
}