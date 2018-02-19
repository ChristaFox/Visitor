//preVisit AddExpression
//visit ConstantExpression 3
//visit AddExpression
//visit ConstantExpression 5
//postVisit AddExpression
//
//Hint: You can use obj.getClass().getSimpleName() to get the name of an object.

public class DebugVisitor extends AbstractVisitor {
	private StringBuilder sBuild = new StringBuilder();
	public void preVisit(BinaryExpression ex) {
		sBuild.append("preVisit ");
		sBuild.append(ex.getClass().getSimpleName());
		sBuild.append('\n');
	}
	
	public void visit(BinaryExpression ex) {
		sBuild.append("visit ");
		sBuild.append(ex.getClass().getSimpleName());
		sBuild.append('\n');
	}
	
	public void postVisit(BinaryExpression ex) {
		sBuild.append("postVisit ");
		sBuild.append(ex.getClass().getSimpleName());
		sBuild.append('\n');
	}
	
	public void visit(ConstantExpression ex) {
		sBuild.append("visit ");
		sBuild.append(ex.getClass().getSimpleName() + ' ' + ex.getValue());
		sBuild.append('\n');
	}
	
	public String toString() {
		return sBuild.toString();
	}
	
}
