import static java.lang.System.out;

public class CardTestOne {
    public static void main(String[] args) {
        Card one = new GolfCard();
        out.println(one);

        Card two = new GolfCard(1, "DIAMONDS");
        out.println(two);

        Card three = new GolfCard(4, "CLUBS");
        out.println(three);

        Card four = new GolfCard(11, "SPADES");
        out.println(four);

        Card five = new GolfCard(12, "HEARTS");
        out.println(five);

        Card six = new GolfCard(9, "SPADES");
        out.println(six);

        out.println(one.equals(two));
        out.println(one.equals(one));
        out.println(four.equals(five));
        out.println(three.equals(four));
    }
}
