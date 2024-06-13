package DSA;

import raven.application.form.other.*;
import com.formdev.flatlaf.FlatClientProperties;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raven
 */
public class Expression_Converter extends javax.swing.JPanel {

    private int a,b,c;
ArrayList<Model> arr;
    public Expression_Converter() {
        initComponents();
        tablepanel.setVisible(false);
        arr = new ArrayList<>();
         a = (int)menu1.getSelectedIndex();
        b = (int)menu2.getSelectedIndex();
         c = (int)menu3.getSelectedIndex();
        
       /* lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        text1 = new javax.swing.JTextField();
        menu2 = new javax.swing.JComboBox<>();
        menu1 = new javax.swing.JComboBox<>();
        labelexchange = new javax.swing.JLabel();
        btnconvert = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        text2 = new javax.swing.JTextField();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        menu3 = new javax.swing.JComboBox<>();
        text3 = new javax.swing.JTextField();
        btnclear1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(806, 640));

        text1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text1KeyTyped(evt);
            }
        });

        menu2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menu2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prefix", "Infix", "Postfix" }));
        menu2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        menu2.setOpaque(true);
        menu2.setPreferredSize(new java.awt.Dimension(72, 20));
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        menu1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prefix", "Infix", "Postfix" }));
        menu1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        menu1.setOpaque(true);
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        labelexchange.setBackground(new java.awt.Color(255, 255, 51));
        labelexchange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelexchange.setIcon(new javax.swing.ImageIcon("D:\\exchange (6).png")); // NOI18N
        labelexchange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelexchangeMouseClicked(evt);
            }
        });

        btnconvert.setBackground(java.awt.Color.gray);
        btnconvert.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnconvert.setForeground(new java.awt.Color(255, 255, 255));
        btnconvert.setText("Convert");
        btnconvert.setBorderPainted(false);
        btnconvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnconvertMouseClicked(evt);
            }
        });
        btnconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconvertActionPerformed(evt);
            }
        });

        btnclear.setBackground(java.awt.Color.gray);
        btnclear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.setBorderPainted(false);
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        text2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL", "Symbol", "Stack", "Expression"
            }
        ));
        table.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menu3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prefix", "Postfix" }));
        menu3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        menu3.setOpaque(true);
        menu3.setPreferredSize(new java.awt.Dimension(72, 20));
        menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu3ActionPerformed(evt);
            }
        });

        text3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        text3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text3ActionPerformed(evt);
            }
        });
        text3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text3KeyTyped(evt);
            }
        });

        btnclear1.setBackground(java.awt.Color.gray);
        btnclear1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnclear1.setForeground(new java.awt.Color(255, 255, 255));
        btnclear1.setText("Evaluate");
        btnclear1.setBorderPainted(false);
        btnclear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclear1MouseClicked(evt);
            }
        });
        btnclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelexchange, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(btnconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclear1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelexchange, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclear1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnconvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("        Conversion from infix to prefix to postfix expressions");
        jLabel1.setAlignmentX(0.5F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        b = menu2.getSelectedIndex();
    }//GEN-LAST:event_menu2ActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        a = menu1.getSelectedIndex();
    }//GEN-LAST:event_menu1ActionPerformed

    private void labelexchangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelexchangeMouseClicked
        int c=a;
        a=b;
        b=c;
        menu1.setSelectedIndex(a);
        menu2.setSelectedIndex(b);
        String s = text1.getText();
        String ss = text2.getText();
        text1.setText(ss);
        text2.setText(s);

    }//GEN-LAST:event_labelexchangeMouseClicked

    private void btnconvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconvertMouseClicked

    }//GEN-LAST:event_btnconvertMouseClicked

    private void btnconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconvertActionPerformed
       String s = text1.getText().toString();
       s = s.replace(" ", "");
        if(s.matches("")){
            JOptionPane.showMessageDialog(new Expression_Converter(),"Enter a expression","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(a==b){
            text2.setText(s);
            tablepanel.setVisible(false);
        }
        
        
        
        else if(a==0 && b==1){   // prefix to infix
            if(!isOperator(s.charAt(0))){
              JOptionPane.showMessageDialog(null, "This is not a prefix expression", "Warning", 0);
              return;
            }
            
            
            try {
                Mod mod = pretoin(s);
                printtable(mod.result);
                text2.setText(mod.string);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Warning", 0);
            }
            
        }
        else if(a==0 && b==2){  // prefix to postfix
           if(!isOperator(s.charAt(0))){
              JOptionPane.showMessageDialog(null, "This is not a prefix expression", "Warning", 0);
              return;
            }
            try {
                Mod mod = pretopost(s);
                printtable(mod.result);
                text2.setText(mod.string);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Warning", 0);
            }
        }
        else if(a==1 && b==0){ // infix to prefix
           int d = s.length() - s.replace("(", "").length();
           int dd = s.length() - s.replace(")", "").length();
           if(d!=dd){
                JOptionPane.showMessageDialog(null, "Invalid infix expression", "Warning", 0);
              return;
           }
            try {
                Mod mod = intopre(s);
                text2.setText(mod.string);
                
                 printtable(mod.result);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Warning", 0);
            }
        }
        else if(a==1 && b==2){  // infix to postfix
           int d = s.length() - s.replace("(", "").length();
           int dd = s.length() - s.replace(")", "").length();
           if(d!=dd){
                JOptionPane.showMessageDialog(null, "Invalid infix expression", "Warning", 0);
              return;
           }
            try {
                Mod mod = intopost(s);
                printtable(mod.result);
                text2.setText(mod.string);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Warning", 0);
            }
        }
        else if(a==2 && b==0){    // postfix to prefix
           /*if(!isOperator(s.charAt(s.length()-1))){
              JOptionPane.showMessageDialog(null, "This is not a postfix expression", "Warning", 0);
              return;
            }*/
            try {
                Mod mod = posttopre(s);
                printtable(mod.result);
                text2.setText(mod.string);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Warning", 0);
            }
        }
        else if(a==2 && b==1){   // postfix to infix
           /* if(!isOperator(s.charAt(s.length()-1))){
              JOptionPane.showMessageDialog(null, "This is not a postfix expression", "Warning", 0);
              return;
            }*/
            try {
                Mod mod = posttoin(s);
                printtable(mod.result);
                text2.setText(mod.string);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Warning", 0);
            }
        }

    }//GEN-LAST:event_btnconvertActionPerformed

    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclearMouseClicked
        text1.setText("");
        text2.setText("");
        text3.setText("");
        tablepanel.setVisible(false);
    }//GEN-LAST:event_btnclearMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void text1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text1KeyTyped
     String s = text1.getText().toString();
     char c = evt.getKeyChar();
     if(!(Character.isLetterOrDigit(c) || c=='+' ||    c=='-' || c=='*' || c=='/' ||  c=='^' ||  c==')' ||  c=='(')){
         evt.consume();
     }
     if(c==')'){
         int d = s.length() - s.replace("(", "").length();
         int dd = s.length() - s.replace(")", "").length();
         if(d<=dd){
             evt.consume();
         }
     }
    }//GEN-LAST:event_text1KeyTyped

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed
      String s = text3.getText().toString();
      if(s.matches("")){
          return;
      }
       if(c==0){
           try {
                Mod mod = evaluatePrefix(s);
                printtable(mod.result);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Warning", 0);
            }
       }
       
       if(c==1){
           try {
                Mod mod = evaluatePostfix(s);
                printtable(mod.result);
              
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Input", "Warning", 0);
            }
       }
      
      
    }//GEN-LAST:event_btnclear1ActionPerformed

    private void btnclear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclear1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclear1MouseClicked

    private void text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text3ActionPerformed

    private void menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu3ActionPerformed
       c = (int)menu3.getSelectedIndex();
    }//GEN-LAST:event_menu3ActionPerformed

    private void text3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text3KeyTyped
     String s = text3.getText().toString();
     char c = evt.getKeyChar();
     if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^'){
         if(s.matches("")){
             
         }
         else if(s.charAt(s.length()-1)!=','){
             evt.consume();
         }
     }
     else if(c==','){
         if(s.matches("") || s.matches(",")){
              evt.consume();
         }
           
     }
     else if(Character.isDigit(c)){
         if(s.matches("")){
             
         }
         else if(s.charAt(s.length()-1)==','){
             
         }
         else if(Character.isDigit(s.charAt(s.length()-1))){
             
         }
         else{
             evt.consume();
         }
     }
     else{
          evt.consume();
     }
    
    }//GEN-LAST:event_text3KeyTyped

    
    
    
    
    void printtable(ArrayList<ArrayList<String>> result){
        DefaultTableModel tblmodel = (DefaultTableModel)table.getModel();
         int rowCount = tblmodel.getRowCount();

      for (int i = rowCount - 1; i >= 0; i--) {
            tblmodel.removeRow(i);
         }
      
      for(int i=0;i<result.size();i++){
          ArrayList<String> sub = result.get(i);
        
          if(sub.size()==2){
            String[] s = {Integer.toString(i+1), sub.get(0),sub.get(1),""};
            tblmodel.addRow(s);
          }
         else if(sub.size()==3){
            String[] s = {Integer.toString(i+1), sub.get(0),sub.get(1),sub.get(2)};
            tblmodel.addRow(s);
          }
      }
      
      
      tablepanel.setVisible(true);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btnconvert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelexchange;
    private javax.swing.JComboBox<String> menu1;
    private javax.swing.JComboBox<String> menu2;
    private javax.swing.JComboBox<String> menu3;
    private javax.swing.JTable table;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    // End of variables declaration//GEN-END:variables
static int pow(int a, int b){
   int s = a;
   for(int i=1;i<b;i++){
      s*=a;
   }
   return s;
}




   static Mod evaluatePrefix(String exp)
    {
      ArrayList<ArrayList<String>> result = new ArrayList<>();
       exp+= ",";
       String[] s = exp.split(",");
        Stack<String> stack = new Stack<String>();
 
        for (int i = s.length - 1; i >= 0; i--) {
         ArrayList<String> sub = new ArrayList<>();
         if(s[i].length()==1){
            char c = s[i].charAt(0);
            if(isOperator(c)){
               String a = stack.peek();
                 stack.pop();
                 String b = stack.peek();
                 stack.pop();

                if(c=='+')
                  stack.push(Integer.toString(Integer.parseInt(a) + Integer.parseInt(b)));
                else if(c=='-')
                  stack.push(Integer.toString(Integer.parseInt(a) - Integer.parseInt(b)));
                if(c=='*')
                  stack.push(Integer.toString(Integer.parseInt(a) * Integer.parseInt(b)));
                if(c=='/')
                  stack.push(Integer.toString(Integer.parseInt(a) / Integer.parseInt(b)));
                if(c=='^')
                  stack.push(Integer.toString(pow(Integer.parseInt(a),Integer.parseInt(b))));
                

            }
            else{
               stack.push(s[i]);
            }
         }
         else{
             stack.push(s[i]);
         }    


      sub.add(s[i]);
      sub.add(getstringtostring(stack));
      result.add(sub);
        }
 
        Mod mod = new Mod(result, stack.peek());
	 return mod;
    }




static Mod evaluatePostfix(String exp)
    {
      ArrayList<ArrayList<String>> result = new ArrayList<>();
       exp+= ",";
       String[] s = exp.split(",");
        Stack<String> stack = new Stack<String>();
 
        for (int i = 0; i < s.length; i++) {
         ArrayList<String> sub = new ArrayList<>();
         if(s[i].length()==1){
            char c = s[i].charAt(0);
            if(isOperator(c)){
               String a = stack.peek();
                 stack.pop();
                 String b = stack.peek();
                 stack.pop();

                if(c=='+')
                  stack.push(Integer.toString(Integer.parseInt(b) + Integer.parseInt(a)));
                else if(c=='-')
                  stack.push(Integer.toString(Integer.parseInt(b) - Integer.parseInt(a)));
                if(c=='*')
                  stack.push(Integer.toString(Integer.parseInt(b) * Integer.parseInt(a)));
                if(c=='/')
                  stack.push(Integer.toString(Integer.parseInt(b) / Integer.parseInt(a)));
                if(c=='^')
                  stack.push(Integer.toString(pow(Integer.parseInt(b),Integer.parseInt(a))));
                

            }
            else{
               stack.push(s[i]);
            }
         }
         else{
             stack.push(s[i]);
         }    


      sub.add(s[i]);
      sub.add(getstringtostring(stack));
      result.add(sub);
        }
 
        Mod mod = new Mod(result, stack.peek());
	 return mod;
    }


    static boolean isOperator(char x) 
{
	switch(x)
	{
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
			return true;
	}
	return false;
}

	static int getPriority(char C)
	{
		if (C == '-' || C == '+')
			return 1;
		else if (C == '*' || C == '/')
			return 2;
		else if (C == '^')
			return 3;

		return 0;
	}
	static String reverse(char str[], int start, int end)
	{
		char temp;
		while (start < end) {
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		return String.valueOf(str);
	}
   static String getstring(Stack<Character> stack){
      String s = "";
      for(int i=0;i<stack.size();i++){
         s+= Character.toString(stack.get(i));
      }
      return s;
   }

   static String getstringtostring(Stack<String> s){
    String ss = "";
    for(int i=0;i<s.size();i++){
      if(i==s.size()-1)
        ss+= s.get(i);
        else 
        ss+= s.get(i)+", ";
    }
      return ss;
   }


public static Mod pretoin(String str)
{
   ArrayList<ArrayList<String>> result = new ArrayList<>();
	Stack<String> stack = new Stack<>();
	int l = str.length();
	for(int i = l - 1; i >= 0; i--)
	{
       ArrayList<String> sub = new ArrayList<>();
		char c = str.charAt(i);
		if (isOperator(c))
		{
			String op1 = stack.pop();
			String op2 = stack.pop();
			String temp = "(" + op1 + c + op2 + ")";
			stack.push(temp);
		} 
		else
		{
			stack.push(c + ""); 
		}
      sub.add(Character.toString(c));
      sub.add(getstringtostring(stack));
      result.add(sub);
	}
	Mod mod = new Mod(result, stack.peek());
	 return mod;
}












static Mod posttoin(String exp)
{
   ArrayList<ArrayList<String>> result = new ArrayList<>();
	Stack<String> s = new Stack<String>();
	for (int i = 0; i < exp.length(); i++)
	{
      ArrayList<String> sub = new ArrayList<>();
		if (Character.isLetterOrDigit(exp.charAt(i)))
		{
		      s.push(exp.charAt(i) + "");
		}

		// We assume that input is
		// a valid postfix and expect
		// an operator.
		else
		{
			String op1 = s.peek();
			s.pop();
			String op2 = s.peek();
			s.pop();
			s.push("(" + op2 + exp.charAt(i) +
					op1 + ")");
		}
      
      sub.add(Character.toString(exp.charAt(i)));
      sub.add(getstringtostring(s));
      result.add(sub);
	}
   Mod mod = new Mod(result, s.peek());
	return mod;
}



static Mod pretopost(String pre_exp)
{
  ArrayList<ArrayList<String>> result = new ArrayList<>();
		Stack<String> s = new Stack<String>();

		// length of expression
		int length = pre_exp.length();

		// reading from right to left
		for (int i = length - 1; i >= 0; i--) 
		{
      ArrayList<String> sub = new ArrayList<>();
			// check if symbol is operator
			if (isOperator(pre_exp.charAt(i))) 
			{
				// pop two operands from stack
				String op1 = s.peek();
				s.pop();
				String op2 = s.peek();
				s.pop();

				// concat the operands and operator
				String temp = op1 + op2 + pre_exp.charAt(i);

				// Push String temp back to stack
				s.push(temp);
			}
			else {
				// push the operand to the stack
				s.push(pre_exp.charAt(i) + "");
			}


      sub.add(Character.toString(pre_exp.charAt(i)));
      sub.add(getstringtostring(s));
      result.add(sub);
		}

		Mod mod = new Mod(result, s.peek());
	return mod;
		
	}



   // Convert postfix to Prefix expression
	static Mod posttopre(String post_exp)
	{
      ArrayList<ArrayList<String>> result = new ArrayList<>();
		Stack<String> s = new Stack<String>();

		// length of expression
		int length = post_exp.length();

		// reading from right to left
		for (int i = 0; i < length; i++) {
         ArrayList<String> sub = new ArrayList<>();

			// check if symbol is operator
			if (isOperator(post_exp.charAt(i))) {

				// pop two operands from stack
				String op1 = s.peek();
				s.pop();
				String op2 = s.peek();
				s.pop();

				// concat the operands and operator
				String temp
					= post_exp.charAt(i) + op2 + op1;

				// Push String temp back to stack
				s.push(temp);
			}

			// if symbol is an operand
			else {

				// push the operand to the stack
				s.push(post_exp.charAt(i) + "");
			}


      sub.add(Character.toString(post_exp.charAt(i)));
      sub.add(getstringtostring(s));
      result.add(sub);
		}


      Mod mod = new Mod(result, s.peek());
	return mod;
		// concatenate all strings in stack and return the
		// answer
		/*String ans = "";
		for (String i : s)
			ans += i;
		return ans;*/
	}
	// Reverse the letters of the word


	// Function to convert infix to postfix expression
	static Mod intopost(String infix)
	{
      ArrayList<ArrayList<String>> arr = new ArrayList<>();
		 infix = '(' + infix + ')';

		int l = infix.length();
		Stack<Character> char_stack = new Stack<>();
		String output = "";

		for (int i = 0; i < l; i++) {
         ArrayList<String> sub = new ArrayList<>();

			if (Character.isLetterOrDigit(infix.charAt(i)))
				output += infix.charAt(i);

			else if (infix.charAt(i) == '(')
				char_stack.add('(');

			else if (infix.charAt(i) == ')') {
				while (char_stack.peek() != '(') {
					output += char_stack.peek();
					char_stack.pop();
				}
				char_stack.pop();
			}

			// Operator found
			else {
				if (isOperator(char_stack.peek())) {
					while (
						(getPriority(infix.charAt(i))
						< getPriority(char_stack.peek()))
						|| (getPriority(infix.charAt(i))
								<= getPriority(
									char_stack.peek())
							&& infix.charAt(i) == '^')) {
						output += char_stack.peek();
						char_stack.pop();
					}

					// Push current Operator on stack
					char_stack.add(infix.charAt(i));
				}
            else{
               char_stack.add(infix.charAt(i));
            }
			}

         sub.add(Character.toString(infix.charAt(i)));
         sub.add(getstring(char_stack));
         sub.add(output);
         arr.add(sub);

		}
		while (!char_stack.empty()) {
         if(char_stack.peek()=='('){
            output= "Invalid";
            break;
         }
			output += char_stack.pop();
		}

      Mod mod = new Mod(arr, output);
		return mod;
	}





 	static Mod intopre(String infix)
	{
      StringBuilder builder = new StringBuilder();
      builder.append(infix);
      builder.reverse();

		String infix2 = builder.toString();
      System.out.println(infix2);

		String infix3 = "";
      for(int i=0;i<infix2.length();i++){
         if(infix2.charAt(i)==')'){
            infix3+= "(";
         }
         else if(infix2.charAt(i)=='('){
            infix3+= ")";
         }
         else{
            infix3+= Character.toString(infix2.charAt(i));
      }
      }
      System.out.println(infix3);
		Mod mod = intopost(infix3);

		if(!mod.string.matches("Invalid")){
         builder = new StringBuilder();
         builder.append(mod.string);
         builder.reverse();
         mod.string = builder.toString();
      }
		return mod;
	}
             

    
    
    
}

class Model{
    String scan, stack,exp;
}
class Mod{
    ArrayList<ArrayList<String>> result;
    String string;
    Mod( ArrayList<ArrayList<String>> result, String string){
      this.result = result;
      this.string = string;
    }
}

