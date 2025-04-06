


class Solution {
    static public int searchInsert(int[] nums, int target) {

        
        int order=0;
         
         for(int i=0;i<nums.length;i++){
            //System.out.println("run");
            if(nums[i]==target){
                
                return order;

            }else if (nums[i]<target) {
                order=i+1;
            }else{
                return order;
            }
        }

        return order;
        
    }
}

/*
//more sorted version of mine in linear vertion
public int searchInsert(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] >= target) return i;
    }
    return nums.length;
}


// best which is in binary search version
public int searchInsert(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) return mid;
        else if (nums[mid] < target) left = mid + 1;
        else right = mid - 1;
    }

    return left;
}
 */


public class LeetCode{

    public static void main(String[] args) {
       // System.out.println("hi");

        int[] nums={1,3,5,6};
        int target=2;
        System.out.println(Solution.searchInsert(nums, target));
    }
    
}