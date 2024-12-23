class MaximumSubarray {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum = 0;
        double sum =0;
        for(int i=0; i<k; i++){
            sum +=  nums[i];
        }
        maxsum = sum;
        for(int j=k; j<nums.length; j++){
            sum += nums[j] - nums[j-k];
            maxsum = Math.max(sum, maxsum);
        }
        return (double)maxsum / k;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}