public class _7_SymmetricSet {
    public static boolean symmetricSet(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[nums.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
