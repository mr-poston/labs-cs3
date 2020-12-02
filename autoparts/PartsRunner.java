import static java.lang.System.*;

public class PartsRunner {
    public static void main(String[] args) {
        PartList list = new PartList("partinfo.dat");
        out.println(list);
    }
}
