class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map=new HashMap<>();
        for(String str:s1.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str:s2.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        List<String> list=new ArrayList<>();
        for(String val:map.keySet()){
            if(map.get(val)==1){
                list.add(val);
            }
        }
        return list.toArray(new String[0]);
    }
}