class Solution {
    public String removeTrailingZeros(String num) {
        int count=0;
        int n=num.length();
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='0'){
                count++;
            }
            else{
                break;
            }
        }
        return num.substring(0,n-count);
    }
}