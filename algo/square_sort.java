package algo;

/**
 * square_sort
 */
public class square_sort {

    
}


//Solutions
/***
 * 
 * class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] nums1=new int[nums.length];
        for(int i=0;i<=nums.length-1;i++){
            nums1[i]=nums[i]*nums[i];
        }
        int temp=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(nums1[i]>nums1[j]){
                    temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
        return nums1;
    }
}
 */