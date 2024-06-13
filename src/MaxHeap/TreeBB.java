
package MaxHeap;


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
            listt.add(aux.data);
            preorden(aux.left, listt);
            preorden(aux.left, listt);
        }
    }

   
    public LinkedList inorder() {
        LinkedList rec = new LinkedList();
        inorden(root, rec);
        return rec;
    }
    
    public void inorden(Node aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.left, recorrido);
            recorrido.add(aux.data);
            inorden(aux.right, recorrido);
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
            postorden(aux.left, recorrido);
            postorden(aux.right, recorrido);
            recorrido.add(aux.data);
        }
    }
    
     public JPanel getdrawing() {
        return new TreeExpressionGraphic(this);
    }
}
