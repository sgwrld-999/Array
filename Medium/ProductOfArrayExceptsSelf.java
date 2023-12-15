public class ProductOfArrayExceptsSelf {
    
    class Solution1 {
        public int[] productExceptSelf(int[] nums) {
            int[] ans = new int[nums.length];
            int pdt = 1 ;
            for(int i = 0 ; i < nums.length ; i++){
                for(int j = 0 ; j < nums.length ; j++){
                    if(i != j) pdt *= nums[j];
                }
                ans[i] = pdt;
                pdt = 1 ;
            }
    
            return ans;
        }
    }
    class Solution2 {
        public int[] productExceptSelf(int[] nums) {
            int[] pref = new int[nums.length];
            int[] suff = new int[nums.length];
    
            pref[0] = 1;
            suff[nums.length - 1] = 1;
            for (int i = 1; i < nums.length; i++) {
                pref[i] = pref[i - 1] * nums[i - 1];
            }
            for (int i = nums.length - 2; i >= 0; i--) {
                suff[i] = suff[i + 1] * nums[i + 1];
            }
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = pref[i] * suff[i];
            }
    
            return ans;
        }
    }
    class Solution3 {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
    
            int prev = 1;
            int suff = 1;
    
            for (int i = 0; i < nums.length; i++) {
                ans[i] = prev;
                prev = prev * nums[i];
            }
    
            for (int i = n - 1; i >= 0; i--) {
                ans[i] *= suff;
                suff = suff * nums[i];
            }
    
            return ans;
        }
    }
    class Solution4 {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
    
            int prev = 1;
            int suff = 1;
    
            for (int i = 0; i < n; i++) {
                ans[i] *= prev;  
                prev *= nums[i]; 
    
                ans[n - 1 - i] *= suff;  
                suff *= nums[n - 1 - i];  
            }
    
            return ans;
        }
    }
    
}
