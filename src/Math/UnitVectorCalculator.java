package Math;

import raven.application.form.other.*;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.event.KeyEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Formatter;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raven
 */
public class UnitVectorCalculator extends javax.swing.JPanel {
 Formatter fm;
    public UnitVectorCalculator() {
        initComponents();
        unitpanel.setVisible(false);
       
       
       
        
       /* lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        x = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        y = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        z = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        unitpanel = new javax.swing.JPanel();
        result = new javax.swing.JLabel();
        valueofa = new javax.swing.JLabel();
        valueofa1 = new javax.swing.JLabel();
        result1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(806, 640));

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 590));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("= ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        x.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("j + ");

        y.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("i + ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("k");

        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });
        z.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                zKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("A");

        result.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        valueofa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valueofa.setText("|A| = ");

        valueofa1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        valueofa1.setText("Unit Vector of A = ");

        result1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout unitpanelLayout = new javax.swing.GroupLayout(unitpanel);
        unitpanel.setLayout(unitpanelLayout);
        unitpanelLayout.setHorizontalGroup(
            unitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitpanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(unitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(unitpanelLayout.createSequentialGroup()
                        .addComponent(valueofa1)
                        .addGap(18, 18, 18)
                        .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(unitpanelLayout.createSequentialGroup()
                        .addComponent(valueofa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))))
        );
        unitpanelLayout.setVerticalGroup(
            unitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitpanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(unitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valueofa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(unitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valueofa1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("      Unit Vector Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(unitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 156, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(unitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 25, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(x.getText().matches("") || y.getText().matches("") || z.getText().matches("")){
            JOptionPane.showMessageDialog(new UnitVectorCalculator(),"Enter all Value","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(isNumeric(x.getText())==false || isNumeric(y.getText())==false || isNumeric(z.getText())==false){
            JOptionPane.showMessageDialog(new UnitVectorCalculator(),"Invalid Input","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

        Double xx = Double.parseDouble(x.getText().toString());
        Double yy = Double.parseDouble(y.getText().toString());
        Double zz = Double.parseDouble(z.getText().toString());
        Double d = xx*xx + yy*yy + zz*zz;
        Double result = Math.sqrt(d);
        fm=new Formatter();
        fm.format("%.2f",result);
        this.result.setText(fm.toString());
        fm.close();
        
        String s = "";

        fm = new Formatter();
        fm.format("%.2f", xx/result);
        s += (fm.toString());
        //this.xx.setText(fm.toString());
        fm.close();

        if(yy<0){
            yy=0-yy;
            s+= " i  - ";
            //i.setText("i -");
        }
        else {
            s+= " i  + ";
            //i.setText("i +");
        }
        fm = new Formatter();
        fm.format("%.2f", yy/result);
        s+=fm.toString();
        //this.yy.setText(fm.toString());
        fm.close();

        if(zz<0){
            zz=0-zz;
            s+= " j  - ";
            //j.setText("j -");
        }else{
            s+=" j  + ";
            //j.setText("j +");
        }
        fm = new Formatter();
        fm.format("%.2f", zz/result);
        s+= fm.toString();
        //this.zz.setText(fm.toString());
        fm.close();
         this.result1.setText(s);
        unitpanel.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        x.setText("");
        y.setText("");
        z.setText("");
       unitpanel.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void xKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xKeyTyped
      char c = evt.getKeyChar();
        if(Character.isDigit(c) || c=='-'){
            
        }
        else {
            evt.consume();
        }
    }//GEN-LAST:event_xKeyTyped

    private void yKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yKeyTyped
 char c = evt.getKeyChar();
        if(Character.isDigit(c) || c=='-'){
            
        }
        else {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_yKeyTyped

    private void zKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c=='-'){
            
        }
        else {
            evt.consume();
        }
    }//GEN-LAST:event_zKeyTyped

    private void xKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
          y.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
          z.requestFocus();
    }//GEN-LAST:event_xKeyPressed

    private void yKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
          z.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
          x.requestFocus();
    }//GEN-LAST:event_yKeyPressed

    private void zKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
          x.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
          y.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
              if(x.getText().matches("") || y.getText().matches("") || z.getText().matches("")){
            JOptionPane.showMessageDialog(new UnitVectorCalculator(),"Enter all Value","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(isNumeric(x.getText())==false || isNumeric(y.getText())==false || isNumeric(z.getText())==false){
            JOptionPane.showMessageDialog(new UnitVectorCalculator(),"Invalid Input","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

        Double xx = Double.parseDouble(x.getText().toString());
        Double yy = Double.parseDouble(y.getText().toString());
        Double zz = Double.parseDouble(z.getText().toString());
        Double d = xx*xx + yy*yy + zz*zz;
        Double result = Math.sqrt(d);
        fm=new Formatter();
        fm.format("%.2f",result);
        this.result.setText(fm.toString());
        fm.close();
        
        String s = "";

        fm = new Formatter();
        fm.format("%.2f", xx/result);
        s += (fm.toString());
        //this.xx.setText(fm.toString());
        fm.close();

        if(yy<0){
            yy=0-yy;
            s+= " i  - ";
            //i.setText("i -");
        }
        else {
            s+= " i  + ";
            //i.setText("i +");
        }
        fm = new Formatter();
        fm.format("%.2f", yy/result);
        s+=fm.toString();
        //this.yy.setText(fm.toString());
        fm.close();

        if(zz<0){
            zz=0-zz;
            s+= " j  - ";
            //j.setText("j -");
        }else{
            s+=" j  + ";
            //j.setText("j +");
        }
        fm = new Formatter();
        fm.format("%.2f", zz/result);
        s+= fm.toString();
        //this.zz.setText(fm.toString());
        fm.close();
         this.result1.setText(s);
        unitpanel.setVisible(true);
       }
    }//GEN-LAST:event_zKeyPressed

    
    








    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel result;
    private javax.swing.JLabel result1;
    private javax.swing.JPanel unitpanel;
    private javax.swing.JLabel valueofa;
    private javax.swing.JLabel valueofa1;
    private javax.swing.JTextField x;
    private javax.swing.JTextField y;
    private javax.swing.JTextField z;
    // End of variables declaration//GEN-END:variables
}

