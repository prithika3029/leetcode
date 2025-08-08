class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        for(char ch:magazine.toCharArray()){
            freq[ch-97]++;
        }
        int[] freq1=new int[26];
         for(char ch:ransomNote.toCharArray()){
            freq1[ch-97]++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]>0){
                if(freq1[i]>freq[i]) return false;
            }
        }
        return true;
    }
}