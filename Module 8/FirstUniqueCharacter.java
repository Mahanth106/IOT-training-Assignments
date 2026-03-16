public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter obj = new FirstUniqueCharacter();
        System.out.println(obj.firstUniqChar("leetcode")); // 0
        System.out.println(obj.firstUniqChar("loveleetcode")); // 2
        System.out.println(obj.firstUniqChar("aabb")); // -1
    }
}
