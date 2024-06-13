
package MaxHeap;

import java.util.LinkedList;
import java.util.Queue;



public class createmax{
     static Node root = null;
    static  Queue<Node> q = new LinkedList<>();

    public createmax(int[] arr, int n) {
        root=null;
        createTree(arr, n);
	levelOrder(root);
    }

  
    
    
    Node getRoot(){
        return root;
    }
    
    
     static Node newNode(int value) {
		Node n = new Node();
		n.data = value;
		n.left = null;
		n.right = null;
		return n;
	}
     static void insertValue(int value) {
		Node node = newNode(value);
		if (root == null)
			root = node;

		else if (q.peek().left == null)
			q.peek().left = node;

		else {
			q.peek().right = node;
			q.remove();
		}

		q.add(node);

	}
     static void createTree(int arr[],
			int n) {
		for (int i = 0; i < n; i++)
			insertValue(arr[i]);
	}
     
      static void levelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> n = new LinkedList<>();
		n.add(root);
		while (!n.isEmpty()) {
			/*System.out.print(n.peek().data +
					" ");*/
			if (n.peek().left != null)
				n.add(n.peek().left);
			if (n.peek().right != null)
				n.add(n.peek().right);
			n.remove();
		}
	}
      
      
      
     
    
}
