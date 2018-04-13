import java.util.Map;

public class mul implements expression {
	expression leftOperand;
    expression rightOperand;
    public mul(final expression left, final expression right) {
        leftOperand = left;
        rightOperand = right;
    }
		
    public int interpret(final Map<String, expression> variables) {
        return leftOperand.interpret(variables) * rightOperand.interpret(variables);
    }
}
