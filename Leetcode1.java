public class Leetcode1 {
    //task
    //Given an array of integers nums and an integer target,
    //return indices of the two numbers such that they add up to target.
    //Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1]


        public static int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            int[] table = new int[2];
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] + nums[j] == target) {
                        table[0] = i; // store the indices of the two numbers
                        table[1] = j;
                        return table;

                    }
                }
            }
            return table; // No solution found
        }


    public static void main(String[] args) {

        int[]tab={2,7,11,15};
        int[]tab2=new int[2];
             tab2= twoSum(tab,9);
         System.out.println(tab2[0]);
        System.out.println(tab2[1]);

        int[]tab3={3,2,4};
        int[]tab4=new int[2];
        tab4= twoSum(tab3,6);
        System.out.println(tab4[0]);
        System.out.println(tab4[1]);

    }
}
