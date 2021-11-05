package com.gl.labs3dsaq2;
import java.util.ArrayList;

class DriverClass {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		//Inserting elements into the tree
		bst.root = bst.insert(bst.root, 100);
		bst.root = bst.insert(bst.root, 20);
		bst.root = bst.insert(bst.root, 130);
		bst.root = bst.insert(bst.root, 10);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 110);
		bst.root = bst.insert(bst.root, 140);
		bst.root = bst.insert(bst.root, 5);
		
		LongestPath lp = new LongestPath();
		
		ArrayList<Integer> resultList = lp.getLongestPath(bst.root);
		
		for(int i=resultList.size()-1; i>=0; i--) {
			System.out.print(resultList.get(i) + " -> ");
		}
		
	}
}
