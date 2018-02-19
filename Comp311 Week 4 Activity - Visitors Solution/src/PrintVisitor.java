
public class PrintVisitor extends AbstractVisitor
{
    StringBuffer buf = new StringBuffer();
    
    public void preVisit(BinaryExpression expr)
    {
        buf.append('(');
    }

    public void visit(BinaryExpression expr)
    {
        buf.append(expr.getOperation());
    }
    
    public void postVisit(BinaryExpression expr)
    {
        buf.append(')');
    }

    public void visit(ConstantExpression expr)
    {
        buf.append(expr.getValue());
    }
    
    public String getResult() {
        return buf.toString();
    }
}
