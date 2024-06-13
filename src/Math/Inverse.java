package Math;

import raven.application.form.other.*;
import com.formdev.flatlaf.FlatClientProperties;
import raven.toast.Notifications;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raven
 */
public class Inverse extends javax.swing.JPanel {

    public Inverse() {
        initComponents();
        reset();
    /* tx1.setText("4");
     tx2.setText("5");
     tx3.setText("6");
     td1.setText("2");
     ty1.setText("5");
     ty2.setText("6");
     ty3.setText("8");
     td2.setText("1");
     tz1.setText("6");
     tz2.setText("3");
     tz3.setText("9");
     td3.setText("6");*/
     //scroll.setVisible(false);
     mainpanel.setVisible(false);
      
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
        scroll = new javax.swing.JScrollPane();
        mainpanel = new javax.swing.JPanel();
        l111 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lx1 = new javax.swing.JLabel();
        ly1 = new javax.swing.JLabel();
        lz1 = new javax.swing.JLabel();
        lx2 = new javax.swing.JLabel();
        ly2 = new javax.swing.JLabel();
        lz2 = new javax.swing.JLabel();
        lx3 = new javax.swing.JLabel();
        ly3 = new javax.swing.JLabel();
        lz3 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        p1a = new javax.swing.JLabel();
        p1c = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        l117 = new javax.swing.JLabel();
        l118 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        p1b = new javax.swing.JLabel();
        p1d = new javax.swing.JLabel();
        p1label = new javax.swing.JLabel();
        l112 = new javax.swing.JLabel();
        l113 = new javax.swing.JLabel();
        l114 = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        p2x4 = new javax.swing.JLabel();
        p2y4 = new javax.swing.JLabel();
        p2z4 = new javax.swing.JLabel();
        panel9 = new javax.swing.JPanel();
        ld1 = new javax.swing.JLabel();
        ld2 = new javax.swing.JLabel();
        ld3 = new javax.swing.JLabel();
        l115 = new javax.swing.JLabel();
        l116 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        p2a = new javax.swing.JLabel();
        p2c = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        l120 = new javax.swing.JLabel();
        l121 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        p2b = new javax.swing.JLabel();
        p2d = new javax.swing.JLabel();
        p2label = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        p3a = new javax.swing.JLabel();
        p3c = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        l123 = new javax.swing.JLabel();
        l124 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        p3b = new javax.swing.JLabel();
        p3d = new javax.swing.JLabel();
        p3label = new javax.swing.JLabel();
        p4adasasd = new javax.swing.JPanel();
        p4c = new javax.swing.JLabel();
        p4a = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        l126 = new javax.swing.JLabel();
        l127 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        p4b = new javax.swing.JLabel();
        p4d = new javax.swing.JLabel();
        p4label = new javax.swing.JLabel();
        panel7 = new javax.swing.JPanel();
        p5a = new javax.swing.JLabel();
        p5c = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        l129 = new javax.swing.JLabel();
        l130 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        p5b = new javax.swing.JLabel();
        p5d = new javax.swing.JLabel();
        p5label = new javax.swing.JLabel();
        panel10 = new javax.swing.JPanel();
        p6a = new javax.swing.JLabel();
        p6c = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        l132 = new javax.swing.JLabel();
        l133 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        p6b = new javax.swing.JLabel();
        p6d = new javax.swing.JLabel();
        p6label = new javax.swing.JLabel();
        panel11 = new javax.swing.JPanel();
        p2x6 = new javax.swing.JLabel();
        p2y6 = new javax.swing.JLabel();
        p2z6 = new javax.swing.JLabel();
        p2x7 = new javax.swing.JLabel();
        p2y7 = new javax.swing.JLabel();
        p2z7 = new javax.swing.JLabel();
        p2x8 = new javax.swing.JLabel();
        p2y8 = new javax.swing.JLabel();
        p2z8 = new javax.swing.JLabel();
        l135 = new javax.swing.JLabel();
        panel12 = new javax.swing.JPanel();
        cx1 = new javax.swing.JLabel();
        cy1 = new javax.swing.JLabel();
        cz1 = new javax.swing.JLabel();
        cx2 = new javax.swing.JLabel();
        cy2 = new javax.swing.JLabel();
        cz2 = new javax.swing.JLabel();
        cx3 = new javax.swing.JLabel();
        cy3 = new javax.swing.JLabel();
        cz3 = new javax.swing.JLabel();
        l136 = new javax.swing.JLabel();
        panel13 = new javax.swing.JPanel();
        p7a = new javax.swing.JLabel();
        p7c = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        l137 = new javax.swing.JLabel();
        l138 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        p7b = new javax.swing.JLabel();
        p7d = new javax.swing.JLabel();
        p7label = new javax.swing.JLabel();
        panel14 = new javax.swing.JPanel();
        p8a = new javax.swing.JLabel();
        p8c = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        l140 = new javax.swing.JLabel();
        l141 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        p8b = new javax.swing.JLabel();
        p8d = new javax.swing.JLabel();
        p8label = new javax.swing.JLabel();
        panel15 = new javax.swing.JPanel();
        p9a = new javax.swing.JLabel();
        p9c = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        l143 = new javax.swing.JLabel();
        l144 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        p9b = new javax.swing.JLabel();
        p9d = new javax.swing.JLabel();
        p9label = new javax.swing.JLabel();
        l146 = new javax.swing.JLabel();
        panel16 = new javax.swing.JPanel();
        adx1 = new javax.swing.JLabel();
        ady1 = new javax.swing.JLabel();
        adz1 = new javax.swing.JLabel();
        adx2 = new javax.swing.JLabel();
        ady2 = new javax.swing.JLabel();
        adz2 = new javax.swing.JLabel();
        adx3 = new javax.swing.JLabel();
        ady3 = new javax.swing.JLabel();
        adz3 = new javax.swing.JLabel();
        l147 = new javax.swing.JLabel();
        valueofa = new javax.swing.JLabel();
        l149 = new javax.swing.JLabel();
        l150 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        l151 = new javax.swing.JLabel();
        l152 = new javax.swing.JLabel();
        panel18 = new javax.swing.JPanel();
        inx1 = new javax.swing.JLabel();
        iny1 = new javax.swing.JLabel();
        inz1 = new javax.swing.JLabel();
        inx2 = new javax.swing.JLabel();
        iny2 = new javax.swing.JLabel();
        inz2 = new javax.swing.JLabel();
        inx3 = new javax.swing.JLabel();
        iny3 = new javax.swing.JLabel();
        inz3 = new javax.swing.JLabel();
        l153 = new javax.swing.JLabel();
        l154 = new javax.swing.JLabel();
        l155 = new javax.swing.JLabel();
        l156 = new javax.swing.JLabel();
        panel19 = new javax.swing.JPanel();
        in2x1 = new javax.swing.JLabel();
        in2y1 = new javax.swing.JLabel();
        in2z1 = new javax.swing.JLabel();
        in2x2 = new javax.swing.JLabel();
        in2y2 = new javax.swing.JLabel();
        in2z2 = new javax.swing.JLabel();
        in2x3 = new javax.swing.JLabel();
        in2y3 = new javax.swing.JLabel();
        in2z3 = new javax.swing.JLabel();
        panel20 = new javax.swing.JPanel();
        dd1 = new javax.swing.JLabel();
        dd2 = new javax.swing.JLabel();
        dd3 = new javax.swing.JLabel();
        l157 = new javax.swing.JLabel();
        panel21 = new javax.swing.JPanel();
        ddd1 = new javax.swing.JLabel();
        ddd2 = new javax.swing.JLabel();
        ddd3 = new javax.swing.JLabel();
        panel22 = new javax.swing.JPanel();
        p2x28 = new javax.swing.JLabel();
        p2y28 = new javax.swing.JLabel();
        p2z28 = new javax.swing.JLabel();
        l158 = new javax.swing.JLabel();
        l159 = new javax.swing.JLabel();
        l160 = new javax.swing.JLabel();
        l161 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        z = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Equation solver by inverse matrix method");

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
        ty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ty2ActionPerformed(evt);
            }
        });
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
        td2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                td2ActionPerformed(evt);
            }
        });
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

        mainpanel.setPreferredSize(new java.awt.Dimension(1500, 3000));

        l111.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l111.setText("The given system equation can be written as,");

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lx1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx1.setPreferredSize(new java.awt.Dimension(101, 40));

        ly1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ly1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly1.setPreferredSize(new java.awt.Dimension(101, 40));

        lz1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lz1.setPreferredSize(new java.awt.Dimension(101, 40));

        lx2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lx2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx2.setPreferredSize(new java.awt.Dimension(101, 40));

        ly2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ly2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly2.setPreferredSize(new java.awt.Dimension(101, 40));

        lz2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lz2.setPreferredSize(new java.awt.Dimension(101, 40));

        lx3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lx3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx3.setPreferredSize(new java.awt.Dimension(101, 40));

        ly3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ly3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly3.setPreferredSize(new java.awt.Dimension(101, 40));

        lz3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lz3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lz3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ly1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(lx1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lz1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ly2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(lx2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lz2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ly3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(lx3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lz3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lx3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ly3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lz3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(lx2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ly2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lz2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(lx1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ly1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lz1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p1a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1a.setPreferredSize(new java.awt.Dimension(101, 40));

        p1c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1c.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        l117.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        l117.setText("c11 = (-1)");

        l118.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l118.setText("1+1");

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p1b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1b.setPreferredSize(new java.awt.Dimension(101, 40));

        p1d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p1d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1d.setPreferredSize(new java.awt.Dimension(101, 40));

        p1label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        p1label.setText(" = (1 + 4 ) = 5");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l118)
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1a, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1d, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p1label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(l117, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(l118, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(p1label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(p1b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p1d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(p1a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p1c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l112.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l112.setText("AX = B            where ,");

        l113.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l113.setText("A = ");

        l114.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l114.setText("X = ");

        panel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p2x4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2x4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2x4.setText("x");
        p2x4.setPreferredSize(new java.awt.Dimension(101, 40));

        p2y4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2y4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2y4.setText("y");
        p2y4.setPreferredSize(new java.awt.Dimension(101, 40));

        p2z4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2z4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2z4.setText("z");
        p2z4.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(p2y4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(p2x4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(p2z4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2y4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2z4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ld1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ld1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ld1.setPreferredSize(new java.awt.Dimension(101, 40));

        ld2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ld2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ld2.setPreferredSize(new java.awt.Dimension(101, 40));

        ld3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ld3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ld3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ld2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ld1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ld3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ld1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ld2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ld3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l115.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l115.setText("B = ");

        l116.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l116.setText("Find cofactor matrix,");

        p2a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2a.setPreferredSize(new java.awt.Dimension(101, 40));

        p2c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2c.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        l120.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        l120.setText("c12 = (-1)");

        l121.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l121.setText("1+2");

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p2b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2b.setPreferredSize(new java.awt.Dimension(101, 40));

        p2d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2d.setPreferredSize(new java.awt.Dimension(101, 40));

        p2label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        p2label.setText(" = (1 + 4 ) = 5");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l121)
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2a, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2d, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p2label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(l120, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(l121, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(p2label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(p2b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(p2a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p3a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3a.setPreferredSize(new java.awt.Dimension(101, 40));

        p3c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3c.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        l123.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        l123.setText("c13 = (-1)");

        l124.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l124.setText("1+3");

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p3b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3b.setPreferredSize(new java.awt.Dimension(101, 40));

        p3d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p3d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3d.setPreferredSize(new java.awt.Dimension(101, 40));

        p3label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        p3label.setText(" = (1 + 4 ) = 5");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l123)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l124)
                .addGap(18, 18, 18)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3a, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3d, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p3label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(l123, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(l124, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(p3label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addComponent(p3b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p3d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addComponent(p3a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p3c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        p4c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4c.setPreferredSize(new java.awt.Dimension(101, 40));

        p4a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4a.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        l126.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        l126.setText("c21 = (-1)");

        l127.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l127.setText("2+1");

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p4b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4b.setPreferredSize(new java.awt.Dimension(101, 40));

        p4d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p4d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4d.setPreferredSize(new java.awt.Dimension(101, 40));

        p4label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        p4label.setText(" = (1 + 4 ) = 5");

        javax.swing.GroupLayout p4adasasdLayout = new javax.swing.GroupLayout(p4adasasd);
        p4adasasd.setLayout(p4adasasdLayout);
        p4adasasdLayout.setHorizontalGroup(
            p4adasasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4adasasdLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l127)
                .addGap(18, 18, 18)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p4adasasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4c, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4a, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p4adasasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4d, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p4label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p4adasasdLayout.setVerticalGroup(
            p4adasasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4adasasdLayout.createSequentialGroup()
                .addGroup(p4adasasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p4adasasdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p4adasasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p4adasasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(p4adasasdLayout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(l126, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(p4adasasdLayout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(l127, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(p4label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p4adasasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(p4adasasdLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(p4adasasdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p4adasasdLayout.createSequentialGroup()
                                .addComponent(p4b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p4d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p4adasasdLayout.createSequentialGroup()
                                .addComponent(p4a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p4c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        p5a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5a.setPreferredSize(new java.awt.Dimension(101, 40));

        p5c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5c.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        l129.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        l129.setText("c22 = (-1)");

        l130.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l130.setText("2+2");

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p5b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5b.setPreferredSize(new java.awt.Dimension(101, 40));

        p5d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p5d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5d.setPreferredSize(new java.awt.Dimension(101, 40));

        p5label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        p5label.setText(" = (1 + 4 ) = 5");

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l130)
                .addGap(18, 18, 18)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p5a, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p5b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5d, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p5label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(l129, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel7Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(l130, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(p5label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel7Layout.createSequentialGroup()
                                .addComponent(p5b, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p5d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel7Layout.createSequentialGroup()
                                .addComponent(p5a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p5c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p6a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6a.setPreferredSize(new java.awt.Dimension(101, 40));

        p6c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6c.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        l132.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        l132.setText("c23 = (-1)");

        l133.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l133.setText("2+3");

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p6b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6b.setPreferredSize(new java.awt.Dimension(101, 40));

        p6d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p6d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6d.setPreferredSize(new java.awt.Dimension(101, 40));

        p6label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        p6label.setText(" = (1 + 4 ) = 5");

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l133)
                .addGap(18, 18, 18)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p6a, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p6b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6d, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p6label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel10Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(l132, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel10Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(l133, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(p6label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jSeparator17, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p6a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p6b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p6d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p2x6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2x6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2x6.setText("c11");
        p2x6.setPreferredSize(new java.awt.Dimension(101, 40));

        p2y6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2y6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2y6.setText("c21");
        p2y6.setPreferredSize(new java.awt.Dimension(101, 40));

        p2z6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2z6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2z6.setText("c31");
        p2z6.setPreferredSize(new java.awt.Dimension(101, 40));

        p2x7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2x7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2x7.setText("c12");
        p2x7.setPreferredSize(new java.awt.Dimension(101, 40));

        p2y7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2y7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2y7.setText("c22");
        p2y7.setPreferredSize(new java.awt.Dimension(101, 40));

        p2z7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2z7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2z7.setText("c32");
        p2z7.setPreferredSize(new java.awt.Dimension(101, 40));

        p2x8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2x8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2x8.setText("c13");
        p2x8.setPreferredSize(new java.awt.Dimension(101, 40));

        p2y8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2y8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2y8.setText("c23");
        p2y8.setPreferredSize(new java.awt.Dimension(101, 40));

        p2z8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2z8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2z8.setText("c33");
        p2z8.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(p2y6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(p2x6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(p2z6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(p2y7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(p2x7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(p2z7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(p2y8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(p2x8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(p2z8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel11Layout.createSequentialGroup()
                        .addComponent(p2x8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2y8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2z8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel11Layout.createSequentialGroup()
                            .addComponent(p2x7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p2y7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p2z7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel11Layout.createSequentialGroup()
                            .addComponent(p2x6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p2y6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(p2z6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        l135.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l135.setText("Cofactor Matrix = ");

        panel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cx1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cx1.setPreferredSize(new java.awt.Dimension(101, 40));

        cy1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cy1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cy1.setPreferredSize(new java.awt.Dimension(101, 40));

        cz1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cz1.setPreferredSize(new java.awt.Dimension(101, 40));

        cx2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cx2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cx2.setPreferredSize(new java.awt.Dimension(101, 40));

        cy2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cy2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cy2.setPreferredSize(new java.awt.Dimension(101, 40));

        cz2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cz2.setPreferredSize(new java.awt.Dimension(101, 40));

        cx3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cx3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cx3.setPreferredSize(new java.awt.Dimension(101, 40));

        cy3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cy3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cy3.setPreferredSize(new java.awt.Dimension(101, 40));

        cz3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cz3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cz3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cy1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(cx1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cz1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cy2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(cx2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cz2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cy3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(cx3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cz3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel12Layout.createSequentialGroup()
                        .addComponent(cx3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cy3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cz3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel12Layout.createSequentialGroup()
                            .addComponent(cx2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cy2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cz2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel12Layout.createSequentialGroup()
                            .addComponent(cx1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cy1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cz1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        l136.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l136.setText("=");

        p7a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7a.setPreferredSize(new java.awt.Dimension(101, 40));

        p7c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7c.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        l137.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        l137.setText("c31 = (-1)");

        l138.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l138.setText("3+1");

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p7b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7b.setPreferredSize(new java.awt.Dimension(101, 40));

        p7d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p7d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7d.setPreferredSize(new java.awt.Dimension(101, 40));

        p7label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        p7label.setText(" = (1 + 4 ) = 5");

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l137)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l138)
                .addGap(18, 18, 18)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p7a, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p7b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7d, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p7label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel13Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(l137, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel13Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(l138, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(p7label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p7a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p7b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p7d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p7c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p8a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p8a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8a.setPreferredSize(new java.awt.Dimension(101, 40));

        p8c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p8c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8c.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        l140.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        l140.setText("c32 = (-1)");

        l141.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l141.setText("3+2");

        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p8b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p8b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8b.setPreferredSize(new java.awt.Dimension(101, 40));

        p8d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p8d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8d.setPreferredSize(new java.awt.Dimension(101, 40));

        p8label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        p8label.setText(" = (1 + 4 ) = 5");

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l140)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l141)
                .addGap(18, 18, 18)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p8a, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p8b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8d, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p8label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel14Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(l140, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel14Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(l141, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(p8label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jSeparator21, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p8a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p8b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p8d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p8c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p9a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p9a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9a.setPreferredSize(new java.awt.Dimension(101, 40));

        p9c.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p9c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9c.setPreferredSize(new java.awt.Dimension(101, 40));

        jSeparator23.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        l143.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        l143.setText("c33 = (-1)");

        l144.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        l144.setText("3+3");

        jSeparator24.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p9b.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p9b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9b.setPreferredSize(new java.awt.Dimension(101, 40));

        p9d.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p9d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9d.setPreferredSize(new java.awt.Dimension(101, 40));

        p9label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        p9label.setText(" = (1 + 4 ) = 5");

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panel15);
        panel15.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l143)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l144)
                .addGap(18, 18, 18)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p9a, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p9c, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p9b, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p9d, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p9label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panel15Layout.setVerticalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel15Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(l143, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel15Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(l144, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(p9label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(jSeparator23, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p9a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p9b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p9d, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p9c, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        l146.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l146.setText("Adj (A) = ");

        panel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        adx1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adx1.setPreferredSize(new java.awt.Dimension(101, 40));

        ady1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ady1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ady1.setPreferredSize(new java.awt.Dimension(101, 40));

        adz1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adz1.setPreferredSize(new java.awt.Dimension(101, 40));

        adx2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adx2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adx2.setPreferredSize(new java.awt.Dimension(101, 40));

        ady2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ady2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ady2.setPreferredSize(new java.awt.Dimension(101, 40));

        adz2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adz2.setPreferredSize(new java.awt.Dimension(101, 40));

        adx3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adx3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adx3.setPreferredSize(new java.awt.Dimension(101, 40));

        ady3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ady3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ady3.setPreferredSize(new java.awt.Dimension(101, 40));

        adz3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adz3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adz3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adx1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(ady1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adx2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ady2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adz2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adx3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ady3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adz3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel16Layout.createSequentialGroup()
                        .addComponent(adx3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ady3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adz3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel16Layout.createSequentialGroup()
                        .addComponent(adx2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ady2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adz2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel16Layout.createSequentialGroup()
                        .addComponent(adx1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ady1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adz1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l147.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l147.setText("| A | = ");

        valueofa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        l149.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l149.setText("Inverse(A) = ");

        l150.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l150.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l150.setText("Adj (A)");

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        l151.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l151.setText("| A |");

        l152.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l152.setText("Inverse(A) = ");

        panel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inx1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inx1.setPreferredSize(new java.awt.Dimension(101, 40));

        iny1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iny1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iny1.setPreferredSize(new java.awt.Dimension(101, 40));

        inz1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inz1.setPreferredSize(new java.awt.Dimension(101, 40));

        inx2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inx2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inx2.setPreferredSize(new java.awt.Dimension(101, 40));

        iny2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iny2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iny2.setPreferredSize(new java.awt.Dimension(101, 40));

        inz2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inz2.setPreferredSize(new java.awt.Dimension(101, 40));

        inx3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inx3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inx3.setPreferredSize(new java.awt.Dimension(101, 40));

        iny3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iny3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iny3.setPreferredSize(new java.awt.Dimension(101, 40));

        inz3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inz3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inz3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel18Layout = new javax.swing.GroupLayout(panel18);
        panel18.setLayout(panel18Layout);
        panel18Layout.setHorizontalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inx1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(iny1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inx2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iny2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inz2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inx3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iny3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inz3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel18Layout.setVerticalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel18Layout.createSequentialGroup()
                        .addComponent(inx3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iny3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inz3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel18Layout.createSequentialGroup()
                        .addComponent(inx2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iny2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inz2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel18Layout.createSequentialGroup()
                        .addComponent(inx1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iny1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inz1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l153.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l153.setText("From equation (1)");

        l154.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l154.setText("AX = B");

        l155.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l155.setText("=> X = Inverse(A) * B");

        l156.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l156.setText("=> X =");

        panel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        in2x1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        in2x1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in2x1.setPreferredSize(new java.awt.Dimension(101, 40));

        in2y1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        in2y1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in2y1.setPreferredSize(new java.awt.Dimension(101, 40));

        in2z1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        in2z1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in2z1.setPreferredSize(new java.awt.Dimension(101, 40));

        in2x2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        in2x2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in2x2.setPreferredSize(new java.awt.Dimension(101, 40));

        in2y2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        in2y2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in2y2.setPreferredSize(new java.awt.Dimension(101, 40));

        in2z2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        in2z2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in2z2.setPreferredSize(new java.awt.Dimension(101, 40));

        in2x3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        in2x3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in2x3.setPreferredSize(new java.awt.Dimension(101, 40));

        in2y3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        in2y3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in2y3.setPreferredSize(new java.awt.Dimension(101, 40));

        in2z3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        in2z3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in2z3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel19Layout = new javax.swing.GroupLayout(panel19);
        panel19.setLayout(panel19Layout);
        panel19Layout.setHorizontalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(in2x1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(in2y1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(in2z1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(in2x2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(in2y2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(in2z2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(in2x3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(in2y3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(in2z3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel19Layout.setVerticalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel19Layout.createSequentialGroup()
                        .addComponent(in2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(in2y3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(in2z3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel19Layout.createSequentialGroup()
                        .addComponent(in2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(in2y2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(in2z2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel19Layout.createSequentialGroup()
                        .addComponent(in2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(in2y1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(in2z1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dd1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dd1.setPreferredSize(new java.awt.Dimension(101, 40));

        dd2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dd2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dd2.setPreferredSize(new java.awt.Dimension(101, 40));

        dd3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dd3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dd3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel20Layout = new javax.swing.GroupLayout(panel20);
        panel20.setLayout(panel20Layout);
        panel20Layout.setHorizontalGroup(
            panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dd2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(dd1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(dd3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel20Layout.setVerticalGroup(
            panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dd2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dd3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l157.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        l157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l157.setText("*");

        panel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ddd1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ddd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ddd1.setPreferredSize(new java.awt.Dimension(101, 40));

        ddd2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ddd2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ddd2.setPreferredSize(new java.awt.Dimension(101, 40));

        ddd3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ddd3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ddd3.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel21Layout = new javax.swing.GroupLayout(panel21);
        panel21.setLayout(panel21Layout);
        panel21Layout.setHorizontalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ddd1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(ddd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ddd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel21Layout.setVerticalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ddd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ddd2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ddd3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p2x28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2x28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2x28.setText("x");
        p2x28.setPreferredSize(new java.awt.Dimension(101, 40));

        p2y28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2y28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2y28.setText("y");
        p2y28.setPreferredSize(new java.awt.Dimension(101, 40));

        p2z28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p2z28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2z28.setText("z");
        p2z28.setPreferredSize(new java.awt.Dimension(101, 40));

        javax.swing.GroupLayout panel22Layout = new javax.swing.GroupLayout(panel22);
        panel22.setLayout(panel22Layout);
        panel22Layout.setHorizontalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(p2y28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(p2x28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(p2z28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel22Layout.setVerticalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p2x28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2y28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2z28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l158.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l158.setText("=");

        l159.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l159.setText("X = ");

        l160.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l160.setText("Y = ");

        l161.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l161.setText("Z = ");

        x.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        y.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        z.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l111, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l112, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l116, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p4adasasd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addComponent(l135, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(l136, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(l146)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(885, Short.MAX_VALUE))
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(l147)
                        .addGap(18, 18, 18)
                        .addComponent(valueofa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainpanelLayout.createSequentialGroup()
                                    .addComponent(l152)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mainpanelLayout.createSequentialGroup()
                                    .addComponent(l149)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(l150, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(l151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(l153, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l154, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l155, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                                    .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l159)
                                        .addComponent(l160)
                                        .addComponent(l161))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(y, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(z, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                    .addGap(426, 426, 426))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                                    .addComponent(panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(l158, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(396, 396, 396)))
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addComponent(l156)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l157, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(l113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(l114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(l115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(l111, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l112, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(l113, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(mainpanelLayout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(l115, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(l114, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l116, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4adasasd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(l135, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(l136, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(l146, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l147, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueofa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(l150, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l151, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(l149, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(l152, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addComponent(l153, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l154, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l155, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(l156, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                                        .addComponent(l157)
                                        .addGap(46, 46, 46)))))))
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(l158)))
                .addGap(45, 45, 45)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(l159, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l160, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l161, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        scroll.setViewportView(mainpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tx1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ty1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tz1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(td3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tx2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tx3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ty2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ty3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(td1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(td2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(72, 72, 72)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tx1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tx3)
                    .addComponent(tx2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(td1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ty1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ty2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ty3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(td2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tz1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tz2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tz3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(td3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2997, Short.MAX_VALUE))
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
           JOptionPane.showMessageDialog(new Inverse(), "Enter all value", "Warning", JOptionPane.ERROR_MESSAGE);
           return;
       }
      /* matrix mat1 = new matrix(panel1, p1x1, p1x2, p1x3, p1d1, p1y1, p1y2, p1y3, p1d2, p1z1, p1z2, p1z3, p1d3, p1label);
       matrix mat2 = new matrix(panel2, lx1, lx2, lx3, p2d1, ly1, ly2, ly3, p2d2, lz1, lz2, lz3, p2d3, p2label);
       matrix mat3 = new matrix(panel3, p3x1, p1a, p2a, p3d1, p3y1, p1c, p2c, p3d2, p3z1, p3z2, p3z3, p3d3, p3label);
       matrix mat4 = new matrix(panel4, p4x1, p4x2, p4x3, p4d1, p4y1, p4y2, p4y3, p4d2, p4z1, p4z2, p4z3, p4d3, p4label);
       matrix mat5 = new matrix(panel5, p5x1, p5x2, p5x3, p5d1, p5y1, p5y2, p5y3, p5d2, p5z1, p5z2, p5z3, p5d3, p5label);
       matrix mat6 = new matrix(p4adasasd, p6x1, p6x2, p6x3, p6d1, p6y1, p6y2, p6y3, p6d2, p6z1, p6z2, p6z3, p6d3, p6label);
       matrix mat7 = new matrix(panel7, p7x1, p7x2, p7x3, p7d1, p7y1, p7y2, p7y3, p7d2, p7z1, p7z2, p7z3, p7d3, p7label);
       ArrayList<matrix> arr = new ArrayList<>();
       arr.add(mat1);
       arr.add(mat2);
       arr.add(mat3);
       arr.add(mat4);
       arr.add(mat5);
       arr.add(mat6);
       arr.add(mat7);
       int counter=1;*/
       Integer x1,x2,x3,y1,y2,y3,z1,z2,z3,d1,d2,d3;
        try {
            x1 = Integer.parseInt(tx1.getText().toString());
            x2 = Integer.parseInt(tx2.getText().toString());
            x3 = Integer.parseInt(tx3.getText().toString());
            d1 = Integer.parseInt(td1.getText().toString());
            y1 = Integer.parseInt(ty1.getText().toString());
            y2 = Integer.parseInt(ty2.getText().toString());
            y3 = Integer.parseInt(ty3.getText().toString());
            d2 = Integer.parseInt(td2.getText().toString());
            z1 = Integer.parseInt(tz1.getText().toString());
            z2 = Integer.parseInt(tz2.getText().toString());
            z3 = Integer.parseInt(tz3.getText().toString());
            d3 = Integer.parseInt(td3.getText().toString());
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(new Inverse(), "Invalid Input.", "Warning", JOptionPane.ERROR_MESSAGE);
           return;
        }
         scroll.setVisible(true);
     mainpanel.setVisible(true);
        
        
        int[][] a = new int[3][3];
        int[] b = new int[3];
        a[0][0]=x1;
         a[0][1]=x2;
         a[0][2]=x3;
          b[0]=d1;
         a[1][0]=y1;
         a[1][1]=y2;
         a[1][2]=y3;
         b[1]=d2;
         a[2][0]=z1;
         a[2][1]=z2;
          a[2][2]=z3;
          b[2]=d3;
         
         set(a, lx1, lx2, lx3, ly1, ly2, ly3, lz1, lz2, lz3);
         set2(b, ld1, ld2, ld3);
          set2(b, dd1, dd2, dd3);
         
         int value = (a[0][0] * (a[1][1] * a[2][2] - a[2][1] * a[1][2])) - (a[0][1] * (a[1][0] * a[2][2] - a[2][0] * a[1][2])) + (a[0][2] * (a[1][0] * a[2][1] - a[2][0] * a[1][1])); 
         valueofa.setText(Integer.toString(value));
         
         int[][] c = new int[3][3];
         c[0][0] = a[1][1]*a[2][2] - a[2][1]*a[1][2];
         c[0][1] = 0-(a[1][0]*a[2][2] - a[2][0]*a[1][2]);
         c[0][2] = a[1][0]*a[2][1] - a[2][0]*a[1][1];
         c[1][0] = 0-(a[0][1]*a[2][2] - a[2][1]*a[0][2]);
         c[1][1] = a[0][0]*a[2][2] - a[2][0]*a[0][2];
         c[1][2] = 0-(a[0][0]*a[2][1] - a[2][0]*a[0][1]);
         c[2][0] = a[0][1]*a[1][2] - a[1][1]*a[0][2];
         c[2][1] = 0-(a[0][0]*a[1][2] - a[1][0]*a[0][2]);
         c[2][2] = a[0][0]*a[1][1] - a[1][0]*a[0][1];
         
         String s;
         s = " = ("+ Integer.toString(a[1][1]*a[2][2]) + " - " + Integer.toString(a[2][1]*a[1][2]) + ") = " + Integer.toString(c[0][0]);
         set3(a[1][1],a[1][2],a[2][1],a[2][2],p1a,p1b,p1c,p1d,p1label,s);
         
          s = " = - ("+ Integer.toString(a[1][0]*a[2][2]) + " - " + Integer.toString(a[2][0]*a[1][2]) + ") = " + Integer.toString(c[0][1]);
         set3(a[1][0],a[1][2],a[2][0],a[2][2],p2a,p2b,p2c,p2d,p2label,s);
         
          s = " = ("+ Integer.toString(a[1][0]*a[2][1]) + " - " + Integer.toString(a[2][0]*a[1][1]) + ") = " + Integer.toString(c[0][2]);
         set3(a[1][0],a[1][1],a[2][0],a[2][1],p3a,p3b,p3c,p3d,p3label,s);
         
         
         s = " = - ("+ Integer.toString(a[0][1]*a[2][2]) + " - " + Integer.toString(a[2][1]*a[0][2]) + ") = " + Integer.toString(c[1][0]);
         set3(a[0][1],a[0][2],a[2][1],a[2][2],p4a,p4b,p4c,p4d,p4label,s);
         s = " = ("+ Integer.toString(a[0][0]*a[2][2]) + " - " + Integer.toString(a[2][0]*a[0][2]) + ") = " + Integer.toString(c[1][1]);
         set3(a[0][0],a[0][2],a[2][0],a[2][2],p5a,p5b,p5c,p5d,p5label,s);
          s = " = - ("+ Integer.toString(a[0][0]*a[2][1]) + " - " + Integer.toString(a[2][0]*a[0][1]) + ") = " + Integer.toString(c[1][2]);
         set3(a[0][0],a[0][1],a[2][0],a[2][1],p6a,p6b,p6c,p6d,p6label,s);

          s = " = ("+ Integer.toString(a[0][1]*a[1][2]) + " - " + Integer.toString(a[1][1]*a[0][2]) + ") = " + Integer.toString(c[2][0]);
         set3(a[0][1],a[0][2],a[1][1],a[1][2],p7a,p7b,p7c,p7d,p7label,s);
         s = " = - ("+ Integer.toString(a[0][0]*a[1][2]) + " - " + Integer.toString(a[1][0]*a[0][2]) + ") = " + Integer.toString(c[2][1]);
         set3(a[0][0],a[0][2],a[1][0],a[1][2],p8a,p8b,p8c,p8d,p8label,s);
         
           s = " = ("+ Integer.toString(a[0][0]*a[1][1]) + " - " + Integer.toString(a[1][0]*a[0][1]) + ") = " + Integer.toString(c[2][2]);
         set3(a[0][0],a[0][1],a[1][0],a[1][1],p9a,p9b,p9c,p9d,p9label,s);
         
         
         
         set(c,cx1,cx2,cx3,cy1,cy2,cy3,cz1,cz2,cz3);
         int[][] adj =new int[3][3];
         adj[0][0] = c[0][0];
         adj[0][1] = c[1][0];
         adj[0][2] = c[2][0];
         adj[1][0] = c[0][1];
         adj[1][1] = c[1][1];
         adj[1][2] = c[2][1];
         adj[2][0] = c[0][2];
         adj[2][1] = c[1][2];
         adj[2][2] = c[2][2];
         
         
         set(adj, adx1, adx2, adx3, ady1, ady2, ady3, adz1, adz2, adz3);
         
         if(value==1 || value==-1){
             if(value==-1){
                 adj[0][0] = 0 - adj[0][0];
                 adj[0][1] = 0 - adj[0][1];
                 adj[0][2] = 0 - adj[0][2];
                 adj[1][0] = 0 - adj[1][0];
                 adj[1][1] = 0 - adj[1][1];
                 adj[1][2] = 0 - adj[1][2];
                 adj[2][0] = 0 - adj[2][0];
                 adj[2][1] = 0 - adj[2][1];
                 adj[2][2] = 0 - adj[2][2];  
             }
             set(adj, inx1, inx2, inx3, iny1, iny2, iny3, inz1, inz2, inz3);
             set(adj, in2x1, in2x2, in2x3, in2y1, in2y2, in2y3, in2z1, in2z2, in2z3);
             set2(b, dd1, dd2, dd3);
             
             int[] result = new int[3];
             result[0] = adj[0][0]*b[0] + adj[0][1] * b[1] + adj[0][2] * b[2];
             result[1] = adj[1][0]*b[0] + adj[1][1] * b[1] + adj[1][2] * b[2];
             result[2] = adj[2][0]*b[0] + adj[2][1] * b[1] + adj[2][2] * b[2];
             
             set2(result, ddd1, ddd2, ddd3);
             set2(result, x, y, z);
         }
         
         
         else{
             
             Model[][] model = new Model[3][3];
             if(value>0){
                 for(int i=0;i<3;i++){
                     for(int j=0;j<3;j++){
                          if(adj[i][j]>0)
                              model[i][j] = new Model(adj[i][j], value, true);
                          else if(adj[i][j]==0)
                              model[i][j] = new Model(adj[i][j], 1, true);
                          else
                              model[i][j] = new Model(0-adj[i][j], value, false);
                     }
                 }
             }
             else{
                  for(int i=0;i<3;i++){
                     for(int j=0;j<3;j++){
                          if(adj[i][j]>0)
                              model[i][j] = new Model(adj[i][j], 0-value, false);
                          else if(adj[i][j]==0)
                              model[i][j] = new Model(adj[i][j], 1, true);
                          else
                              model[i][j] = new Model(0-adj[i][j], 0-value, true);
                     }
                 }
             }
             
              print(model);
             
             devide(model);
             set4(model);
             
             print(model);
             
             for(int i=0;i<3;i++){
                 for(int j=0;j<3;j++){
                     if(b[j]>0)
                     model[i][j].upper *= b[j];
                     else{
                         if(model[i][j].positive==true)
                             model[i][j].positive=false;
                         else
                             model[i][j].positive=true; 
                          model[i][j].upper *= 0-b[j];
                         
                         
                     }
                 }
             }
             
             print(model);
             
              devide(model);
              
               print(model);
              for(int i=0;i<3;i++){
                  for(int j=0;j<3;j++){
                      if(model[i][j].upper==0){
                          model[i][j].lower=1;
                          model[i][j].positive=true;
                      }
                  }
              }
              
              
               print(model);
              
              
              
              Model[] model2 = new Model[3];
              model2[0] = new Model();
              model2[1] = new Model();
              model2[2] = new Model();
             
              model2[0].lower = lcm(lcm(model[0][0].lower,model[0][1].lower),model[0][2].lower);
              model2[1].lower = lcm(lcm(model[1][0].lower,model[1][1].lower),model[1][2].lower);
              model2[2].lower = lcm(lcm(model[2][0].lower,model[2][1].lower),model[2][2].lower);
              
              
              int x,y,z,result;
              //start
              x = (model2[0].lower /model[0][0].lower) * model[0][0].upper;
              if(model[0][0].positive==false){
                  x = 0-x;
              }
          
               y = (model2[0].lower /model[0][1].lower) * model[0][1].upper;
               if(model[0][1].positive==false){
                  y = 0-y;
              }
             
               z = (model2[0].lower /model[0][2].lower) * model[0][2].upper;
               if(model[0][2].positive==false){
                  z = 0-z;
              }
              
               
               result = x+y+z;
               //System.out.println("x = " + x + " y = "+y + "  z = "+z);
              if(result>0){
                  model2[0].upper=result;
                  model2[0].positive=true;
              }
              else{
                  model2[0].upper=0-result;
                  model2[0].positive=false;
              }
              //end
              
              
              
              
              //start
              x = (model2[1].lower /model[1][0].lower) * model[1][0].upper;
              if(model[1][0].positive==false){
                  x = 0-x;
              }
             
               y = (model2[1].lower /model[1][1].lower) * model[1][1].upper;
               if(model[1][1].positive==false){
                  y = 0-y;
              }
             
               z = (model2[1].lower /model[1][2].lower) * model[1][2].upper;
               if(model[1][2].positive==false){
                  z = 0-z;
              }
              
               
               result = x+y+z;
               //System.out.println("x = " + x + " y = "+y + "  z = "+z);
              if(result>0){
                  model2[1].upper=result;
                  model2[1].positive=true;
              }
              else{
                  model2[1].upper=0-result;
                  model2[1].positive=false;
              }
              //end
              
              
              
              
              
              
              
              
              
              
              //start
               x = (model2[2].lower /model[2][0].lower) * model[2][0].upper;
              if(model[2][0].positive==false){
                  x = 0-x;
              }
              
              y = (model2[2].lower /model[2][1].lower) * model[2][1].upper;
               if(model[2][1].positive==false){
                  y = 0-y;
              }
             
               z = (model2[2].lower /model[2][2].lower) * model[2][2].upper; 
               if(model[2][2].positive==false){
                  z = 0-z;
              }
              
               result = x+y+z;
               //System.out.println("x = " + x + " y = "+y + "  z = "+z);
              if(result>0){
                  model2[2].upper=result;
                  model2[2].positive=true;
              }
              else{
                  model2[2].upper=0-result;
                  model2[2].positive=false;
              }
              //end
              
              
              
              set5(model2);
              print(model2);
              
              
              
              
              
              
         }
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reset();
       // scroll.setVisible(false);
     mainpanel.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ty2ActionPerformed

    private void td2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_td2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_td2ActionPerformed

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
    private javax.swing.JLabel adx1;
    private javax.swing.JLabel adx2;
    private javax.swing.JLabel adx3;
    private javax.swing.JLabel ady1;
    private javax.swing.JLabel ady2;
    private javax.swing.JLabel ady3;
    private javax.swing.JLabel adz1;
    private javax.swing.JLabel adz2;
    private javax.swing.JLabel adz3;
    private javax.swing.JLabel cx1;
    private javax.swing.JLabel cx2;
    private javax.swing.JLabel cx3;
    private javax.swing.JLabel cy1;
    private javax.swing.JLabel cy2;
    private javax.swing.JLabel cy3;
    private javax.swing.JLabel cz1;
    private javax.swing.JLabel cz2;
    private javax.swing.JLabel cz3;
    private javax.swing.JLabel dd1;
    private javax.swing.JLabel dd2;
    private javax.swing.JLabel dd3;
    private javax.swing.JLabel ddd1;
    private javax.swing.JLabel ddd2;
    private javax.swing.JLabel ddd3;
    private javax.swing.JLabel in2x1;
    private javax.swing.JLabel in2x2;
    private javax.swing.JLabel in2x3;
    private javax.swing.JLabel in2y1;
    private javax.swing.JLabel in2y2;
    private javax.swing.JLabel in2y3;
    private javax.swing.JLabel in2z1;
    private javax.swing.JLabel in2z2;
    private javax.swing.JLabel in2z3;
    private javax.swing.JLabel inx1;
    private javax.swing.JLabel inx2;
    private javax.swing.JLabel inx3;
    private javax.swing.JLabel iny1;
    private javax.swing.JLabel iny2;
    private javax.swing.JLabel iny3;
    private javax.swing.JLabel inz1;
    private javax.swing.JLabel inz2;
    private javax.swing.JLabel inz3;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel l111;
    private javax.swing.JLabel l112;
    private javax.swing.JLabel l113;
    private javax.swing.JLabel l114;
    private javax.swing.JLabel l115;
    private javax.swing.JLabel l116;
    private javax.swing.JLabel l117;
    private javax.swing.JLabel l118;
    private javax.swing.JLabel l120;
    private javax.swing.JLabel l121;
    private javax.swing.JLabel l123;
    private javax.swing.JLabel l124;
    private javax.swing.JLabel l126;
    private javax.swing.JLabel l127;
    private javax.swing.JLabel l129;
    private javax.swing.JLabel l130;
    private javax.swing.JLabel l132;
    private javax.swing.JLabel l133;
    private javax.swing.JLabel l135;
    private javax.swing.JLabel l136;
    private javax.swing.JLabel l137;
    private javax.swing.JLabel l138;
    private javax.swing.JLabel l140;
    private javax.swing.JLabel l141;
    private javax.swing.JLabel l143;
    private javax.swing.JLabel l144;
    private javax.swing.JLabel l146;
    private javax.swing.JLabel l147;
    private javax.swing.JLabel l149;
    private javax.swing.JLabel l150;
    private javax.swing.JLabel l151;
    private javax.swing.JLabel l152;
    private javax.swing.JLabel l153;
    private javax.swing.JLabel l154;
    private javax.swing.JLabel l155;
    private javax.swing.JLabel l156;
    private javax.swing.JLabel l157;
    private javax.swing.JLabel l158;
    private javax.swing.JLabel l159;
    private javax.swing.JLabel l160;
    private javax.swing.JLabel l161;
    private javax.swing.JLabel ld1;
    private javax.swing.JLabel ld2;
    private javax.swing.JLabel ld3;
    private javax.swing.JLabel lx1;
    private javax.swing.JLabel lx2;
    private javax.swing.JLabel lx3;
    private javax.swing.JLabel ly1;
    private javax.swing.JLabel ly2;
    private javax.swing.JLabel ly3;
    private javax.swing.JLabel lz1;
    private javax.swing.JLabel lz2;
    private javax.swing.JLabel lz3;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel p1a;
    private javax.swing.JLabel p1b;
    private javax.swing.JLabel p1c;
    private javax.swing.JLabel p1d;
    private javax.swing.JLabel p1label;
    private javax.swing.JLabel p2a;
    private javax.swing.JLabel p2b;
    private javax.swing.JLabel p2c;
    private javax.swing.JLabel p2d;
    private javax.swing.JLabel p2label;
    private javax.swing.JLabel p2x28;
    private javax.swing.JLabel p2x4;
    private javax.swing.JLabel p2x6;
    private javax.swing.JLabel p2x7;
    private javax.swing.JLabel p2x8;
    private javax.swing.JLabel p2y28;
    private javax.swing.JLabel p2y4;
    private javax.swing.JLabel p2y6;
    private javax.swing.JLabel p2y7;
    private javax.swing.JLabel p2y8;
    private javax.swing.JLabel p2z28;
    private javax.swing.JLabel p2z4;
    private javax.swing.JLabel p2z6;
    private javax.swing.JLabel p2z7;
    private javax.swing.JLabel p2z8;
    private javax.swing.JLabel p3a;
    private javax.swing.JLabel p3b;
    private javax.swing.JLabel p3c;
    private javax.swing.JLabel p3d;
    private javax.swing.JLabel p3label;
    private javax.swing.JLabel p4a;
    private javax.swing.JPanel p4adasasd;
    private javax.swing.JLabel p4b;
    private javax.swing.JLabel p4c;
    private javax.swing.JLabel p4d;
    private javax.swing.JLabel p4label;
    private javax.swing.JLabel p5a;
    private javax.swing.JLabel p5b;
    private javax.swing.JLabel p5c;
    private javax.swing.JLabel p5d;
    private javax.swing.JLabel p5label;
    private javax.swing.JLabel p6a;
    private javax.swing.JLabel p6b;
    private javax.swing.JLabel p6c;
    private javax.swing.JLabel p6d;
    private javax.swing.JLabel p6label;
    private javax.swing.JLabel p7a;
    private javax.swing.JLabel p7b;
    private javax.swing.JLabel p7c;
    private javax.swing.JLabel p7d;
    private javax.swing.JLabel p7label;
    private javax.swing.JLabel p8a;
    private javax.swing.JLabel p8b;
    private javax.swing.JLabel p8c;
    private javax.swing.JLabel p8d;
    private javax.swing.JLabel p8label;
    private javax.swing.JLabel p9a;
    private javax.swing.JLabel p9b;
    private javax.swing.JLabel p9c;
    private javax.swing.JLabel p9d;
    private javax.swing.JLabel p9label;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel12;
    private javax.swing.JPanel panel13;
    private javax.swing.JPanel panel14;
    private javax.swing.JPanel panel15;
    private javax.swing.JPanel panel16;
    private javax.swing.JPanel panel18;
    private javax.swing.JPanel panel19;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel20;
    private javax.swing.JPanel panel21;
    private javax.swing.JPanel panel22;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JScrollPane scroll;
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
    private javax.swing.JLabel valueofa;
    private javax.swing.JLabel x;
    private javax.swing.JLabel y;
    private javax.swing.JLabel z;
    // End of variables declaration//GEN-END:variables
  void print(Model[][] model){
      
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              if(model[i][j].positive==false)
                  System.out.print("-");
              System.out.print(model[i][j].upper + "/" + model[i][j].lower + "   ");
          }System.out.println("");
      }
      
      System.out.println("\n");
      
  }
  void print(Model[] model){
      for(int i=0;i<3;i++){
          if(model[i].positive==false)
                  System.out.print("-");
              System.out.print(model[i].upper + "/" + model[i].lower + "   ");
      }
      System.out.println("");
  }
    int lcm(int a, int b) 
    { 
        int greater = Math.max(a, b); 
        int smallest = Math.min(a, b); 
        for (int i = greater;; i += greater) { 
            if (i % smallest == 0) 
                return i; 
        } 
    } 
    
    
    void devide(Model[][] model){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(model[i][j].upper==model[i][j].lower){
                    model[i][j].upper=model[i][j].lower=1;
                }
                else{
                   int[] a = {Math.min(model[i][j].upper,model[i][j].lower ),Math.max(model[i][j].upper,model[i][j].lower )};
                    div(a);
                    if(a[0]>a[1]){
                        int t = a[0];
                        a[0]=a[1];
                        a[1]=t;
                    }
                    
                    if(model[i][j].upper<model[i][j].lower){
                         model[i][j].upper=a[0];
                         model[i][j].lower=a[1];
                    }
                    else{
                         model[i][j].upper=a[1];
                         model[i][j].lower=a[0];
                    }
                }
            }
        }
    }
    void div(int[] arr){
        int a= Math.min(arr[0], arr[1]);
         int b= Math.max(arr[0], arr[1]);
        for(int i=2;i<=a;i++){
            if(a%i==0 && b%i==0){
                arr[0] = a/i;
                arr[1] = b/i;
                div(arr);
                break;
            }
        }
    }
 
    void set(int[][] a, JLabel x1, JLabel x2,JLabel x3,JLabel y1,JLabel y2,JLabel y3,JLabel z1,JLabel z2,JLabel z3){
     x1.setText(Integer.toString(a[0][0]));
     x2.setText(Integer.toString(a[0][1]));
     x3.setText(Integer.toString(a[0][2]));
     y1.setText(Integer.toString(a[1][0]));
     y2.setText(Integer.toString(a[1][1]));
     y3.setText(Integer.toString(a[1][2]));
     z1.setText(Integer.toString(a[2][0]));
     z2.setText(Integer.toString(a[2][1]));
     z3.setText(Integer.toString(a[2][2]));
 }
     
 void set2(int [] a, JLabel d1, JLabel d2, JLabel d3){
     d1.setText(Integer.toString(a[0]));
      d2.setText(Integer.toString(a[1]));
       d3.setText(Integer.toString(a[2]));
 }
 void set3(int aa, int bb, int cc, int dd, JLabel a, JLabel b, JLabel c, JLabel d, JLabel label, String s){
     a.setText(Integer.toString(aa));
     b.setText(Integer.toString(bb));
     c.setText(Integer.toString(cc));
     d.setText(Integer.toString(dd));
     label.setText(s);
 }
 void set5(Model[] model){
     JLabel[] label1 = {ddd1,ddd2,ddd3};
     JLabel[] label2 = {x,y,z};
     for(int i=0;i<3;i++){
                    if(model[i].upper==0){
                  label1[i].setText("0");
                  label2[i].setText("0");
              }
              else if(model[i].lower==1){
                  if(model[i].positive==true){
                      label1[i].setText(Integer.toString(model[i].upper) );
                      label2[i].setText(Integer.toString(model[i].upper) );
                  }
                  else{
                       label1[i].setText("- "+Integer.toString(model[i].upper) );
                      label2[i].setText("- "+Integer.toString(model[i].upper) );
                  }
              }
              else{
                  if(model[i].positive==true){
                      label1[i].setText(Integer.toString(model[i].upper) + "/" + Integer.toString(model[i].lower));
                      label2[i].setText(Integer.toString(model[i].upper) + "/" + Integer.toString(model[i].lower));
                  }
                  else{
                       label1[i].setText("- "+Integer.toString(model[i].upper) + "/" + Integer.toString(model[i].lower));
                      label2[i].setText("- "+Integer.toString(model[i].upper) + "/" + Integer.toString(model[i].lower));
                  }
              }
     }
 }
  void set4(Model[][] model){
      JLabel[][] label1 = {{inx1,inx2,inx3},{iny1, iny2, iny3},{inz1,inz2,inz3}};
      JLabel[][] label2 = {{in2x1,in2x2,in2x3},{in2y1, in2y2, in2y3},{in2z1,in2z2,in2z3}};
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              if(model[i][j].upper==0){
                  label1[i][j].setText("0");
                  label2[i][j].setText("0");
              }
              else if(model[i][j].lower==1){
                  if(model[i][j].positive==true){
                      label1[i][j].setText(Integer.toString(model[i][j].upper) );
                      label2[i][j].setText(Integer.toString(model[i][j].upper) );
                  }
                  else{
                       label1[i][j].setText("- "+Integer.toString(model[i][j].upper) );
                      label2[i][j].setText("- "+Integer.toString(model[i][j].upper) );
                  }
              }
              else{
                  if(model[i][j].positive==true){
                      label1[i][j].setText(Integer.toString(model[i][j].upper) + "/" + Integer.toString(model[i][j].lower));
                      label2[i][j].setText(Integer.toString(model[i][j].upper) + "/" + Integer.toString(model[i][j].lower));
                  }
                  else{
                       label1[i][j].setText("- "+Integer.toString(model[i][j].upper) + "/" + Integer.toString(model[i][j].lower));
                      label2[i][j].setText("- "+Integer.toString(model[i][j].upper) + "/" + Integer.toString(model[i][j].lower));
                  }
              }
          }
      }
      
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
    
     mainpanel.setVisible(false);
    
     
 }
}
    
    
class Model{
    int upper,lower;
    boolean positive;

    public Model(int upper, int lower, boolean positive) {
        this.upper = upper;
        this.lower = lower;
        this.positive = positive;
    }
    Model(){}
    
}
