public class IntQueue {
    private int[] queue;
    private int size;

    /**
     * Initialize queue with an initial capacity of 5
     * The queue should be empty, so size is 0
     * Call the one-parameter constructor
     * using this(5)
     */
    public IntQueue() {
        this(5);    // Already done!
    }

    /**
     * Initialize queue with an initial capacity of initCap
     * The queue should be empty, so size is 0
     */
    public IntQueue(int initCap) {
        
    }

    /**
     * Return the number of ints currently in the queue.
     * This is not the same as the length of the instance
     * variable array!
     */
    public int size() {
        return 0;
    }

    /**
     * Add an int to the back of the queue
     * If space runs out, call doubleCapacity()
     */
    public void offer(int item) {
        
    }

    /**
     * Remove and return the int at the front of the queue
     * If the queue is empty, return Integer.MIN_VALUE
     */
    public int poll() {
        return 0;
    }

    /**
     * Return the int at the front of the queue without removing it
     * If the queue is empty, return Integer.MIN_VALUE
     */
    public int peek() {
        return 0;

    }

    /**
     * Return true if there are 0 ints currently in the queue;
     * otherwise, return false
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * This private helper method doubles the length of the
     * array backing the queue if space runs out.
     */
    private void doubleCapacity() {
        
    }

    /**
     * Return a string representation of the queue in which the
     * queue is surrounded by [] and each int is separated by a
     * comma and a space
     * For example: [1, 2, 3, 4]
     */
    public String toString() {
        return "";
    }
}