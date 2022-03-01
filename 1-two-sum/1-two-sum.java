class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> numMap = new HashMap<>();
         for( int i=0; i<nums.length;i++){
             
             int visitedValue = target - nums[i];
             if(numMap.containsKey(visitedValue)){
                 return new int[] {i,numMap.get(visitedValue)};
             }
             numMap.put(nums[i],i);
         }
        
  return null;
    }
  
}

