class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:words){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int sum=0;
        for(String s:map.keySet()){
            if(map.get(s)>1){
           sum+=map.get(s)-1;
            }
        }
        return sum;
    }
}