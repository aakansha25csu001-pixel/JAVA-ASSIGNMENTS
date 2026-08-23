
    import java.util.Arrays;

public class ArrayConstructionProblems {

   
    public static int finalValueAfterOperations(String[] operations) {
        int value = 0;

        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                value++;
            } else {
                value--;
            }
        }

        return value;
    }


    // LC 1920 
   
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }


    // LC 1929 
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }


 
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }


   
    public static void main(String[] args) {

        // LC 2011
        String[] operations = {"--X", "X++", "X++"};
        int finalValue = finalValueAfterOperations(operations);

        System.out.println("LC 2011 - Final Value: " + finalValue);


        // LC 1920
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        int[] permutationResult = buildArray(nums1);

        System.out.println("LC 1920 - Build Array: "
                + Arrays.toString(permutationResult));


        // LC 1929
        int[] nums2 = {1, 2, 1};
        int[] concatenationResult = getConcatenation(nums2);

        System.out.println("LC 1929 - Concatenation: "
                + Arrays.toString(concatenationResult));


        // LC 1480
        int[] nums3 = {1, 2, 3, 4};
        int[] runningSumResult = runningSum(nums3);

        System.out.println("LC 1480 - Running Sum: "
                + Arrays.toString(runningSumResult));
    }
}

