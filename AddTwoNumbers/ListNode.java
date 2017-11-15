/**
 * @author  xwiam on 2017/11/15.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }

    public ListNode add(ListNode ln) {
        ListNode p;
        if (this.next != null) {
            p = this.next;
        } else {
            p = this;
        }
        p.next = ln;
        return this;
    }

    public boolean hasNext() {
        if (next != null) {
            return true;
        }
        return false;
    }
}
