
public abstract class BinaryExpression extends Expression
{
    Expression leftChild;
    Expression rightChild;
    
    public BinaryExpression(Expression left, Expression right) {
        leftChild = left;
        rightChild = right;
    }

    public void accept(Visitor visitor)
    {
        if(visitor.isDone()) {
            return;
        }
        
        visitor.preVisit(this);
        leftChild.accept(visitor);
        
        if(visitor.isDone()) {
            return;
        }
        
        visitor.visit(this);
        rightChild.accept(visitor);
        
        if(visitor.isDone()) {
            return;
        }
        
        visitor.postVisit(this);
    }
    
    public abstract Operation getOperation();
}
