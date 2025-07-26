class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        int count=0;
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1') count++;
        }
        if(count==1) {
            for(int i=0;i<n-1;i++){
                str.append('0');
            }
            str.append('1');
            return str.toString();
        }
        int i=0;
        for(i=0;i<n&&count>1;i++){
          str.append('1');
          count--;
        }
        for(int k=i;i<n-1;i++){
            str.append('0');
        }
        str.append('1');
        return str.toString();
    }
}