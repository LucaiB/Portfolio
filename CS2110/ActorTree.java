/**
 * This is the class you will create
 * 
 * @author Your friendly CS professors
 * 
 *
 */
public class ActorTree {
	/**
	 * ActorTree has only one property, the root node
	 */
	Node root;

	/**
	 * Initialize the root node in the default constructor
	 */
	public ActorTree() {
		root = new Node();
	}

	/**
	 * 
	 * @param name - the name to find
	 * @return the matching Actor object
	 */
	public Actor find(String name) {
		if (this.isEmpty())
			return null;

		return root.find(name); // send to node class find method

		/*
		 * while (root != null) { if (name.compareTo(root.actor.primaryName) > 0) root =
		 * root.right; else if (name.compareTo(root.actor.primaryName) < 0) root =
		 * root.left; else return root.actor; } return null;
		 */
	}

	/**
	 * 
	 * @return an int representing 1 for each node in the tree
	 * 
	 */
	public int size() {
		if (this.isEmpty())
			return 0;
		else
			return root.size(); // send to node class size method

	}

	/**
	 * 
	 * @return an int representing the maximum height of any branch
	 */
	public int height() {
		if (this.isEmpty())
			return 0;
		else
			return root.height(); // send to node class height method
	}

	/**
	 * an empty tree is one with no data
	 * 
	 * @return boolean - True if the tree is empty
	 */
	public boolean isEmpty() {
		if (root.actor == null)
			return true;

		return false;
	}

	/**
	 * 
	 * @param a - an Actor object
	 * @return boolean - True if the element was inserted
	 */
	public boolean insert(Actor a) {

		if (isEmpty()) {
			this.root = new Node(a);
			return true;
		} else
			return root.insert(a); // send to node class insert method
		/*
		 * else if (a.compareTo(root.actor) > 0) { return root.right.insert(a); } else
		 * if (a.compareTo(root.actor) < 0) { return root.left.insert(a); } else return
		 * false;
		 */

	}

	/**
	 * root = new Node(); root.actor = a; return true;
	 **/

	/**
	 * In order Traversal
	 */
	public String inOrder() {
		if (isEmpty())
			return "";

		return root.inOrder(); // send to node class inOrder method
	}

	/**
	 * The Node class is an inner class of the ActorTree This is a Binary Search
	 * Tree, so each Node will have left and right children
	 * 
	 * @author Your friendly CS Professors
	 *
	 */
	class Node {
		Actor actor;
		Node left;
		Node right;

		/**
		 * default constructor
		 */
		public Node() {
			actor = null;
		}

		/**
		 * Constructor that takes an Actor object
		 * 
		 * @param a - an Actor left and right children are initialized to null
		 */
		public Node(Actor a) {
			actor = a;
			left = null;
			right = null;

		}

		/**
		 * The size method is recursive
		 * 
		 * @return an int to represent a count of all nodes
		 */
		public int size() {

			int sum = 0;
			if (right != null)
				sum += right.size(); // if there is a right, find size of right subtree and add to sum
			if (left != null)
				sum += left.size(); // if there is a left, add left.size to sum
			
			return 1 + sum; // for every node visited, add one to the sum
		}

		/**
		 * The height method is recursive
		 * 
		 * @return an int to represent the maximum height of right or left child nodes,
		 *         plus 1 for the current node
		 */
		public int height() {
			return height(this);

		}

		public int height(Node n) {
			if (n == null)
				return 0;
			else
				return 1 + Math.max(height(n.left), height(n.right)); // returns whichever height is higher (left or
																		// right) and add root to height. This call will
																		// repeatedly decide if the left or right
																		// subtree is "taller" and will recursively find
																		// the max height
		}

		/**
		 * The insert method finds the best place to insert the Actor argument
		 * 
		 * @param a - an Actor to insert
		 * @return boolean - True if the Actor argument was added, false otherwise
		 */
		public boolean insert(Actor a) {
			if (this.actor.compareTo(a) < 0) { // compare to see which direction to traverse tree
				if (this.right != null)
					this.right.insert(a); // if right is available and a > actor, right.insert
				else {
					this.right = new Node(); // if no right is available, then create the new node to the right
					this.right.actor = a;
					return true;
				}
			} else if (this.actor.compareTo(a) > 0) { // same process but to the left because a < actor
				if (this.left != null)
					this.left.insert(a);
				else {
					this.left = new Node();
					this.left.actor = a;
					return true;
				}
			}
			return false;

			/*
			 * if (actor == null) { actor = a; return true; } else if (a.compareTo(actor) >
			 * 0) { right.insert(a); } else if (a.compareTo(root.actor) < 0) {
			 * left.insert(a); } else return false;
			 * 
			 * return true;
			 */
		}

		/**
		 * The find method returns an Actor object with a matching name
		 * 
		 * @param name - the name to search for
		 * @return the searched for Actor, or null
		 */
		public Actor find(String name) {
			if (this.actor == null)
				return null;

			if (name.compareTo(actor.primaryName) < 0) // compare to left and right to decide which direction to
														// traverse the tree
				return left.find(name);
			else if (name.compareTo(actor.primaryName) > 0)
				return right.find(name);
			else
				return actor; // if equal then return the actor because it was found

		}

		public String inOrder() {

			String str = "";

			if (this.left != null) // check if there's a left node
				str += left.inOrder(); // add left inOrder to str

			str += this.actor.toString() + "\n"; // add current node to str

			if (this.right != null)
				str += right.inOrder(); // add right to str

			return str;

		}
	}

}
