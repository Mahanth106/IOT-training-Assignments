import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(nums, i + 1, current, result);
            current.remove(current.size() - 1); // undo choice
        }
    }

    public static void main(String[] args) {
        Subsets obj = new Subsets();
        System.out.println(obj.subsets(new int[]{1, 2, 3}));
        // [[], [1], [1,2], [1,2,3], [1,3], [2], [2,3], [3]]
    }
}
