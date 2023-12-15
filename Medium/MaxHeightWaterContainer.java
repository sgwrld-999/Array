public class MaxHeightWaterContainer {
    class Solution {
        public int maxArea(int[] a) {
            int start = 0;
            int end = a.length-1 ;
            int ans = 0;
            while(start < end){
                if(a[start] < a[end]){
                    ans = Math.max(((end - start) * a[start]),ans);
                    start++;
                }else{
                    ans = Math.max(((end - start) * a[end]),ans);
                    end--;
                }
            }
    
            return ans;
        }
    }
}
