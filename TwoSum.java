class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int ans[] = new int[2];
        // int j=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=1; j<nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    if(i == j){
                        continue;
                    }
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}