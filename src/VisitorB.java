
public class VisitorB implements Visitor{

	@Override
	public void visit(NodeA node) {
		System.out.println(node.operA());
	}

	@Override
	public void visit(NodeB node) {
		System.out.println(node.operB());
	}

}
