/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
public class Grader {
    public static void main(String[] args) {
        IteratorRemover test = new IteratorRemover();
        if (args.length == 2) {
            MathSet test = new MathSet(args[0], args[1]);
            System.out.println(test.union());
            System.out.println(test.intersection());
            System.out.println(test.differenceAminusB());
            System.out.println(test.differenceBminusA());
            System.out.println(test.symmetricDifference());
        }
    }
}
