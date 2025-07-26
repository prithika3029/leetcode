class Solution {
    public boolean isBalanced(String num) {
        int even=0;
        int odd=0;
        for(int i=0;i<num.length();i++){
            int dig=num.charAt(i)-'0';
            if(i%2==0){
                even+=dig;
            }
            else{
                odd+=dig;
            }
        }
        return even==odd?true:false;
    }
}