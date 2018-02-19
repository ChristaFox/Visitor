
public class PostfixVisitor extends AbstractVisitor{
	private StringBuilder sBuild = new StringBuilder();
	
	public void visit(ConstantExpression ex) {
		sBuild.append(ex.getValue() + " ");
	}
	
	public void postVisit(BinaryExpression ex) {
		sBuild.append(ex.getOperation() + " ");
	}
	
	public String toString() {
		return sBuild.toString();
	}
	
	
}
