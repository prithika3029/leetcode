class Solution {
    public int findCenter(int[][] edges) {
        
        int[] arr=new int[100001];
        for(int i=0;i<edges.length;i++){
            arr[edges[i][0]]++;
            
            arr[edges[i][1]]++;
            
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1) return i;
        }
        return -1;

    }
}