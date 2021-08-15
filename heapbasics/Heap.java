import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> list;

    public Heap() {
        list = new ArrayList<>();
    }

    public void add(int value) {
        list.add(value);
        swapUp(list.size() - 1);
    }

    public void swapUp(int bot) {
        //TODO
    }

    public void remove() {
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        swapDown(list.size());
    }

    public void swapDown(int top) {
        //TODO
    }

    private void swap(int start, int finish) {
        int temp = list.get(start);
        list.set(start, list.get(finish));
        list.set(finish, temp);
    }

    public void print() {
        System.out.println("\n\nPRINTING THE HEAP!\n\n");
        int x = 0;
        for (int i = 1; i < list.size(); i*= 2) {
            for (int s = 1; s < list.size() - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i - 1 && x < list.size(); j++) {
                System.out.print(list.get(x++) + "  ");
            }
            System.out.println();
            if (x == list.size() - 1) {
                System.out.print(list.get(x++) + "  ");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}