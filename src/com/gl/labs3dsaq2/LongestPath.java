package com.gl.labs3dsaq2;
import java.util.ArrayList;


class LongestPath {
	
	public ArrayList<Integer> getLongestPath(Node root) {
		
		if(root == null) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			return output;
		}
		
		ArrayList<Integer> leftList = getLongestPath(root.left);
		
		ArrayList<Integer> rightList = getLongestPath(root.right);
		
		if (leftList.size() > rightList.size()) {
			leftList.add(root.data);
		}
		else {
			rightList.add(root.data);
		}
		
		return (leftList.size() > rightList.size() ? leftList : rightList);
		
	}

}
