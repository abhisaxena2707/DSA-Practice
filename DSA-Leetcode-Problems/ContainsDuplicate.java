import java.util.*;

/*
217. Contains Duplicate
Given an integer array nums, return true if any value
appears at least twice in the array, and return false if every element is distinct.

Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class ContainsDuplicate {
    public static boolean containsDuplicateUsingMap(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i:nums){
            map.compute(i, (k,v)-> v==null ? 1: v+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() >=2 ) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicateUsingSort(new int[]{1,5,4,6,2,8}));
    }

    public static boolean containsDuplicateUsingSet(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)) return true;

            set.add(i);
        }
        return false;
    }

    public static boolean containsDuplicateUsingSort(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }

}
