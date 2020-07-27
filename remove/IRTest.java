/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
public class IRTest
{
    public static void main(String[] args)
    {
        IteratorRemover test = new IteratorRemover();
        test.setTest(args[0], args[1]);
        test.remove();
        System.out.println(test);
    }
}
