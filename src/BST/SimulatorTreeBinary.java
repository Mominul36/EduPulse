
package BST;

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

    public boolean insert(Integer data) {
        return (this.myTree.add(data));
    }
    
   public  void erase(Integer data){
        if(!this.myTree.exists(data)){
            JOptionPane.showMessageDialog(null, "Element not found.","Warning",0);
            return;
        }
        
        this.myTree.remove(data);
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
    
    
    //Metodo para buscar dato en el nodo
    public String buscar(Integer data) {
        boolean siEsta = this.myTree.exists(data);
        String r = "El dato:" + data.toString() + "\n";
        r += siEsta ? "Si se encuentra en el arbol" : "No se encuentra en el arbol";
        return (r);
    }

    public JPanel getDrawing() {
        return this.myTree.getdrawing();
    }
}
