
public class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists, 0, lists.length - 1);
    }
    public ListNode mergeKLists(ListNode[] lists, int begin, int end){
        if(lists == null || lists.length < begin || end < 0 || begin < 0 || end > lists.length){
            return null;
        }
        if(begin == end){
            return lists[begin];
        }
        int mid = (begin + end)/2;
        ListNode left = mergeKLists(lists, begin, mid);
        ListNode right = mergeKLists(lists, mid + 1, end);
        return mergeTwoList(left, right);
    }
    public ListNode mergeTwoList(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode head = res;
        while(l1 != null||l2 != null){
            if(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    res.next = l1;
                    l1 = l1.next;
                }else{
                    res.next = l2;
                    l2 = l2.next;
                }
                res = res.next;
            }else{
                if(l1 == null){
                    res.next = l2;
                }else{
                    res.next = l1;
                }
                break;
            }

        }
        return head.next;
    }
}
