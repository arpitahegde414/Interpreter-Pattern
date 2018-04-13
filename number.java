import java.util.Map;

class number implements expression {
    private int number;
    public number(final int number)       { this.number = number; }
    public int interpret(final Map<String, expression> variables)  { return number; }
}
