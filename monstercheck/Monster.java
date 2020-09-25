import static java.lang.System.*;

public interface Monster {
    public int getHowBig();
    public String getName();
    public boolean isBigger(Monster other);
    public boolean isSmaller(Monster other);
    public boolean nameTheSame(Monster other);
}
