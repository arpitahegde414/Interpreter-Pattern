import java.util.Map;
public interface expression {
  public int interpret(final Map<String,expression> variables);
}
