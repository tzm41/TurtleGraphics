/**
 * Created by colin on 1/25/16.
 */
public class TestTurtleTokenizer {
    public static void main(String[] args) {
        TurtleTokenizer tokenizer = new TurtleTokenizer("X4 {F120 L90}");
        while (tokenizer.hasMoreTokens()) {
            System.out.print(tokenizer.nextToken() + "\n");
        }

        TurtleTokenizer tokenizer2 = new TurtleTokenizer("F120LF120LF120LF120L");
        while (tokenizer2.hasMoreTokens()) {
            System.out.print(tokenizer2.nextToken() + "\n");
        }

        TurtleTokenizer tokenizer3 = new TurtleTokenizer("X36 {X4 {F120 L90} L10}");
        while (tokenizer3.hasMoreTokens()) {
            System.out.print(tokenizer3.nextToken() + "\n");
        }

        TurtleTokenizer tokenizer4 = new TurtleTokenizer("X36 {X4 {F120 L90} L10} ");
        while (tokenizer4.hasMoreTokens()) {
            System.out.print(tokenizer4.nextToken() + "\n");
        }

        TurtleTokenizer tokenizer5 = new TurtleTokenizer("F120 L90");
        while (tokenizer5.hasMoreTokens()) {
            System.out.print(tokenizer5.nextToken() + "\n");
        }

        TurtleTokenizer tokenizer6 = new TurtleTokenizer("F120 L90");
        while (tokenizer6.hasMoreTokens()) {
            System.out.print(tokenizer6.nextToken() + "\n");
        }
    }
}
