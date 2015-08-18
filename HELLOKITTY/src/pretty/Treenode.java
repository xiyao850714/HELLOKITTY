package pretty;

class TreeNode<E> {
		E data;
		TreeNode<E> left;
		TreeNode<E> right;
		int visited;

		// testdfadsf
		TreeNode(E element, TreeNode<E> left, TreeNode<E> right) {
			this.data = element;
			this.left = left;
			this.right = right;
		}
}
