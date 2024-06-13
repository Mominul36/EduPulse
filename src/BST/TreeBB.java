
package BST;

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
        Node newnode = new Node(data, null, null);
        insert(newnode, root);
        return true;
    }
    
    
    public void insert(Node newnode, Node pivote) {
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

    }
    
    
    void remove(int data){
        root = deleteNode(root, data);
    }
    
    
    Node deleteNode(Node root, int key) {
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
    }
    
    
    
    
    


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
