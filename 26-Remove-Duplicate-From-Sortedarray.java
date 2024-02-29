class Solution {
    public int removeDuplicates(int[] nums) {
        //the 0th value will be unique,so start fromn 1
        int j = 1;
        for(int i =1;i<nums.length;i++){
            //if i and i-1 is diff ,it means its a unique value
            if(nums[i]!=nums[i-1]){
                //place the unique element at j and j++ to arrange the elements 
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
