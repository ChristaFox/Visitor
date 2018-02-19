import java.util.Stack;

public class ComputeVisitor extends AbstractVisitor
{
    Stack<Integer> s = new Stack<Integer>();
    
    /**
     * This will be called after both children have been processed,
     * so the result of the left and right child expressions will be
     * the top two elements on the stack.
     * 
     * @see Visitor#postVisit(BinaryExpression)
     * @param expr
     */
    public void postVisit(BinaryExpression expr)
    {
        //  Note that the order has been reversed by the stack
        Integer arg2 = s.pop();
        Integer arg1 = s.pop();
        
        Operation op = expr.getOperation();
        s.push(op.apply(arg1, arg2));
    }

    public void visit(ConstantExpression expr)
    {
        s.push(expr.getValue());
    }
    
    public Integer getResult() {
        return s.pop();
    }
}
