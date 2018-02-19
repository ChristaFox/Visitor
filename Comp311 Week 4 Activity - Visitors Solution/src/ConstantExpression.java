
public class ConstantExpression extends Expression
{
    Integer value;
    
    public ConstantExpression(Integer value) {
        this.value = value;
    }
    
    public Integer getValue() {
        return value;
    }
    
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
