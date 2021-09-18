import java.util.Map;
import java.util.TreeMap;

public class Test {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> nomToIdx = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            int x = target - n;
            if (nomToIdx.containsKey(x)){
                int oIdx = nomToIdx.get(x);
                return new int[] {oIdx,i};
            }
            nomToIdx.put(n , i);
        }
        return new int[]{0,0};

    }

}
