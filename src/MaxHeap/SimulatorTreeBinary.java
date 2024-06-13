
package MaxHeap;


import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Toloza XD
 */
public class SimulatorTreeBinary {

    TreeBB myTree = new TreeBB();

    public SimulatorTreeBinary() {
    }
    
    
    void setroot(Node root){
        this.myTree.setRoot(root);
    }
    Node getRoot(){
        return myTree.getRoot();
    }
    //metodo para mostrar los recorridos del arbol
    public String preorder() {
        LinkedList it = this.myTree.preorder();
        return (route(it));
    }

    public String inorder() {
        LinkedList it = this.myTree.inorder();
        return (route(it));
    }

    public String postorder() {
        LinkedList it = this.myTree.postorder();
        return (route(it));
    }
    
    //metodo para poder mostrar los tipos d recorrido
    private String route(LinkedList it) {
        int i = 0;
        String r ="";
        while (i < it.size()) {
            r += "  " + it.get(i).toString() + "";
            i++;
        }
        return (r);
    }

    public JPanel getDrawing() {
        return this.myTree.getdrawing();
    }
}
