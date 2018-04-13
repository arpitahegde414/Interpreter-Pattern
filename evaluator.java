import java.util.Map;
import java.util.Stack;
public class evaluator implements expression{
	private expression syntaxTree;

    public evaluator(final String expression) {
        final Stack<expression> expressionStack = new Stack<expression>();
        for (final String token : expression.split(" ")) {
            if (token.equals("+")) {
                final expression subExpression = new add(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("-")) {
                // it's necessary remove first the right operand from the stack
                final expression right = expressionStack.pop();
                // ..and after the left one
                final expression left = expressionStack.pop();
                final expression subExpression = (expression) new sub(left, right);
                expressionStack.push(subExpression);
            } else if(token.equals("*"))
            {
            	final expression subExpression = new mul(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            }
            else if(token.equals("/"))
            {
            	// it's necessary remove first the right operand from the stack
                final expression right = expressionStack.pop();
                // ..and after the left one
                final expression left = expressionStack.pop();
                final expression subExpression = (expression) new div(left, right);
                expressionStack.push(subExpression);	
            }
            else
                expressionStack.push(new variable(token));
        }
        syntaxTree = expressionStack.pop();
}
    public int interpret(final Map<String, expression> context) {
        return syntaxTree.interpret(context);
    }
}
