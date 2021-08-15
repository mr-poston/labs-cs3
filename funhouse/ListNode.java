public class ListNode implements Linkable {
    private Comparable value;
    private ListNode next;

    public ListNode() {
        this(null, null);
    }

    public ListNode(Comparable val, ListNode nxt) {
        value = val;
        next = nxt;
    }

    @Override
    public Comparable getValue() {
        return value;
    }

    @Override
    public ListNode getNext() {
        return next;
    }

    @Override
    public void setValue(Comparable val) {
        value = val;
    }

    @Override
    public void setNext(Linkable nxt) {
        next = (ListNode)nxt;
    }
}