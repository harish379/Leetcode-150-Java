class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //pointer which starts from m that goes upto the last value n
        int pointer = m;
        for(int i=0;i<n;i++){
            // position m will be filled with i value
            nums1[m]=nums2[i];
            m++;
        }
        Arrays.sort(nums1);

    }
}