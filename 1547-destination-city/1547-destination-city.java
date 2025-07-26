class Solution {
    public String destCity(List<List<String>> paths) {
       List<String> list=new ArrayList<>();
       Set<String> set=new HashSet<>();
       for(int i=0;i<paths.size();i++){
        
            String str1=paths.get(i).get(0);
            String str2=paths.get(i).get(1);
            set.add(str1);
            set.add(str2);
            list.add(str1);
            
       }
       for(String str:set){
        if(!list.contains(str)) return str;
       }
       return " ";

    }
}