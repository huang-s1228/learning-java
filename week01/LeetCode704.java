class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right){

            int mid = (left + right) >>> 1;

            if(target > nums[mid]){
                left = mid + 1;
            }
            else if(target < nums[mid]){
                right = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
}

 public class LeetCode704 {
     public static void main(String[] args) {
         Solution s = new Solution();
         System.out.println(s.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)); // 期望输出 4
     }
 }