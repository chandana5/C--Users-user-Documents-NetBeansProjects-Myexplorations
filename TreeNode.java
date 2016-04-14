package Tree;

import java.util.Stack;

public class TreeNode {
int val;
TreeNode right;
TreeNode left;
/*TreeNode(int NewItem,TreeNode r,TreeNode l )
{
	right=r;
	left=l;
	val=NewItem;
	
}*/

public int getVal() {
	return val;
}

public void setVal(int val) {
	this.val = val;
}

public TreeNode getRight() {
	return right;
}

public void setRight(TreeNode right) {
	this.right = right;
}

public TreeNode getLeft() {
	return left;
}

public void setLeft(TreeNode left) {
	this.left = left;
}


public static void main(String args[])
{//Setting a Tree
	TreeNode root=new TreeNode();
	TreeNode rootright=new TreeNode();
	TreeNode rootleft=new TreeNode();
	TreeNode l1=new TreeNode();
	TreeNode l2=new TreeNode();
	TreeNode l3=new TreeNode();
	TreeNode l4=new TreeNode();
	root.setVal(10);
	rootright.setVal(5);
	rootleft.setVal(11);
	root.setLeft(rootleft);
	root.setRight(rootright);
	rootright.setLeft(l1);
	l1.setVal(13);
	rootright.setRight(l2);
	l1.setVal(7);
	rootleft.setLeft(l3);
	l3.setVal(6);
	rootleft.setRight(l4);
	l4.setVal(7);
	
	//Printing
	
	Stack<TreeNode>dfs=new Stack<TreeNode>();
	
	While(root.left!=null && TreeNode.right!=null)
	dfs.push(root);
	System.out.println(dfs.pop().getVal());
	dfs.push(root.left);
	dfs.push(root.right);
	
	
	
}

}
