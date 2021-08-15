public abstract class Card {
    public static final String[] FACES = {"ZERO", "ACE", "TWO", "THREE", "FOUR",
        "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};

    private String suit;
    private int face;

    // Constructors


    // Modifiers


    // Accessors


    public abstract int getValue();

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}
