import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remaining, int start,
                           List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remaining) break; // pruning
            current.add(candidates[i]);
            backtrack(candidates, remaining - candidates[i], i, current, result); // i (not i+1) allows reuse
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum obj = new CombinationSum();
        System.out.println(obj.combinationSum(new int[]{2, 3, 6, 7}, 7));
        // [[2,2,3],[7]]
        System.out.println(obj.combinationSum(new int[]{2, 3, 5}, 8));
        // [[2,2,2,2],[2,3,3],[3,5]]
    }
}
