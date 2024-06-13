
package AVL;



/**
 *
 * @author Toloza XD
 */
public class Node {
    public int data,height;
    public Node left,right;

    public Node(int data) {
        this.data = data;
        height=1;
    }

    public int getHeight() {
        return height;
    }
     public void setHeight(int height) {
        this.height = height;
    }

    
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
 
}
