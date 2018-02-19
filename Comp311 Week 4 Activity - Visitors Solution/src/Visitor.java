/**
 * Visitor interface
 * 
 * @author TKington
 * @version Feb 4, 2007
 */
public interface Visitor
{
    public void preVisit(BinaryExpression expr);
    public void visit(BinaryExpression expr);
    public void postVisit(BinaryExpression expr);
    public void visit(ConstantExpression expr);
    public boolean isDone();
}
