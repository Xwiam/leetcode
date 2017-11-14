import java.util.HashMap;

/**
 * @author  xwiam on 2017/11/14.
 */
public class Solution {
    /**
    * @param numbers: An array of Integer
    * @param target: target = numbers[index1] + numbers[index2]
    * @return: [index1 + 1, index2 + 1] (index1 < index2)
    */
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(numbers[i]) != null) {
                int[] result = {map.get(numbers[i]) + 1, i + 1};
                return result;
            }
            map.put(target - numbers[i], i);
        }

        int[] result = {};
        return result;
    }

    public static void main(String[] args) {
        int[] number = {2,7,9,11};
        int target = 11;
        int[] ret = Solution.twoSum(number,target);
        for (int i = 0;i < ret.length;i++) {
            System.out.println(ret[i]);
        }
    }
}
