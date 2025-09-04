class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String s1="";
        String s2="";
        String s3="";
        for(char ch:firstWord.toCharArray()){
            s1+=ch-97;
        }
        for(char ch:secondWord.toCharArray()){
            s2+=ch-97;
        }
        for(char ch:targetWord.toCharArray()){
            s3+=ch-97;
        }
        int val=Integer.valueOf(s1)+Integer.valueOf(s2);
        return val==Integer.valueOf(s3)?true:false;
        
    }
}