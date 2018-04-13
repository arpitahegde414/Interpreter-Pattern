import java.util.Map;
public class variable implements expression {
	 private String name;
	    public variable(final String name)       { this.name = name; }
	    public int interpret(final Map<String, expression> variables) {
	        if (null == variables.get(name)) return 0; // Either return new Number(0).
	        return variables.get(name).interpret(variables);
}
}
