/**
 * @author  xwiam on 2017/11/15.
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode point = head;
        int carry = 0;
        while(l1 != null && l2!=null){
            int sum = carry + l1.val + l2.val;
            point.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            point = point.next;
        }

        while(l1 != null) {
            int sum =  carry + l1.val;
            point.next = new ListNode(sum % 10);
            carry = sum /10;
            l1 = l1.next;
            point = point.next;
        }

        while(l2 != null) {
            int sum =  carry + l2.val;
            point.next = new ListNode(sum % 10);
            carry = sum /10;
            l2 = l2.next;
            point = point.next;
        }

        if (carry != 0) {
            point.next = new ListNode(carry);
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(5);
        l1.add(a1).add(a2);
        ListNode l2 = new ListNode(2);
        ListNode b1 = new ListNode(7);
        ListNode b2 = new ListNode(7);
        l2.add(b1).add(b2);
        ListNode ll;
        ll = AddTwoNumbers.addTwoNumbers(l1, l2);
        while (ll.hasNext()) {
            System.out.print(ll.val + "-->");
            ll = ll.next;
        }
    }
}
