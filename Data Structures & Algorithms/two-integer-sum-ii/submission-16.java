class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            int l=i+1, r=nums.length-1;
            int tmp=target-nums[i];
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums[mid]==tmp){
                    return new int[]{i+1, mid+1};
                    }
                else if(nums[mid]<tmp){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            
        }
        return new int[]{};
        
    }
}
