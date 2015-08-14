package pretty;

class Treenode<E> {
		E data;
		Treenode<E> left;
		Treenode<E> right;

		// testdfadsf
		Treenode(E element, Treenode<E> left, Treenode<E> right) {
			this.data = element;
			this.left = left;
			this.right = right;
		}
}
