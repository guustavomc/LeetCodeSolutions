/*Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
 

Constraints:

1 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each element in nums appears exactly three times except for one element which appears once.*/

import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> newHash = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(!newHash.containsKey(nums[i])){
                newHash.put(nums[i],1);
            }
            else{
                newHash.put(nums[i], newHash.get(nums[i])+1);
            }
        }

        for(int j=0; j<nums.length;j++){
            if(newHash.get(nums[j])==1){
                return nums[j];
            }
        }
       return 0;
    }
}
