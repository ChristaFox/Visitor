/**
 * Visitable interface
 * 
 * @author TKington
 * @version Feb 3, 2007
 */
public interface Visitable
{
    /**
     * Accepts a Visitor.
     * 
     * @param visitor
     */
    void accept(Visitor visitor);
}
