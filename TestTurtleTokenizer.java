/**
 * Created by colin on 1/25/16.
 */
public class TestTurtleTokenizer {
    public static void main(String[] args) {
        TurtleTokenizer tokenizer = new TurtleTokenizer("X4 {F120 L90}");
        while (tokenizer.hasMoreTokens()) {
            System.out.print(tokenizer.nextToken() + "\n");
        }
    }
}
