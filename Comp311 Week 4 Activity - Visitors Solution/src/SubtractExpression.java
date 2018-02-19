public class SubtractExpression extends BinaryExpression
{
    public SubtractExpression(Expression left, Expression right)
    {
        super(left, right);
    }
    
    /**
     * @see Expression#getOperation()
     */
    public Operation getOperation()
    {
        return ConcreteOperation.SUBTRACT;
    }
}
