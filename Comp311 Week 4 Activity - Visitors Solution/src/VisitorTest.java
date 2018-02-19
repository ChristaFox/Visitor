import junit.framework.TestCase;

public class VisitorTest extends TestCase
{
    private Expression expr;

    /**
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
        // create an expression for ((5+2)*(3-7))
        expr =
            new MultiplyExpression(
                new AddExpression(
                    new ConstantExpression(5),
                    new ConstantExpression(2)),
                new SubtractExpression(
                    new ConstantExpression(3),
                    new ConstantExpression(7)));
    }

    //prints numbers and symbols
    public void testPrintVisitor()
    {
        PrintVisitor visitor = new PrintVisitor();
        expr.accept(visitor);
        assertEquals("((5+2)*(3-7))", visitor.getResult());
    }
    
    //sum
    public void testComputeVisitor()
    {
        ComputeVisitor visitor = new ComputeVisitor();
        expr.accept(visitor);
        assertEquals(-28, visitor.getResult().intValue());
    }
    
    public void testDebugVisitor() {
    	DebugVisitor bugVisit = new DebugVisitor();
    	expr.accept(bugVisit);
    	assertEquals((bugVisit.toString()), ("preVisit MultiplyExpression" + '\n' +
    			"preVisit AddExpression" + '\n' +
    			"visit ConstantExpression 5" + '\n' +
    			"visit AddExpression" + '\n' +
    			"visit ConstantExpression 2" + '\n' +
    			"postVisit AddExpression" + '\n' +
    			"visit MultiplyExpression" + '\n' +
    			"preVisit SubtractExpression" + '\n' +
    			"visit ConstantExpression 3" + '\n' +
    			"visit SubtractExpression" + '\n' +
    			"visit ConstantExpression 7" + '\n' +
    			"postVisit SubtractExpression" + '\n' +
    			"postVisit MultiplyExpression" + '\n'));
    }
    
    public void testPostfixVisitor() {
    	PostfixVisitor fixer = new PostfixVisitor();
    	expr.accept(fixer);
    	assertEquals(fixer.toString(), "5 2 + 3 7 - * ");
    }
    
}
