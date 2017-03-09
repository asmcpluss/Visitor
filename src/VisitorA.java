
public class VisitorA implements Visitor{

	@Override
	public void visit(NodeA node) {
		// TODO Auto-generated method stub
		System.out.println(node.operA());
	}

	@Override
	public void visit(NodeB node) {
		// TODO Auto-generated method stub
		System.out.println(node.operB());
	}
	
}
