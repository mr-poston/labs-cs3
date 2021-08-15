import static java.lang.System.*;

public class MonsterRunner {
    public static void main(String[] args) {
        Monster zero = new Monster();
        Monster one = new Monster(8);
        Monster sue = new Monster(9, 4);
        Monster harry = new Monster(1, 2, 3);
        out.println("\nzero Monster >>> " + zero);
        out.println("\none Monster >>> " + one);
        out.println("\nsue Monster >>> " + sue);
        out.println("\nharry Monster >>> " + harry);

        out.println("\nchanging harry's properties ");
        harry.setHeight(7);
        harry.setWeight(6);
        harry.setAge(5);
        out.println("\nharry Monster >>> " + harry);

        out.println("\ncloning harry");
        sue = (Monster)harry.clone();
        out.println("\nsue Monster >>> " + sue);

        Monster mOne = new Monster(33, 33, 11);
        Monster mTwo = new Monster(55, 33, 11);

        out.println("\nMonster 1 >>> " + mOne);
        out.println("\nMonster 2 >>> " + mTwo);

        out.println("\nmOne.equals(mTwo) == " + mOne.equals(mTwo));

        out.println("\nmOne.compareTo(mTwo) == " + mOne.compareTo(mTwo));
        out.println("\nmTwo.compareTo(mOne) == " + mTwo.compareTo(mOne));
    }
}
