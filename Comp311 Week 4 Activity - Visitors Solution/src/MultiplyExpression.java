public class MultiplyExpression extends BinaryExpression
{
    public MultiplyExpression(Expression left, Expression right)
    {
        super(left, right);
    }
    
    /**
     * @see BinaryExpression#getOperation()
     */
    public Operation getOperation()
    {
        return ConcreteOperation.MULTIPLY;
    }
}
