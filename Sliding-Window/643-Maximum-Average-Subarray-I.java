class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += nums[i];
            avg = (double)sum/k;
        }
        double max = avg;
        for(int i = 1;i<=nums.length - k;i++){
            sum = sum - nums[i-1]+nums[i+k-1];
            avg = (double)sum/k;
            if(avg >max){
                max = avg;
            } 
        }
        return max;
    }
}
