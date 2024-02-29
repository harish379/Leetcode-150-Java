class Solution {
    public int removeElement(int[] nums, int val) {

        //swap if the value is not the value of val, the similiar elements will be moved to the last
        int non_k_index = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                int temp = nums[i];
                nums[i] = nums[non_k_index];
                nums[non_k_index]= temp;
                non_k_index++;
            }
        }
        //for every encounter of unqiue elements we are swapping
        //so the non_k_index will also have the no.of unique elements

      
        return non_k_index;
        
    }
}