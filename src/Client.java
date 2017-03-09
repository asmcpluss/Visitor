/**
 * just a simple example
 * for instance, visitor mode could deal with complex object-tree structure and 跨越多个等级结构的树结构
 * @author Dell
 *
 */
public class Client {
	public static void main(String args[]){
		ObjectStructure objs = new ObjectStructure();
		objs.add(new NodeA());
		objs.add(new NodeB());
		Visitor visitor = new VisitorA();
		objs.action(visitor);
	}

}
