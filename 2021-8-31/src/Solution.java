import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    //重要程度:优先代码正确，其次考虑效率（尤其时间复杂度一样，只是系数不同，现在更不需要考虑），
    private List<Integer> intArrayToList(int[]array){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);

        }
        return list;
    }
    public boolean IsPopOrder(int[] pushA,int[] popA){
        List<Integer> pushList = intArrayToList(pushA);
        List<Integer> popList = intArrayToList(popA);
        Deque<Integer> stack = new LinkedList<>();
        //数组不能通过length判断
        while (!popList.isEmpty()){

            int p =popList.remove(0);
            while (true ){
                if(stack.isEmpty() || stack.peek().intValue() != p){
                    if(pushList.isEmpty()){
                        return false;
                    }
                    int q = pushList.remove(0);
                    stack.push(q);

                }else {
                    break;
                }
            }
            stack.pop();
        }
        return stack.isEmpty();
    }
}
