package Math;

import DSA.*;
import static Math.MagnitudeCalculator.isNumeric;
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
import jdk.vm.ci.riscv64.RISCV64;

/**
 *
 * @author Raven
 */
public class ScalarTripleProduct extends javax.swing.JPanel {
 Formatter fm;
    public ScalarTripleProduct() {
        initComponents();
        panel.setVisible(false);
        
       
        
       /* lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        x = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        y = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        z = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        z1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        y1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        y2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        z2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(806, 640));

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 590));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("A =");
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

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("i + ");

        y.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("j + ");

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

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("k");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("k");

        z1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z1ActionPerformed(evt);
            }
        });
        z1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                z1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                z1KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("j + ");

        y1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                y1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                y1KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("i + ");

        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });
        x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                x1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x1KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("B = ");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("C = ");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ActionPerformed(evt);
            }
        });
        x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                x2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x2KeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("i + ");

        y2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                y2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                y2KeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("j + ");

        z2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                z2ActionPerformed(evt);
            }
        });
        z2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                z2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                z2KeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("k");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("A . ( B × C ) = ");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        result.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        result.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        result.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("      Scalar Triple Product Calculator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jLabel5)
                        .addContainerGap())))
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(x.getText().matches("") || y.getText().matches("") || z.getText().matches("") || x1.getText().matches("") || y1.getText().matches("") || z1.getText().matches("") || x2.getText().matches("") || y2.getText().matches("") || z2.getText().matches("")){
            JOptionPane.showMessageDialog(new ScalarTripleProduct(),"Enter all Value","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(isNumeric(x.getText())==false || isNumeric(y.getText())==false || isNumeric(z.getText())==false || isNumeric(x1.getText())==false || isNumeric(y1.getText())==false || isNumeric(z1.getText())==false || isNumeric(x2.getText())==false || isNumeric(y2.getText())==false || isNumeric(z2.getText())==false){
            JOptionPane.showMessageDialog(new ScalarTripleProduct(),"Invalid Input","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

        Integer a = Integer.parseInt(x.getText().toString());
        Integer b = Integer.parseInt(y.getText().toString());
        Integer c = Integer.parseInt(z.getText().toString());
        Integer aa = Integer.parseInt(x1.getText().toString());
        Integer bb = Integer.parseInt(y1.getText().toString());
        Integer cc = Integer.parseInt(z1.getText().toString());
        Integer aaa = Integer.parseInt(x2.getText().toString());
        Integer bbb = Integer.parseInt(y2.getText().toString());
        Integer ccc = Integer.parseInt(z2.getText().toString());

        Integer p = a*(bb*ccc - bbb*cc);
        Integer q = b*(aa*ccc - aaa*cc);
        Integer r = c*(aa*bbb - aaa*bb);

        Integer d = p-q+r;
        result.setText(d + "");
        panel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        x.setText("");
        y.setText("");
        z.setText("");
        x1.setText("");
        y1.setText("");
        z1.setText("");
        x2.setText("");
        y2.setText("");
        z2.setText("");
         panel.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xActionPerformed

    private void xKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        y.requestFocus();

    }//GEN-LAST:event_xKeyPressed

    private void xKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c=='-'){

        }
        else {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_xKeyTyped

    private void yKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        z.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        x.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_yKeyPressed

    private void yKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c=='-'){

        }
        else {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_yKeyTyped

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zActionPerformed

    private void zKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        x1.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        y.requestFocus();
    }//GEN-LAST:event_zKeyPressed

    private void zKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zKeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c=='-'){

        }
        else {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_zKeyTyped

    private void z1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z1ActionPerformed

    private void z1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z1KeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        y1.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
            x2.requestFocus();
        }

    }//GEN-LAST:event_z1KeyPressed

    private void z1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z1KeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c=='-'){

        }
        else {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_z1KeyTyped

    private void y1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        z1.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        x1.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_y1KeyPressed

    private void y1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y1KeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c=='-'){

        }
        else {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_y1KeyTyped

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    private void x1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        y1.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        z.requestFocus();
    }//GEN-LAST:event_x1KeyPressed

    private void x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x1KeyTyped
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c=='-'){

        }
        else {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_x1KeyTyped

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x2ActionPerformed

    private void x2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x2KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        y2.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        z1.requestFocus();
    }//GEN-LAST:event_x2KeyPressed

    private void x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_x2KeyTyped

    private void y2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y2KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        z2.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        x2.requestFocus();
    }//GEN-LAST:event_y2KeyPressed

    private void y2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_y2KeyTyped

    private void z2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_z2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_z2ActionPerformed

    private void z2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z2KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(x.getText().matches("") || y.getText().matches("") || z.getText().matches("") || x1.getText().matches("") || y1.getText().matches("") || z1.getText().matches("") || x2.getText().matches("") || y2.getText().matches("") || z2.getText().matches("")){
            JOptionPane.showMessageDialog(new ScalarTripleProduct(),"Enter all Value","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(isNumeric(x.getText())==false || isNumeric(y.getText())==false || isNumeric(z.getText())==false || isNumeric(x1.getText())==false || isNumeric(y1.getText())==false || isNumeric(z1.getText())==false || isNumeric(x2.getText())==false || isNumeric(y2.getText())==false || isNumeric(z2.getText())==false){
            JOptionPane.showMessageDialog(new ScalarTripleProduct(),"Invalid Input","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

        Integer a = Integer.parseInt(x.getText().toString());
        Integer b = Integer.parseInt(y.getText().toString());
        Integer c = Integer.parseInt(z.getText().toString());
        Integer aa = Integer.parseInt(x1.getText().toString());
        Integer bb = Integer.parseInt(y1.getText().toString());
        Integer cc = Integer.parseInt(z1.getText().toString());
        Integer aaa = Integer.parseInt(x2.getText().toString());
        Integer bbb = Integer.parseInt(y2.getText().toString());
        Integer ccc = Integer.parseInt(z2.getText().toString());

        Integer p = a*(bb*ccc - bbb*cc);
        Integer q = b*(aa*ccc - aaa*cc);
        Integer r = c*(aa*bbb - aaa*bb);

        Integer d = p-q+r;
        result.setText(d + "");
        panel.setVisible(true);
       }
        
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        y2.requestFocus();
    }//GEN-LAST:event_z2KeyPressed

    private void z2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_z2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_z2KeyTyped

    
    










    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel result;
    private javax.swing.JTextField x;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField y;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField z;
    private javax.swing.JTextField z1;
    private javax.swing.JTextField z2;
    // End of variables declaration//GEN-END:variables
}

