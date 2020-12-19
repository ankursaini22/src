class Node{
	int data;
	Node left;
	Node right;
}
class Bst {
	public Node createNewNode(int data) {
		Node node=new Node();
		node.data=data;
		node.left=null;
		node.right=null;
		return node;
	}
	public Node insert(Node node,int data) {
		if(node==null) {
			return createNewNode(data);
		}
		if(data<node.data) {
			node.left = insert(node.left,data);
		}
		else if(data>node.data) {
			node.right =insert(node.right,data);
		}
		
		return node;
	}
	public void inorder(Node node) {
		if(node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data);
	}
	
}
public class BinarySearchTree {
	public static void main(String args[]) {
		Bst obj=new Bst();
		Node root=null;
		//8,3,6,10,4,7,1,14,13
		root= obj.insert(root, 8);
		root= obj.insert(root, 3);
		root= obj.insert(root, 6);
		root= obj.insert(root, 10);
		root= obj.insert(root, 4);
		root= obj.insert(root, 7);
		root= obj.insert(root, 1);
		root= obj.insert(root, 14);
		root= obj.insert(root, 13);
		
		obj.inorder(root);
	}

}
