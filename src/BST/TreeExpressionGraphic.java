
package BST;



import java.awt.*;
import java.util.*;
import javax.swing.*;


public class TreeExpressionGraphic extends JPanel 
{
    private TreeBB myTree;
    private HashMap positionNodes = null;
    private HashMap subtreeSizes = null;
    private boolean dirty = true;
    private int parent2child = 20, child2child = 30;
    private Dimension empty = new Dimension(0,0);
    private FontMetrics fm = null;
    
    
 
    public TreeExpressionGraphic(TreeBB myTree) 
    {
          this.myTree = myTree;
          //this.setBackground(Color.WHITE);
          positionNodes = new HashMap();
          subtreeSizes = new HashMap();
          dirty = true;
          repaint();      
    }


 
    private void calculatePositions() 
    {
         positionNodes.clear();
         subtreeSizes.clear();
         Node root = this.myTree.getRoot();
         if (root != null) 
         {
             calculateSizeSutree(root);
             calculatePosition(root, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
         }
    }
    
  
    private Dimension calculateSizeSutree(Node n) 
    {
          if (n == null) 
              return new Dimension(0,0);
 
          Dimension ld = calculateSizeSutree(n.getLeft());
          Dimension rd = calculateSizeSutree(n.getRight());
          
          int h = fm.getHeight() + parent2child + Math.max(ld.height, rd.height);
          int w = ld.width + child2child + rd.width;
          
          Dimension d = new Dimension(w, h);
          subtreeSizes.put(n, d);
          
          return d;
    }
    
    

    private void calculatePosition(Node n, int left, int right, int top) 
    {
      if (n == null) 
          return;
      
      Dimension ld = (Dimension) subtreeSizes.get(n.getLeft());
      if (ld == null) 
          ld = empty;
      
      Dimension rd = (Dimension) subtreeSizes.get(n.getRight());
      if (rd == null) 
          rd = empty;
      
      int center = 0;
      
      if (right != Integer.MAX_VALUE)
          center = right - rd.width - child2child/2;
      else if (left != Integer.MAX_VALUE)
          center = left + ld.width + child2child/2;
      int width = fm.stringWidth(n.getData()+"");
 
      positionNodes.put(n,new Rectangle(center - width/2 - 3, top, width + 6, fm.getHeight()));
      
      calculatePosition(n.getLeft(), Integer.MAX_VALUE, center - child2child/2, top + fm.getHeight() + parent2child);
      calculatePosition(n.getRight(), center + child2child/2, Integer.MAX_VALUE, top + fm.getHeight() + parent2child);
    }

    private void drawTree(Graphics2D g, Node n, int puntox, int puntoy, int yoffs) 
    {
     if (n == null) 
         return;
     
     Rectangle r = (Rectangle) positionNodes.get(n);
     g.draw(r);
     g.drawString(n.getData()+"", r.x + 3, r.y + yoffs);
   
     if (puntox != Integer.MAX_VALUE)
       
     g.drawLine(puntox, puntoy, (int)(r.x + r.width/2), r.y);
     
     drawTree(g, n.getLeft(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     drawTree(g, n.getRight(), (int)(r.x + r.width/2), r.y + r.height, yoffs);
     
   }
    

 
    @Override
   public void paint(Graphics g) 
   {
         super.paint(g);
         fm = g.getFontMetrics();

         if (dirty) 
         {
           calculatePositions();
           dirty = false;
         }
         
         Graphics2D g2d = (Graphics2D) g;
         g2d.translate(getWidth() / 2, parent2child);
         drawTree(g2d, this.myTree.getRoot(), Integer.MAX_VALUE, Integer.MAX_VALUE, 
                  fm.getLeading() + fm.getAscent());
         fm = null;
   }
   
 }




