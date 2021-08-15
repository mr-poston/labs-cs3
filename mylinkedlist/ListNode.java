public class ListNode implements Linkable {
    private Comparable value;
    private ListNode next;

    public ListNode() {
        this(null, null);
    }

    public ListNode(Comparable value, ListNode next) {
        setValue(value);
        setNext(next);
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
    public void setValue(Comparable value) {
        this.value = value;
    }

    @Override
    public void setNext(Linkable next) {
        this.next = (ListNode)next;
    }
}