public class SingleNumber {
    public int singleNumber(int[] nums) {
        // XOR of a number with itself is 0; XOR with 0 gives the number itself.
        // All duplicates cancel out, leaving the unique number.
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }

    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        System.out.println(obj.singleNumber(new int[]{2, 2, 1}));       // 1
        System.out.println(obj.singleNumber(new int[]{4, 1, 2, 1, 2})); // 4
        System.out.println(obj.singleNumber(new int[]{1}));              // 1
    }
}
