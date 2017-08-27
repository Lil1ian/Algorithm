class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, k - 1, 0, nums.length - 1);
    }
    private int quickSelect(int[] arr, int k, int left, int right){
        int pivot = arr[(left + right) / 2];
        int orgL = left, orgR = right;
        while(left <= right){
            // 从右向左找到第一个小于枢纽值的数
            while(arr[left] > pivot){
                left ++;
            }
            // 从左向右找到第一个大于枢纽值的数
            while(arr[right] < pivot){
                right --;
            }
            
            if(left <= right){
                swap(arr, left, right);
                left ++;
                right --;
            }
        }
        
        if(orgL < right && k <= right) return quickSelect(arr, k, orgL, right);
        
        if(left < orgR && k >= left) return quickSelect(arr, k, left, orgR);
        return arr[k];
    
    }
    
    private void swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1] + arr[idx2];
        arr[idx1] = tmp - arr[idx1];
        arr[idx2] = tmp - arr[idx2];
    
    }
}
