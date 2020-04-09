class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index = nums1.length - 1;
        int n1 = m - 1;
        int n2 = n - 1;
        
        while(n1 >= 0 && n2 >= 0){
            if(nums1[n1] < nums2[n2]){
                nums1[index] = nums2[n2];
                index--;
                n2--;
            }else{
                nums1[index] = nums1[n1];
                index--;
                n1--;
            }
        }
        
        while(n2 >= 0){
            nums1[index] = nums2[n2];
            n2--;
            index--;
        }
        
        while(n1 >= 0){
            nums1[index] = nums1[n1];
            n1--;
            index--;
        }
        
        
    }
}