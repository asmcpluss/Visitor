
/**
 * state all interfaces that ConcreteVisitor should instance
 * @author Dell
 *
 */
public interface Visitor {
	public void visit(NodeA node);
	public void visit(NodeB node);
}
