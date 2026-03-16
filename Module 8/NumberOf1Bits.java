public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1); // Check if LSB is 1
            n >>>= 1;         // Unsigned right shift
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1Bits obj = new NumberOf1Bits();
        System.out.println(obj.hammingWeight(11));          // 3  (00001011)
        System.out.println(obj.hammingWeight(128));         // 1  (10000000)
        System.out.println(obj.hammingWeight(2147483645));  // 30
    }
}
