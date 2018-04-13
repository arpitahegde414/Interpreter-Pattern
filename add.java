import java.util.Map;
public class add implements expression {
	expression leftOperand;
    expression rightOperand;
    public add(final expression left, final expression right) {
        leftOperand = left;
        rightOperand = right;
    }
		
    public int interpret(final Map<String, expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
