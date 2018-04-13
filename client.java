import java.util.Map;
import java.util.HashMap;

public class client {
    public static void main(final String[] args) {
        final String expression = "a b * c d * +";
        final evaluator sentence = new evaluator(expression);
        final Map<String, expression> variables = new HashMap<String, expression>();
        variables.put("a", new number(2));
        variables.put("b", new number(5));
        variables.put("c", new number(3));
        variables.put("d",new number(2));
        final int result = sentence.interpret(variables);
        System.out.println(result);
    }
}