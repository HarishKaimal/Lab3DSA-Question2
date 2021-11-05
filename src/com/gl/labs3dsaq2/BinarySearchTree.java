package com.gl.labs3dsaq2;

class BinarySearchTree {
	
	Node root;
	
	public Node insert(Node root, int value) {
		
		if(root == null) {
			Node obj = new Node(value);
			return obj;
		}
			
		else if (root.data < value)
			root.right = insert(root.right, value);
		else if (root.data > value)
			root.left = insert(root.left,value);
	
		return root;
	
	}

}
