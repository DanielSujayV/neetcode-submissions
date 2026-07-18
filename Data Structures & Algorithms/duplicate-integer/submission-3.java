class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        boolean isExist=false;
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> m:map.entrySet()){
            if(m.getValue()>1){
                isExist=true;
            }

        }
        return isExist;

        
    }
}