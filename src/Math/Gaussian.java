package Math;

import raven.application.form.other.*;
import com.formdev.flatlaf.FlatClientProperties;
import raven.toast.Notifications;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raven
 */
public class Gaussian extends javax.swing.JPanel {

    public Gaussian() {
        initComponents();
        reset();
   /*  tx1.setText("1");
     tx2.setText("1");
     tx3.setText("1");
     td1.setText("5");
     ty1.setText("1");
     ty2.setText("1");
     ty3.setText("-4");
     td2.setText("10");
     tz1.setText("-4");
     tz2.setText("1");
     tz3.setText("1");
     td3.setText("0");*/
        panel1.setVisible(false);
       /* lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tx1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tx2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tx3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        td1 = new javax.swing.JTextField();
        ty1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ty2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ty3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        td2 = new javax.swing.JTextField();
        tz1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tz2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tz3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        td3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainpanel = new javax.swing.JPanel();
        l111 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        p1x1 = new javax.swing.JLabel();
        p1y1 = new javax.swing.JLabel();
        p1z1 = new javax.swing.JLabel();
        p1x2 = new javax.swing.JLabel();
        p1y2 = new javax.swing.JLabel();
        p1z2 = new javax.swing.JLabel();
        p1x3 = new javax.swing.JLabel();
        p1y3 = new javax.swing.JLabel();
        p1z3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        p1d1 = new javax.swing.JLabel();
        p1d2 = new javax.swing.JLabel();
        p1d3 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        p2x1 = new javax.swing.JLabel();
        p2y1 = new javax.swing.JLabel();
        p2z1 = new javax.swing.JLabel();
        p2x2 = new javax.swing.JLabel();
        p2y2 = new javax.swing.JLabel();
        p2z2 = new javax.swing.JLabel();
        p2x3 = new javax.swing.JLabel();
        p2y3 = new javax.swing.JLabel();
        p2z3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        p2d1 = new javax.swing.JLabel();
        p2d2 = new javax.swing.JLabel();
        p2d3 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        p3x1 = new javax.swing.JLabel();
        p3y1 = new javax.swing.JLabel();
        p3z1 = new javax.swing.JLabel();
        p3x2 = new javax.swing.JLabel();
        p3y2 = new javax.swing.JLabel();
        p3z2 = new javax.swing.JLabel();
        p3x3 = new javax.swing.JLabel();
        p3y3 = new javax.swing.JLabel();
        p3z3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        p3d1 = new javax.swing.JLabel();
        p3d2 = new javax.swing.JLabel();
        p3d3 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        p4y1 = new javax.swing.JLabel();
        p4x1 = new javax.swing.JLabel();
        p4z1 = new javax.swing.JLabel();
        p4x2 = new javax.swing.JLabel();
        p4y2 = new javax.swing.JLabel();
        p4z2 = new javax.swing.JLabel();
        p4x3 = new javax.swing.JLabel();
        p4y3 = new javax.swing.JLabel();
        p4z3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        p4d1 = new javax.swing.JLabel();
        p4d2 = new javax.swing.JLabel();
        p4d3 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        p5x1 = new javax.swing.JLabel();
        p5y1 = new javax.swing.JLabel();
        p5z1 = new javax.swing.JLabel();
        p5x2 = new javax.swing.JLabel();
        p5y2 = new javax.swing.JLabel();
        p5z2 = new javax.swing.JLabel();
        p5x3 = new javax.swing.JLabel();
        p5y3 = new javax.swing.JLabel();
        p5z3 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        p5d1 = new javax.swing.JLabel();
        p5d2 = new javax.swing.JLabel();
        p5d3 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        p6x1 = new javax.swing.JLabel();
        p6y1 = new javax.swing.JLabel();
        p6z1 = new javax.swing.JLabel();
        p6x2 = new javax.swing.JLabel();
        p6y2 = new javax.swing.JLabel();
        p6z2 = new javax.swing.JLabel();
        p6x3 = new javax.swing.JLabel();
        p6y3 = new javax.swing.JLabel();
        p6z3 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        p6d1 = new javax.swing.JLabel();
        p6d2 = new javax.swing.JLabel();
        p6d3 = new javax.swing.JLabel();
        panel7 = new javax.swing.JPanel();
        p7x1 = new javax.swing.JLabel();
        p7y1 = new javax.swing.JLabel();
        p7z1 = new javax.swing.JLabel();
        p7x2 = new javax.swing.JLabel();
        p7y2 = new javax.swing.JLabel();
        p7z2 = new javax.swing.JLabel();
        p7x3 = new javax.swing.JLabel();
        p7y3 = new javax.swing.JLabel();
        p7z3 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        p7d1 = new javax.swing.JLabel();
        p7d2 = new javax.swing.JLabel();
        p7d3 = new javax.swing.JLabel();
        p2label = new javax.swing.JLabel();
        p4label = new javax.swing.JLabel();
        p3label = new javax.swing.JLabel();
        p5label = new javax.swing.JLabel();
        p6label = new javax.swing.JLabel();
        p7label = new javax.swing.JLabel();
        p1label = new javax.swing.JLabel();
        l222 = new javax.swing.JLabel();
        lone = new javax.swing.JLabel();
        ltwo = new javax.swing.JLabel();
        lthree = new javax.swing.JLabel();
        lx = new javax.swing.JLabel();
        lz = new javax.swing.JLabel();
        ly = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("    Gaussian Elimination Calculator");

        tx1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx1KeyTyped(evt);
            }
        });

        jLabel2.setText("X1 +");

        tx2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx2KeyTyped(evt);
            }
        });

        jLabel3.setText("Y1 +");

        tx3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tx3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx3KeyTyped(evt);
            }
        });

        jLabel4.setText("Z1 =");

        td1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        td1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                td1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                td1KeyTyped(evt);
            }
        });

        ty1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ty1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ty1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ty1KeyTyped(evt);
            }
        });

        jLabel5.setText("X2 +");

        ty2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ty2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ty2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ty2KeyTyped(evt);
            }
        });

        jLabel6.setText("Y2 +");

        ty3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ty3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ty3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ty3KeyTyped(evt);
            }
        });

        jLabel7.setText("Z2 =");

        td2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        td2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                td2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                td2KeyTyped(evt);
            }
        });

        tz1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tz1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tz1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tz1KeyTyped(evt);
            }
        });

        jLabel8.setText("X3 +");

        tz2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tz2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tz2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tz2KeyTyped(evt);
            }
        });

        jLabel9.setText("Y3 +");

        tz3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tz3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tz3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tz3KeyTyped(evt);
            }
        });

        jLabel10.setText("Z3 =");

        td3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        td3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                td3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                td3KeyTyped(evt);
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
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        mainpanel.setPreferredSize(new java.awt.Dimension(1500, 1500));

        l111.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l111.setText("The Augmented matrix is,");

        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p1x1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1x1.setPreferredSize(new java.awt.Dimension(101, 40));

        p1y1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1y1.setPreferredSize(new java.awt.Dimension(101, 40));

        p1z1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1z1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1z1.setPreferredSize(new java.awt.Dimension(101, 40));

        p1x2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1x2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1x2.setPreferredSize(new java.awt.Dimension(101, 40));

        p1y2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1y2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1y2.setPreferredSize(new java.awt.Dimension(101, 40));

        p1z2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1z2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1z2.setPreferredSize(new java.awt.Dimension(101, 40));

        p1x3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1x3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1x3.setPreferredSize(new java.awt.Dimension(101, 40));

        p1y3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1y3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1y3.setPreferredSize(new java.awt.Dimension(101, 40));

        p1z3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1z3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1z3.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p1d1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1d1.setPreferredSize(new java.awt.Dimension(101, 40));

        p1d2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1d2.setPreferredSize(new java.awt.Dimension(101, 40));

        p1d3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1d3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1z1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1z2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1z3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p1d3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1d2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p1d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(p1d1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1d2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1d3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(p1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p1y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p1z3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(p1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p1y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p1z2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(p1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p1y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p1z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1)))
                .addGap(101, 101, 101))
        );

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p2x1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2x1.setPreferredSize(new java.awt.Dimension(101, 40));

        p2y1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2y1.setPreferredSize(new java.awt.Dimension(101, 40));

        p2z1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2z1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2z1.setPreferredSize(new java.awt.Dimension(101, 40));

        p2x2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2x2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2x2.setPreferredSize(new java.awt.Dimension(101, 40));

        p2y2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2y2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2y2.setPreferredSize(new java.awt.Dimension(101, 40));

        p2z2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2z2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2z2.setPreferredSize(new java.awt.Dimension(101, 40));

        p2x3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2x3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2x3.setPreferredSize(new java.awt.Dimension(101, 40));

        p2y3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2y3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2y3.setPreferredSize(new java.awt.Dimension(101, 40));

        p2z3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2z3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2z3.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p2d1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2d1.setPreferredSize(new java.awt.Dimension(101, 40));

        p2d2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2d2.setPreferredSize(new java.awt.Dimension(101, 40));

        p2d3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2d3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2z1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2z2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2z3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2d1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2d2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2d3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(p2d1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2d2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2d3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(p2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p2y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p2z3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(p2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2z2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(p2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p3x1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3x1.setPreferredSize(new java.awt.Dimension(101, 40));

        p3y1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3y1.setPreferredSize(new java.awt.Dimension(101, 40));

        p3z1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3z1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3z1.setPreferredSize(new java.awt.Dimension(101, 40));

        p3x2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3x2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3x2.setPreferredSize(new java.awt.Dimension(101, 40));

        p3y2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3y2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3y2.setPreferredSize(new java.awt.Dimension(101, 40));

        p3z2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3z2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3z2.setPreferredSize(new java.awt.Dimension(101, 40));

        p3x3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3x3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3x3.setPreferredSize(new java.awt.Dimension(101, 40));

        p3y3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3y3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3y3.setPreferredSize(new java.awt.Dimension(101, 40));

        p3z3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3z3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3z3.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p3d1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3d1.setPreferredSize(new java.awt.Dimension(101, 40));

        p3d2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3d2.setPreferredSize(new java.awt.Dimension(101, 40));

        p3d3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3d3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3z1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3z2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3z3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3d1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3d2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3d3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(p3d1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p3d2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p3d3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addComponent(p3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p3y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p3z3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addComponent(p3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p3y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p3z2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addComponent(p3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p3y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p3z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p4y1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4y1.setPreferredSize(new java.awt.Dimension(101, 40));

        p4x1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4x1.setPreferredSize(new java.awt.Dimension(101, 40));

        p4z1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4z1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4z1.setPreferredSize(new java.awt.Dimension(101, 40));

        p4x2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4x2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4x2.setPreferredSize(new java.awt.Dimension(101, 40));

        p4y2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4y2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4y2.setPreferredSize(new java.awt.Dimension(101, 40));

        p4z2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4z2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4z2.setPreferredSize(new java.awt.Dimension(101, 40));

        p4x3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4x3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4x3.setPreferredSize(new java.awt.Dimension(101, 40));

        p4y3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4y3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4y3.setPreferredSize(new java.awt.Dimension(101, 40));

        p4z3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4z3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4z3.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p4d1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4d1.setPreferredSize(new java.awt.Dimension(101, 40));

        p4d2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4d2.setPreferredSize(new java.awt.Dimension(101, 40));

        p4d3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4d3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4z1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4z2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4z3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4d1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4d2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4d3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(p4d1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p4d2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p4d3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel4Layout.createSequentialGroup()
                            .addComponent(p4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p4y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p4z3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(p4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p4y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p4z2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(p4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p4y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p4z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p5x1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5x1.setPreferredSize(new java.awt.Dimension(101, 40));

        p5y1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5y1.setPreferredSize(new java.awt.Dimension(101, 40));

        p5z1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5z1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5z1.setPreferredSize(new java.awt.Dimension(101, 40));

        p5x2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5x2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5x2.setPreferredSize(new java.awt.Dimension(101, 40));

        p5y2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5y2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5y2.setPreferredSize(new java.awt.Dimension(101, 40));

        p5z2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5z2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5z2.setPreferredSize(new java.awt.Dimension(101, 40));

        p5x3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5x3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5x3.setPreferredSize(new java.awt.Dimension(101, 40));

        p5y3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5y3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5y3.setPreferredSize(new java.awt.Dimension(101, 40));

        p5z3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5z3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5z3.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p5d1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5d1.setPreferredSize(new java.awt.Dimension(101, 40));

        p5d2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5d2.setPreferredSize(new java.awt.Dimension(101, 40));

        p5d3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5d3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5z1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5z2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5z3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p5d1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5d2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5d3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(p5d1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p5d2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p5d3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator8)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel5Layout.createSequentialGroup()
                            .addComponent(p5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p5y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p5z3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addComponent(p5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p5y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p5z2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addComponent(p5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p5y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p5z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p6x1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6x1.setPreferredSize(new java.awt.Dimension(101, 40));

        p6y1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6y1.setPreferredSize(new java.awt.Dimension(101, 40));

        p6z1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6z1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6z1.setPreferredSize(new java.awt.Dimension(101, 40));

        p6x2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6x2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6x2.setPreferredSize(new java.awt.Dimension(101, 40));

        p6y2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6y2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6y2.setPreferredSize(new java.awt.Dimension(101, 40));

        p6z2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6z2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6z2.setPreferredSize(new java.awt.Dimension(101, 40));

        p6x3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6x3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6x3.setPreferredSize(new java.awt.Dimension(101, 40));

        p6y3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6y3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6y3.setPreferredSize(new java.awt.Dimension(101, 40));

        p6z3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6z3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6z3.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p6d1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6d1.setPreferredSize(new java.awt.Dimension(101, 40));

        p6d2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6d2.setPreferredSize(new java.awt.Dimension(101, 40));

        p6d3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6d3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p6x1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6z1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p6x2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6z2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p6x3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6z3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p6d1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6d2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6d3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(p6d1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p6d2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p6d3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator9)
                            .addGroup(panel6Layout.createSequentialGroup()
                                .addComponent(p6x3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p6y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p6z3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addComponent(p6x2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p6y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p6z2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addComponent(p6x1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p6y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p6z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p7x1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7x1.setPreferredSize(new java.awt.Dimension(101, 40));

        p7y1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7y1.setPreferredSize(new java.awt.Dimension(101, 40));

        p7z1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7z1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7z1.setPreferredSize(new java.awt.Dimension(101, 40));

        p7x2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7x2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7x2.setPreferredSize(new java.awt.Dimension(101, 40));

        p7y2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7y2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7y2.setPreferredSize(new java.awt.Dimension(101, 40));

        p7z2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7z2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7z2.setPreferredSize(new java.awt.Dimension(101, 40));

        p7x3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7x3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7x3.setPreferredSize(new java.awt.Dimension(101, 40));

        p7y3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7y3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7y3.setPreferredSize(new java.awt.Dimension(101, 40));

        p7z3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7z3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7z3.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p7d1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7d1.setPreferredSize(new java.awt.Dimension(101, 40));

        p7d2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7d2.setPreferredSize(new java.awt.Dimension(101, 40));

        p7d3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7d3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p7x1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7y1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7z1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p7x2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7y2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7z2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p7x3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7y3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7z3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p7d1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7d2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7d3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addComponent(p7d1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p7d2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p7d3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel7Layout.createSequentialGroup()
                                .addComponent(p7x3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p7y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p7z3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addComponent(p7x2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p7y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p7z2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addComponent(p7x1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p7y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p7z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p2label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        p2label.setText("jLabel12");

        p4label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        p4label.setText("jLabel12");

        p3label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        p3label.setText("jLabel12");

        p5label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        p5label.setText("jLabel12");

        p6label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        p6label.setText("jLabel12");

        p7label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        p7label.setText("jLabel12");

        l222.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l222.setText("Corresponding System Equation is,");

        lone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        ltwo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lthree.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lx.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        ly.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainpanelLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(l111, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainpanelLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(panel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(p1label, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(p2label, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4label, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5label, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p7label, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6label, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(l222, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ltwo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lone, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lthree, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lx, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ly, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lz, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGap(472, 472, 472))
            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainpanelLayout.createSequentialGroup()
                    .addGap(550, 550, 550)
                    .addComponent(p3label, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(697, Short.MAX_VALUE)))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(p1label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addComponent(l111, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addComponent(l222, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ltwo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lthree, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ly, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lz, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(p2label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(p4label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(p5label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(p6label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(p7label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainpanelLayout.createSequentialGroup()
                    .addGap(544, 544, 544)
                    .addComponent(p3label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(913, Short.MAX_VALUE)))
        );

        //augmentpanel.setLayout(new GridLayout(3,4));

        jScrollPane1.setViewportView(mainpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ty1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ty2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ty3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(td2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tx1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tx2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tx3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(td1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tz1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tz2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tz3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(td3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tx1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tx3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tx2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                                    .addComponent(td1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ty1)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ty2)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ty3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(td2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tz1)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tz2)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tz3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(td3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1200, 1200, 1200))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tx1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx1KeyTyped
      char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }
    }//GEN-LAST:event_tx1KeyTyped

    private void tx2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx2KeyTyped
     char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }
    }//GEN-LAST:event_tx2KeyTyped

    private void tx3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx3KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_tx3KeyTyped

    private void td1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_td1KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_td1KeyTyped

    private void ty1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ty1KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_ty1KeyTyped

    private void ty2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ty2KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_ty2KeyTyped

    private void ty3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ty3KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_ty3KeyTyped

    private void td2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_td2KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_td2KeyTyped

    private void tz1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tz1KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_tz1KeyTyped

    private void tz2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tz2KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_tz2KeyTyped

    private void tz3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tz3KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_tz3KeyTyped

    private void td3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_td3KeyTyped
 char c = evt.getKeyChar();
      if(Character.isDigit(c) || c=='-'){
          
      }
      else{
          evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_td3KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(tx1.getText().toString().matches("") || tx2.getText().toString().matches("") || tx3.getText().toString().matches("") || td1.getText().toString().matches("") || ty1.getText().toString().matches("") || ty2.getText().toString().matches("") || ty3.getText().toString().matches("") || td2.getText().toString().matches("") || tz1.getText().toString().matches("") || tz2.getText().toString().matches("") || tz3.getText().toString().matches("") || td3.getText().toString().matches("") ){
           JOptionPane.showMessageDialog(new Gaussian(), "Enter all value", "Warning", JOptionPane.ERROR_MESSAGE);
           return;
       }
       matrix mat1 = new matrix(panel1, p1x1, p1x2, p1x3, p1d1, p1y1, p1y2, p1y3, p1d2, p1z1, p1z2, p1z3, p1d3, p1label);
       matrix mat2 = new matrix(panel2, p2x1, p2x2, p2x3, p2d1, p2y1, p2y2, p2y3, p2d2, p2z1, p2z2, p2z3, p2d3, p2label);
       matrix mat3 = new matrix(panel3, p3x1, p3x2, p3x3, p3d1, p3y1, p3y2, p3y3, p3d2, p3z1, p3z2, p3z3, p3d3, p3label);
       matrix mat4 = new matrix(panel4, p4x1, p4x2, p4x3, p4d1, p4y1, p4y2, p4y3, p4d2, p4z1, p4z2, p4z3, p4d3, p4label);
       matrix mat5 = new matrix(panel5, p5x1, p5x2, p5x3, p5d1, p5y1, p5y2, p5y3, p5d2, p5z1, p5z2, p5z3, p5d3, p5label);
       matrix mat6 = new matrix(panel6, p6x1, p6x2, p6x3, p6d1, p6y1, p6y2, p6y3, p6d2, p6z1, p6z2, p6z3, p6d3, p6label);
       matrix mat7 = new matrix(panel7, p7x1, p7x2, p7x3, p7d1, p7y1, p7y2, p7y3, p7d2, p7z1, p7z2, p7z3, p7d3, p7label);
       ArrayList<matrix> arr = new ArrayList<>();
       arr.add(mat1);
       arr.add(mat2);
       arr.add(mat3);
       arr.add(mat4);
       arr.add(mat5);
       arr.add(mat6);
       arr.add(mat7);
       int counter=1;
       Double x1,x2,x3,y1,y2,y3,z1,z2,z3,d1,d2,d3;
        try {
            x1 = Double.parseDouble(tx1.getText().toString());
            x2 = Double.parseDouble(tx2.getText().toString());
            x3 = Double.parseDouble(tx3.getText().toString());
            d1 = Double.parseDouble(td1.getText().toString());
            y1 = Double.parseDouble(ty1.getText().toString());
            y2 = Double.parseDouble(ty2.getText().toString());
            y3 = Double.parseDouble(ty3.getText().toString());
            d2 = Double.parseDouble(td2.getText().toString());
            z1 = Double.parseDouble(tz1.getText().toString());
            z2 = Double.parseDouble(tz2.getText().toString());
            z3 = Double.parseDouble(tz3.getText().toString());
            d3 = Double.parseDouble(td3.getText().toString());
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(new Gaussian(), "Invalid Input.", "Warning", JOptionPane.ERROR_MESSAGE);
           return;
        }
        
        
        double[][] a = new double[3][4];
        a[0][0]=x1;
         a[0][1]=x2;
         a[0][2]=x3;
        a[0][3]=d1;
         a[1][0]=y1;
         a[1][1]=y2;
         a[1][2]=y3;
         a[1][3]=d2;
         a[2][0]=z1;
         a[2][1]=z2;
          a[2][2]=z3;
         a[2][3]=d3;
         
        
         
         
         
         
         mainpanel.setVisible(true);
         mat1.setvalue(a,"");
         
         
         if(a[0][0]==0){
             swap(a, 0, 2);
             swap(a, 0, 1);
         }
         
          if (a[0][0] != 1) {
             
            //System.out.println("R1' = R1/" + a[0][0]);
            String tt = "(";
            if(intcheck(a[0][0])==true){
                tt += Integer.toString((int)a[0][0]);
            }
            else{
                tt += getirrational(a[0][0]);
            }
            tt+=")";
            
            fun1(a, 0, a[0][0]);
            arr.get(counter).setvalue(a, "R1' = R1/"+tt);
            counter++;
           
        }
          
          if (a[1][0] != 0) {
            //System.out.println("R2' = R2 - R1*" + a[1][0]);
             String tt = "(";
            if(intcheck(a[1][0])==true){
                tt += Integer.toString((int)a[1][0]);
            }
            else{
                tt += getirrational(a[1][0]);
            }
            tt+=")";
            fun2(a, 0, 1, a[1][0]);
            arr.get(counter).setvalue(a, "R2' = R2 - R1*"+ tt);
            counter++;
            
        } 
         
          if (a[2][0] != 0) {
            //System.out.println("R3' = R3 - R1*" + a[2][0]);
            String tt = "(";
            if(intcheck(a[2][0])==true){
                tt += Integer.toString((int)a[2][0]);
            }
            else{
                tt += getirrational(a[2][0]);
            }
            tt+=")";
            fun2(a, 0, 2, a[2][0]);
           
             arr.get(counter).setvalue(a, "R3' = R3 - R1*"+tt);
            counter++;
            
        }
          print(a);
          if(a[1][1]==0){
              swap(a, 1, 2);
          }
           print(a);
           System.out.println(a[1][1]);
          if (a[1][1] != 1) {
            //System.out.println("R2' = R2/" + a[1][1]);
             String tt = "(";
            if(intcheck(a[1][1])==true){
                tt += Integer.toString((int)a[1][1]);
            }
            else{
                tt += getirrational(a[1][1]);
            }
            tt+=")";
            fun1(a, 1, a[1][1]);
            arr.get(counter).setvalue(a, "R2' = R2/"+tt);
            counter++;
            
        }
          
           if (a[2][1] != 0) {
           // System.out.println("R3' = R3 - R2*" + a[2][1]);
            String tt = "(";
            if(intcheck(a[2][1])==true){
                tt += Integer.toString((int)a[2][1]);
            }
            else{
                tt += getirrational(a[2][1]);
            }
            tt+=")";
            fun2(a, 1, 2, a[2][1]);
             arr.get(counter).setvalue(a, "R3' = R3 - R2*"+tt);
            counter++;
           
        }
           
           if (a[2][2] != 1) {
            //System.out.println("R3' = R3/" + a[2][2]);
             String tt = "(";
            if(intcheck(a[2][2])==true){
                tt += Integer.toString((int)a[2][2]);
            }
            else{
                tt += getirrational(a[2][2]);
            }
            tt+=")";
            fun1(a, 2, a[2][2]);
            arr.get(counter).setvalue(a, "R3' = R3/"+tt);
            counter++;
            
        }
           
        double x, y, z;
        z = a[2][3];
        y = a[1][3] - a[1][2] * z;
        x = a[0][3] - a[0][1] * y - a[0][2] * z;
        if(intcheck(x)==true){
            int d = (int)x;
            lx.setText("X = " + Integer.toString(d));
        }
        else{
            String t = getirrational(x);
            lx.setText("X = "+t);
        }
        
        
        if(intcheck(y)==true){
            int d = (int)y;
            ly.setText("Y = " + Integer.toString(d));
        }
        else{
            String t = getirrational(y);
            ly.setText("Y = "+t);
        }
        
        
        if(intcheck(z)==true){
            int d = (int)z;
            lz.setText("Z = " + Integer.toString(d));
        }
        else{
            String t = getirrational(z);
            lz.setText("Z = "+t);
        }
        
        
        
       
           
           String one="";
           
           //for x
           if(intcheck(a[0][0])==true){
               int d = (int)a[0][0];
               if(d<0){
                   if(d==-1){
                       one+= "-"+"X ";
                   }
                   else {
                       one+= "-" + Integer.toString(0-d)+ "X ";
                    }
               }
               else{
                   if(d==1){
                       one+= "X ";
                   }
                   else{
                       one+= Integer.toString(d) + "X ";
                   }
               }
           }
           else{
               double d = a[0][0];
               if(d<0){
                   d=0-d;
                   String t = getirrational(d);
                   one+= "-" + t + "X ";
               }
               else{
                   String t = getirrational(d);
                   one+=t + "X ";
               }
               
           }
           //end x
           
           
           
           
           
           //for y1
           if(intcheck(a[0][1])==true){
               int d = (int)a[0][1];
               if(d<0){
                   if(d==-1){
                       one+= "- "+"Y ";
                   }
                   else {
                       one+= "- " + Integer.toString(0-d)+ "Y ";
                    }
               }
               else{
                   if(d==1){
                       one+= "+ " + "Y ";
                   }
                   else{
                       one+="+ "+ Integer.toString(d) + "Y ";
                   }
               }
           }
           else{
               double d = a[0][1];
               if(d<0){
                   d=0-d;
                   String t = getirrational(d);
                   one+= "- " + t + "Y ";
               }
               else{
                   String t = getirrational(d);
                   one+= "+ "+t + "Y ";
               }
               
           }
           //end y1
           
           
           
           
           //for z1
           if(intcheck(a[0][2])==true){
               int d = (int)a[0][2];
               if(d<0){
                   if(d==-1){
                       one+= "- "+"Z ";
                   }
                   else {
                       one+= "- " + Integer.toString(0-d)+ "Z ";
                    }
               }
               else{
                   if(d==1){
                       one+= "+ " + "Z ";
                   }
                   else{
                       one+="+ "+ Integer.toString(d) + "Z ";
                   }
               }
           }
           else{
               double d = a[0][2];
               if(d<0){
                   d=0-d;
                   String t = getirrational(d);
                   one+= "- " + t + "Z ";
               }
               else{
                   String t = getirrational(d);
                   one+= "+ "+t + "Z ";
               }
               
           }
           //end z1
         
         
           //for d1
           one+= " = ";
           if(intcheck(a[0][3])==true){
               int d = (int)a[0][3];
               one+= Integer.toString(d);
           }
           else{
               String t = getirrational(a[0][3]);
               one+=t;
           }
           //end d1
           lone.setText(one);
           
           
           
           
           
           
           
           String two="";
           
           //for y2
           if(intcheck(a[1][1])==true){
               int d = (int)a[1][1];
               if(d<0){
                   if(d==-1){
                       two+= "-"+"Y ";
                   }
                   else {
                       two+= "-" + Integer.toString(0-d)+ "Y ";
                    }
               }
               else{
                   if(d==1){
                       two+= "Y ";
                   }
                   else{
                       two+= Integer.toString(d) + "Y ";
                   }
               }
           }
           else{
               double d = a[1][1];
               if(d<0){
                   d=0-d;
                   String t = getirrational(d);
                   two+= "-" + t + "Y ";
               }
               else{
                   String t = getirrational(d);
                   two+=t + "Y ";
               }
               
           }
           //end y2
           
           
           
           
           
           //for z2
           if(intcheck(a[1][2])==true){
               int d = (int)a[1][2];
               if(d<0){
                   if(d==-1){
                       two+= "- "+"Z ";
                   }
                   else {
                       two+= "- " + Integer.toString(0-d)+ "Z ";
                    }
               }
               else{
                   if(d==1){
                       two+= "+ " + "Z ";
                   }
                   else{
                       two+="+ "+ Integer.toString(d) + "Z ";
                   }
               }
           }
           else{
               double d = a[1][2];
               if(d<0){
                   d=0-d;
                   String t = getirrational(d);
                   two+= "- " + t + "Z ";
               }
               else{
                   String t = getirrational(d);
                   two+= "+ "+t + "Z ";
               }
               
           }
           //end z2
          
         
           //for d2
           two+= " = ";
           if(intcheck(a[1][3])==true){
               int d = (int)a[1][3];
               two+= Integer.toString(d);
           }
           else{
               String t = getirrational(a[1][3]);
               two+=t;
           }
           //end d2
           ltwo.setText(two);
           
           
           
           
           
           
           String three="";
           
           //for z3
           if(intcheck(a[2][2])==true){
               int d = (int)a[2][2];
               if(d<0){
                   if(d==-1){
                       three+= "-"+"Z ";
                   }
                   else {
                       three+= "-" + Integer.toString(0-d)+ "Z ";
                    }
               }
               else{
                   if(d==1){
                       three+= "Z ";
                   }
                   else{
                       three+= Integer.toString(d) + "Z ";
                   }
               }
           }
           else{
               double d = a[2][2];
               if(d<0){
                   d=0-d;
                   String t = getirrational(d);
                   three+= "-" + t + "Z ";
               }
               else{
                   String t = getirrational(d);
                   three+=t + "Z ";
               }
               
           }
           //end z3
           

         
           //for d3
           three+= " = ";
           if(intcheck(a[2][3])==true){
               int d = (int)a[2][3];
               three+= Integer.toString(d);
           }
           else{
               String t = getirrational(a[2][3]);
               three+=t;
           }
           //end d3
           lthree.setText(three);
           
           
           
            l111.setVisible(true);
      l222.setVisible(true);
       lone.setVisible(true);
        ltwo.setVisible(true);
         lthree.setVisible(true);
          lx.setVisible(true);
           ly.setVisible(true);
            lz.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tx1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx1KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           ty1.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           tx2.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           td3.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_UP)
           tz1.requestFocus();
    }//GEN-LAST:event_tx1KeyPressed

    private void tx2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx2KeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           tx1.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           tx3.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           tz2.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           ty2.requestFocus();
    }//GEN-LAST:event_tx2KeyPressed

    private void tx3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx3KeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           tx2.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           td1.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           tz3.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           ty3.requestFocus();
    }//GEN-LAST:event_tx3KeyPressed

    private void td1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_td1KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           tx3.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           ty1.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           td3.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           td2.requestFocus();
    }//GEN-LAST:event_td1KeyPressed

    private void ty1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ty1KeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           td1.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           ty2.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           tx1.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           tz1.requestFocus();
    }//GEN-LAST:event_ty1KeyPressed

    private void ty2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ty2KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           ty1.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           ty3.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           tx2.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           tz2.requestFocus();
    }//GEN-LAST:event_ty2KeyPressed

    private void ty3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ty3KeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           ty2.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           td2.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           tx3.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           tz3.requestFocus();
    }//GEN-LAST:event_ty3KeyPressed

    private void td2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_td2KeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           ty3.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           tz1.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           td1.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           td3.requestFocus();
    }//GEN-LAST:event_td2KeyPressed

    private void tz1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tz1KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           td2.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           tz2.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           ty1.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           tx1.requestFocus();
    }//GEN-LAST:event_tz1KeyPressed

    private void tz2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tz2KeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           tz1.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           tz3.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           ty2.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           tx2.requestFocus();
    }//GEN-LAST:event_tz2KeyPressed

    private void tz3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tz3KeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           tz2.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           td3.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           ty3.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           tx3.requestFocus();
    }//GEN-LAST:event_tz3KeyPressed

    private void td3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_td3KeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_LEFT)
           tz3.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
           tx1.requestFocus();
       if(evt.getKeyCode()==KeyEvent.VK_UP)
           td2.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_DOWN)
           td1.requestFocus();
    }//GEN-LAST:event_td3KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel l111;
    private javax.swing.JLabel l222;
    private javax.swing.JLabel lone;
    private javax.swing.JLabel lthree;
    private javax.swing.JLabel ltwo;
    private javax.swing.JLabel lx;
    private javax.swing.JLabel ly;
    private javax.swing.JLabel lz;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel p1d1;
    private javax.swing.JLabel p1d2;
    private javax.swing.JLabel p1d3;
    private javax.swing.JLabel p1label;
    private javax.swing.JLabel p1x1;
    private javax.swing.JLabel p1x2;
    private javax.swing.JLabel p1x3;
    private javax.swing.JLabel p1y1;
    private javax.swing.JLabel p1y2;
    private javax.swing.JLabel p1y3;
    private javax.swing.JLabel p1z1;
    private javax.swing.JLabel p1z2;
    private javax.swing.JLabel p1z3;
    private javax.swing.JLabel p2d1;
    private javax.swing.JLabel p2d2;
    private javax.swing.JLabel p2d3;
    private javax.swing.JLabel p2label;
    private javax.swing.JLabel p2x1;
    private javax.swing.JLabel p2x2;
    private javax.swing.JLabel p2x3;
    private javax.swing.JLabel p2y1;
    private javax.swing.JLabel p2y2;
    private javax.swing.JLabel p2y3;
    private javax.swing.JLabel p2z1;
    private javax.swing.JLabel p2z2;
    private javax.swing.JLabel p2z3;
    private javax.swing.JLabel p3d1;
    private javax.swing.JLabel p3d2;
    private javax.swing.JLabel p3d3;
    private javax.swing.JLabel p3label;
    private javax.swing.JLabel p3x1;
    private javax.swing.JLabel p3x2;
    private javax.swing.JLabel p3x3;
    private javax.swing.JLabel p3y1;
    private javax.swing.JLabel p3y2;
    private javax.swing.JLabel p3y3;
    private javax.swing.JLabel p3z1;
    private javax.swing.JLabel p3z2;
    private javax.swing.JLabel p3z3;
    private javax.swing.JLabel p4d1;
    private javax.swing.JLabel p4d2;
    private javax.swing.JLabel p4d3;
    private javax.swing.JLabel p4label;
    private javax.swing.JLabel p4x1;
    private javax.swing.JLabel p4x2;
    private javax.swing.JLabel p4x3;
    private javax.swing.JLabel p4y1;
    private javax.swing.JLabel p4y2;
    private javax.swing.JLabel p4y3;
    private javax.swing.JLabel p4z1;
    private javax.swing.JLabel p4z2;
    private javax.swing.JLabel p4z3;
    private javax.swing.JLabel p5d1;
    private javax.swing.JLabel p5d2;
    private javax.swing.JLabel p5d3;
    private javax.swing.JLabel p5label;
    private javax.swing.JLabel p5x1;
    private javax.swing.JLabel p5x2;
    private javax.swing.JLabel p5x3;
    private javax.swing.JLabel p5y1;
    private javax.swing.JLabel p5y2;
    private javax.swing.JLabel p5y3;
    private javax.swing.JLabel p5z1;
    private javax.swing.JLabel p5z2;
    private javax.swing.JLabel p5z3;
    private javax.swing.JLabel p6d1;
    private javax.swing.JLabel p6d2;
    private javax.swing.JLabel p6d3;
    private javax.swing.JLabel p6label;
    private javax.swing.JLabel p6x1;
    private javax.swing.JLabel p6x2;
    private javax.swing.JLabel p6x3;
    private javax.swing.JLabel p6y1;
    private javax.swing.JLabel p6y2;
    private javax.swing.JLabel p6y3;
    private javax.swing.JLabel p6z1;
    private javax.swing.JLabel p6z2;
    private javax.swing.JLabel p6z3;
    private javax.swing.JLabel p7d1;
    private javax.swing.JLabel p7d2;
    private javax.swing.JLabel p7d3;
    private javax.swing.JLabel p7label;
    private javax.swing.JLabel p7x1;
    private javax.swing.JLabel p7x2;
    private javax.swing.JLabel p7x3;
    private javax.swing.JLabel p7y1;
    private javax.swing.JLabel p7y2;
    private javax.swing.JLabel p7y3;
    private javax.swing.JLabel p7z1;
    private javax.swing.JLabel p7z2;
    private javax.swing.JLabel p7z3;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JTextField td1;
    private javax.swing.JTextField td2;
    private javax.swing.JTextField td3;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    private javax.swing.JTextField ty1;
    private javax.swing.JTextField ty2;
    private javax.swing.JTextField ty3;
    private javax.swing.JTextField tz1;
    private javax.swing.JTextField tz2;
    private javax.swing.JTextField tz3;
    // End of variables declaration//GEN-END:variables
 void swap(double[][] m, int r1, int r2){
       double a = m[r1][0];
       double b = m[r1][1];
       double c = m[r1][2];
       double d = m[r1][3];


       m[r1][0] = m[r2][0];
       m[r1][1] = m[r2][1];
       m[r1][2] = m[r2][2];
       m[r1][3] = m[r2][3];

       m[r2][0] = a;
       m[r2][1] = b;
       m[r2][2] = c;
       m[r2][3] = d;
    }
    void print(double[][] a) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 3)
                    System.out.print("|");
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    void reset(){
     panel1.setVisible(false);
     p1label.setVisible(false);
     panel2.setVisible(false);
     p2label.setVisible(false);
     panel3.setVisible(false);
     p3label.setVisible(false);
     panel4.setVisible(false);
     p4label.setVisible(false);
     panel5.setVisible(false);
     p5label.setVisible(false);
     panel6.setVisible(false);
     p6label.setVisible(false);
     panel7.setVisible(false);
     p7label.setVisible(false);
     mainpanel.setVisible(false);
     tx1.setText("");
     tx2.setText("");
     tx3.setText("");
     td1.setText("");
     ty1.setText("");
     ty2.setText("");
     ty3.setText("");
     td2.setText("");
     tz1.setText("");
     tz2.setText("");
     tz3.setText("");
     td3.setText("");
     l111.setVisible(false);
      l222.setVisible(false);
       lone.setVisible(false);
        ltwo.setVisible(false);
         lthree.setVisible(false);
          lx.setVisible(false);
           ly.setVisible(false);
            lz.setVisible(false);
     
 }
      void fun2(double[][] a, int row1, int row2, double n) {
        for (int i = 0; i < 4; i++) {
            a[row2][i] = a[row2][i] - a[row1][i] * n;
        }
    }
    void fun1(double[][] a, int row, double n) {
    for (int i = 0; i < 4; i++) {
        a[row][i] = a[row][i] / n;
    }
}
    boolean intcheck(Double d){
         if(d%1==0){
       return true;
       }
       else{
        return false;
       }
    }    
    
    
    
 String getirrational(double d){
    if(intcheck(d)==true){
        return Integer.toString((int)d);
    }
    String s="";
    double a;
    if(d<0){
       a = 0-d;
    }
    else
    a=d;

    if(a<1){
        for(int i=1;i<=99;i++){
            for(int j=i+1;j<=100;j++){
                if((double)i/(double)j==(double)a){
                      s += Integer.toString(i) + "/" + Integer.toString(j);
                     if(d<0)
                       s = "-" + s;
                       return s;
                }
            }
        }
    }
    else if(a>1){
        for(int i=2;i<=100;i++){
            for(int j=1;j<i;j++){
                if((double)i/(double)j==(double)a){
                      s += Integer.toString(i) + "/" + Integer.toString(j);
                      if(d<0)
                       s = "-" + s;
                       return s;
                }
            }
        }
    }
    
        String t = Double.toString(d);
        Formatter fm = new Formatter();
        fm.format("%.3f",d);
        s+= fm.toString();
        fm.close();
    
    return s;
  }
    
    /*String getirrational(double number)
{
   
    double intVal = Math.floor(number);
  
    double fVal = number - intVal;
    final long pVal = 1000000000;
    long gcdVal = gcd(Math.round(
                      fVal * pVal), pVal);
   
    long num = Math.round(fVal * pVal) / gcdVal;
    long deno = pVal / gcdVal;
    
    String s = Long.toString((long)(intVal * deno)+num) + "/" + Long.toString(deno);
   return s;
}

long gcd(long a, long b)
{
    if (a == 0)
        return b;
    else if (b == 0)
        return a;
    if (a < b)
        return gcd(a, b % a);
    else
        return gcd(b, a % b);
}*/





}


class matrix{
    JPanel panel;
    JLabel lx1,lx2,lx3,ld1,ly1,ly2,ly3,ld2,lz1,lz2,lz3,ld3,label;

    public matrix(JPanel panel, JLabel lx1, JLabel lx2, JLabel lx3, JLabel ld1, JLabel ly1, JLabel ly2, JLabel ly3, JLabel ld2, JLabel lz1, JLabel lz2, JLabel lz3, JLabel ld3, JLabel label) {
        this.panel = panel;
        this.lx1 = lx1;
        this.lx2 = lx2;
        this.lx3 = lx3;
        this.ld1 = ld1;
        this.ly1 = ly1;
        this.ly2 = ly2;
        this.ly3 = ly3;
        this.ld2 = ld2;
        this.lz1 = lz1;
        this.lz2 = lz2;
        this.lz3 = lz3;
        this.ld3 = ld3;
        this.label = label;
    }


    
    

    void setvalue(double[][] a, String s){
      
        Double x1= a[0][0];
         Double x2=a[0][1];
         Double x3=a[0][2];
         Double d1=a[0][3];
         Double y1=a[1][0];
         Double y2=a[1][1];
         Double y3=a[1][2];
         Double d2=a[1][3];
         Double z1=a[2][0];
         Double z2=a[2][1];
         Double z3= a[2][2];
         Double d3=a[2][3];
        
        set(x1, lx1);
        set(x2, lx2);
         set(x3, lx3); 
         set(d1, ld1);
          set(y1, ly1);
           set(y2, ly2);
            set(y3, ly3);
             set(d2, ld2);
              set(z1, lz1);
               set(z2, lz2);
                set(z3, lz3);
                 set(d3, ld3);
            label.setText(s);
            label.setVisible(true);
                 
            panel.setVisible(true);
        
    }   
    
    
    
    
    
    
    void set(Double x, JLabel l){
         if(intcheck(x)==true){
             int d = x.intValue();
             l.setText(Integer.toString(d));
         }
         else{
             l.setText(getirrational(x));
         }
    }
    
    
    
    boolean intcheck(Double d){
         if(d%1==0){
       return true;
       }
       else{
        return false;
       }
    }    
    
  
 String getirrational(double d){
    if(intcheck(d)==true){
        return Integer.toString((int)d);
    }
    String s="";
    double a;
    if(d<0){
       a = 0-d;
    }
    else
    a=d;

    if(a<1){
        for(int i=1;i<=99;i++){
            for(int j=i+1;j<=100;j++){
                if((double)i/(double)j==(double)a){
                      s += Integer.toString(i) + "/" + Integer.toString(j);
                     if(d<0)
                       s = "-" + s;
                       return s;
                }
            }
        }
    }
    else if(a>1){
        for(int i=2;i<=100;i++){
            for(int j=1;j<i;j++){
                if((double)i/(double)j==(double)a){
                      s += Integer.toString(i) + "/" + Integer.toString(j);
                      if(d<0)
                       s = "-" + s;
                       return s;
                }
            }
        }
    }
    
        String t = Double.toString(d);
        Formatter fm = new Formatter();
        fm.format("%.3f",d);
        s+= fm.toString();
        fm.close();
    
    return s;
  } 
    
    
    
 /*String getirrational(double number)
{
   
    double intVal = Math.floor(number);
  
    double fVal = number - intVal;
    final long pVal = 1000000000;
    long gcdVal = gcd(Math.round(
                      fVal * pVal), pVal);
   
    long num = Math.round(fVal * pVal) / gcdVal;
    long deno = pVal / gcdVal;
    
    String s = Long.toString((long)(intVal * deno)+num) + "/" + Long.toString(deno);
   return s;
}

long gcd(long a, long b)
{
    if (a == 0)
        return b;
    else if (b == 0)
        return a;
    if (a < b)
        return gcd(a, b % a);
    else
        return gcd(b, a % b);
}*/
    
    
    
}
