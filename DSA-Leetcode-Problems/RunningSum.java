/*
1480. Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
*/

class RunningSum {
    public static int[] runningSum(int[] nums) {
        
        int len= nums.length;
        int[] result = new int[len];
        int sum=0;
        if(len==1) return nums;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            result[i]=sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        for(int i:runningSum(nums)){
            System.out.println(i);
        }

    }
}