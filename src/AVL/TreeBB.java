
package AVL;


import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JPanel;


public class TreeBB {

    private Node root;
    int num_nodos;
    int alt;

    public TreeBB() {
        root = null;
    }
    
    public boolean add(int data) {
        //Node newnode = new Node(data, null, null);
        root = insert(root, data);
        return true;
    }
    
    
    ///*******for insert*****
    
    int height(Node N) { 
        if (N == null) 
            return 0; 
  
        return N.height; 
    } 
  
    // A utility function to get maximum of two integers 
    int max(int a, int b) { 
        return (a > b) ? a : b; 
    } 
  
    // A utility function to right rotate subtree rooted with y 
    // See the diagram given above. 
    Node rightRotate(Node y) { 
        Node x = y.left; 
        Node T2 = x.right; 
  
        // Perform rotation 
        x.right = y; 
        y.left = T2; 
  
        // Update heights 
        y.height = max(height(y.left), height(y.right)) + 1; 
        x.height = max(height(x.left), height(x.right)) + 1; 
  
        // Return new root 
        return x; 
    } 
  
    // A utility function to left rotate subtree rooted with x 
    // See the diagram given above. 
    Node leftRotate(Node x) { 
        Node y = x.right; 
        Node T2 = y.left; 
  
        // Perform rotation 
        y.left = x; 
        x.right = T2; 
  
        //  Update heights 
        x.height = max(height(x.left), height(x.right)) + 1; 
        y.height = max(height(y.left), height(y.right)) + 1; 
  
        // Return new root 
        return y; 
    } 
  
    // Get Balance factor of node N 
    int getBalance(Node N) { 
        if (N == null) 
            return 0; 
  
        return height(N.left) - height(N.right); 
    } 
  
    Node insert(Node node, int key) { 
  
        /* 1.  Perform the normal BST insertion */
        if (node == null) 
            return (new Node(key)); 
  
        if (key <= node.data) 
            node.left = insert(node.left, key); 
        else if (key > node.data) 
            node.right = insert(node.right, key); 
        else // Duplicate keys not allowed 
            return node; 
  
        /* 2. Update height of this ancestor node */
        node.height = 1 + max(height(node.left), 
                              height(node.right)); 
  
        /* 3. Get the balance factor of this ancestor 
              node to check whether this node became 
              unbalanced */
        int balance = getBalance(node); 
  
        // If this node becomes unbalanced, then there 
        // are 4 cases Left Left Case 
        if (balance > 1 && key < node.left.data) 
            return rightRotate(node); 
  
        // Right Right Case 
        if (balance < -1 && key > node.right.data) 
            return leftRotate(node); 
  
        // Left Right Case 
        if (balance > 1 && key > node.left.data) { 
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 
  
        // Right Left Case 
        if (balance < -1 && key < node.right.data) { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
  
        /* return the (unchanged) node pointer */
        return node; 
    } 
    
    
    //*********ende insert**********
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public void insert(Node newnode, Node pivote) {
        if (this.root == null) {
            root = newnode;
        } else {
            if (newnode.getData() <= pivote.getData()) {
                if (pivote.getLeft() == null) {
                    pivote.setLeft(newnode);
                } else {
                    insert(newnode, pivote.getLeft());
                }
            } else {
                if (pivote.getRight() == null) {
                    pivote.setRight(newnode);
                } else {
                    insert(newnode, pivote.getRight());
                }
            }
        }

    }*/
    
    
    void remove(int data){
        root = deleteNode(root, data);
    }
    
    Node minValueNode(Node node) 
    { 
        Node current = node; 
 
        /* loop down to find the leftmost leaf */
        while (current.left != null) 
        current = current.left; 
 
        return current; 
    } 
 
    Node deleteNode(Node root, int key) 
    { 
        // STEP 1: PERFORM STANDARD BST DELETE 
        if (root == null) 
            return root; 
 
        // If the key to be deleted is smaller than 
        // the root's key, then it lies in left subtree 
        if (key < root.data) 
            root.left = deleteNode(root.left, key); 
 
        // If the key to be deleted is greater than the 
        // root's key, then it lies in right subtree 
        else if (key > root.data) 
            root.right = deleteNode(root.right, key); 
 
        // if key is same as root's key, then this is the node 
        // to be deleted 
        else
        { 
 
            // node with only one child or no child 
            if ((root.left == null) || (root.right == null)) 
            { 
                Node temp = null; 
                if (temp == root.left) 
                    temp = root.right; 
                else
                    temp = root.left; 
 
                // No child case 
                if (temp == null) 
                { 
                    temp = root; 
                    root = null; 
                } 
                else // One child case 
                    root = temp; // Copy the contents of 
                                // the non-empty child 
            } 
            else
            { 
 
                // node with two children: Get the inorder 
                // successor (smallest in the right subtree) 
                Node temp = minValueNode(root.right); 
 
                // Copy the inorder successor's data to this node 
                root.data = temp.data; 
 
                // Delete the inorder successor 
                root.right = deleteNode(root.right, temp.data); 
            } 
        } 
 
        // If the tree had only one node then return 
        if (root == null) 
            return root; 
 
        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE 
        root.height = max(height(root.left), height(root.right)) + 1; 
 
        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether 
        // this node became unbalanced) 
        int balance = getBalance(root); 
 
        // If this node becomes unbalanced, then there are 4 cases 
        // Left Left Case 
        if (balance > 1 && getBalance(root.left) >= 0) 
            return rightRotate(root); 
 
        // Left Right Case 
        if (balance > 1 && getBalance(root.left) < 0) 
        { 
            root.left = leftRotate(root.left); 
            return rightRotate(root); 
        } 
 
        // Right Right Case 
        if (balance < -1 && getBalance(root.right) <= 0) 
            return leftRotate(root); 
 
        // Right Left Case 
        if (balance < -1 && getBalance(root.right) > 0) 
        { 
            root.right = rightRotate(root.right); 
            return leftRotate(root); 
        } 
 
        return root; 
    } 
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*Node deleteNode(Node root, int key) {
        if (root == null)
            return root;
 
      
        if (root.getData() > key) {
           // root.left = deleteNode(root.left, key);
            root.setLeft(deleteNode(root.getLeft(), key));
            return root;
        } else if (root.getData() < key) {
           // root.right = deleteNode(root.right, key);
            root.setRight(deleteNode(root.getRight(), key));
            return root;
        }
 
        // We reach here when root is the node
        // to be deleted.
 
        // If one of the children is empty
        if (root.getLeft() == null) {
            Node temp = root.getRight();
            return temp;
        } else if (root.getRight() == null) {
            Node temp = root.getLeft();
            return temp;
        }
 
        // If both children exist
        else {
 
            Node succParent = root;
 
            // Find successor
            Node succ = root.getRight();
            while (succ.getLeft() != null) {
                succParent = succ;
                succ = succ.getLeft();
            }
 
            // Delete successor.  Since successor
            // is always left child of its parent
            // we can safely make successor's right
            // right child as left of its parent.
            // If there is no succ, then assign
            // succ.right to succParent.right
            if (succParent != root)
                succParent.setLeft(succ.getRight());
                //succParent.left = succ.right;
            else
                succParent.setRight(succ.getRight());
                //succParent.right = succ.right;
 
            // Copy Successor Data to root
            root.setData(succ.getData());
           // root.key = succ.key;
 
            // Delete Successor and return root
            return root;
        }
    }*/
    
    
    
    
    


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //Recorrido preorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList preorder() {
        LinkedList rec = new LinkedList();
        preorden(root, rec);
        return rec;
    }
    
    public void preorden(Node aux, LinkedList listt) {
        if (aux != null) {
            listt.add(aux.getData());
            preorden(aux.getLeft(), listt);
            preorden(aux.getRight(), listt);
        }
    }

   
    public LinkedList inorder() {
        LinkedList rec = new LinkedList();
        inorden(root, rec);
        return rec;
    }
    
    public void inorden(Node aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getLeft(), recorrido);
            recorrido.add(aux.getData());
            inorden(aux.getRight(), recorrido);
        }
    }

    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList postorder() {
        LinkedList rec = new LinkedList();
        postorden(root, rec);
        return rec;
    }
    public void postorden(Node aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getLeft(), recorrido);
            postorden(aux.getRight(), recorrido);
            recorrido.add(aux.getData());
        }
    }

    
    public boolean exists(int data) {
        Node aux = root;
        while (aux != null) {
            if (data == aux.getData()) {
                return true;
            } else if (data > aux.getData()) {
                aux = aux.getRight();
            } else {
                aux = aux.getLeft();
            }
        }
        return false;
    }

    private void height(Node aux, int level) {
        if (aux != null) {
            height(aux.getLeft(), level + 1);
            alt = level;
            height(aux.getRight(), level + 1);
        }
    }

    //Devuleve la altura del arbol
    public int getAltura() {
        height(root, 1);
        return alt;
    }
    
     public JPanel getdrawing() {
        return new TreeExpressionGraphic(this);
    }
}
