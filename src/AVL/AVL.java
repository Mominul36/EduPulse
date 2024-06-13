package AVL;


import raven.application.form.other.*;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import raven.toast.Notifications;

/**
 *
 * @author Raven
 */
public class AVL extends javax.swing.JPanel {

     private SimulatorTreeBinary simulador = new SimulatorTreeBinary();
     ArrayList<JTextField> text; 
    public AVL() {
        initComponents();
        this.btnprint.setEnabled(false);
       /* lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");*/
       initialize();
    }
    
    void initialize(){
       text = new ArrayList<>();
       text.add(t1);
       text.add(t2);
       text.add(t3);
       text.add(t4);
       text.add(t5);
       text.add(t6);
       text.add(t7);
       text.add(t8);
       text.add(t9);
       text.add(t10);
       text.add(t11);
       text.add(t12);
       text.add(t13);
       text.add(t14);
       text.add(t15);
       text.add(t16);
       text.add(t17);
       text.add(t18);
       text.add(t19);
       text.add(t20);
        text.add(t21);
        
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktoppanel = new javax.swing.JDesktopPane();
        internalframe = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        txtinsert = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        txtdelete = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        btngenerate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblpre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblpost = new javax.swing.JLabel();
        btnprint1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        t14 = new javax.swing.JTextField();
        t15 = new javax.swing.JTextField();
        t16 = new javax.swing.JTextField();
        t17 = new javax.swing.JTextField();
        t18 = new javax.swing.JTextField();
        t19 = new javax.swing.JTextField();
        t20 = new javax.swing.JTextField();
        t21 = new javax.swing.JTextField();

        desktoppanel.setOpaque(false);

        internalframe.setIconifiable(true);
        internalframe.setMaximizable(true);
        internalframe.setResizable(true);
        internalframe.setEnabled(false);
        internalframe.setFocusCycleRoot(false);
        internalframe.setVisible(true);

        javax.swing.GroupLayout internalframeLayout = new javax.swing.GroupLayout(internalframe.getContentPane());
        internalframe.getContentPane().setLayout(internalframeLayout);
        internalframeLayout.setHorizontalGroup(
            internalframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        internalframeLayout.setVerticalGroup(
            internalframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        desktoppanel.add(internalframe);
        internalframe.setBounds(0, 10, 980, 460);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("    Adelson-Velsky and Landis (AVL) Tree");

        txtinsert.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtinsert.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinsertActionPerformed(evt);
            }
        });
        txtinsert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinsertKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtinsertKeyTyped(evt);
            }
        });

        btninsert.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        txtdelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtdelete.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeleteActionPerformed(evt);
            }
        });
        txtdelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdeleteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdeleteKeyTyped(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnprint.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        btngenerate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btngenerate.setText("Generate");
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Preorder =");

        lblpre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Inorder =");

        lblin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Postorder = ");

        lblpost.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btnprint1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnprint1.setText("Reset");
        btnprint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprint1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 0), 1, true));
        jPanel2.setLayout(new java.awt.GridLayout());

        t1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t1.setPreferredSize(new java.awt.Dimension(36, 36));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jPanel2.add(t1);

        t2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t2.setPreferredSize(new java.awt.Dimension(36, 36));
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        jPanel2.add(t2);

        t3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t3.setPreferredSize(new java.awt.Dimension(36, 36));
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        jPanel2.add(t3);

        t4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t4.setPreferredSize(new java.awt.Dimension(36, 36));
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t4KeyTyped(evt);
            }
        });
        jPanel2.add(t4);

        t5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t5.setPreferredSize(new java.awt.Dimension(36, 36));
        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });
        jPanel2.add(t5);

        t6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t6.setPreferredSize(new java.awt.Dimension(36, 36));
        t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t6KeyTyped(evt);
            }
        });
        jPanel2.add(t6);

        t7.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t7.setPreferredSize(new java.awt.Dimension(36, 36));
        t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t7KeyTyped(evt);
            }
        });
        jPanel2.add(t7);

        t8.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t8.setPreferredSize(new java.awt.Dimension(36, 36));
        t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t8KeyTyped(evt);
            }
        });
        jPanel2.add(t8);

        t9.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t9.setPreferredSize(new java.awt.Dimension(36, 36));
        t9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t9KeyTyped(evt);
            }
        });
        jPanel2.add(t9);

        t10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t10.setPreferredSize(new java.awt.Dimension(36, 36));
        t10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t10KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t10KeyTyped(evt);
            }
        });
        jPanel2.add(t10);

        t11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t11.setPreferredSize(new java.awt.Dimension(36, 36));
        t11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t11KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t11KeyTyped(evt);
            }
        });
        jPanel2.add(t11);

        t12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t12.setPreferredSize(new java.awt.Dimension(36, 36));
        t12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t12KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t12KeyTyped(evt);
            }
        });
        jPanel2.add(t12);

        t13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t13.setPreferredSize(new java.awt.Dimension(36, 36));
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });
        t13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t13KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t13KeyTyped(evt);
            }
        });
        jPanel2.add(t13);

        t14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t14.setPreferredSize(new java.awt.Dimension(36, 36));
        t14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t14KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t14KeyTyped(evt);
            }
        });
        jPanel2.add(t14);

        t15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t15.setPreferredSize(new java.awt.Dimension(36, 36));
        t15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t15KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t15KeyTyped(evt);
            }
        });
        jPanel2.add(t15);

        t16.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t16.setPreferredSize(new java.awt.Dimension(36, 36));
        t16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t16KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t16KeyTyped(evt);
            }
        });
        jPanel2.add(t16);

        t17.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t17.setPreferredSize(new java.awt.Dimension(36, 36));
        t17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t17KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t17KeyTyped(evt);
            }
        });
        jPanel2.add(t17);

        t18.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t18.setPreferredSize(new java.awt.Dimension(36, 36));
        t18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t18KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t18KeyTyped(evt);
            }
        });
        jPanel2.add(t18);

        t19.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t19.setPreferredSize(new java.awt.Dimension(36, 36));
        t19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t19KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t19KeyTyped(evt);
            }
        });
        jPanel2.add(t19);

        t20.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t20.setPreferredSize(new java.awt.Dimension(36, 36));
        t20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t20KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t20KeyTyped(evt);
            }
        });
        jPanel2.add(t20);

        t21.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        t21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        t21.setPreferredSize(new java.awt.Dimension(36, 36));
        t21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t21KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t21KeyTyped(evt);
            }
        });
        jPanel2.add(t21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktoppanel)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(715, 715, 715)
                        .addComponent(btngenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtinsert, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btninsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnprint)
                        .addGap(18, 18, 18)
                        .addComponent(btnprint1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblpost, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblpre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblin, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 285, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtinsert)
                        .addComponent(btninsert, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtdelete)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnprint, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(btnprint1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addComponent(btndelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5)
                .addComponent(btngenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktoppanel, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(611, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinsertActionPerformed

    private void txtdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeleteActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
       if(!txtinsert.getText().toString().matches("")){
           try {
            int data = Integer.parseInt(txtinsert.getText());
            if (this.simulador.insert(data)) {
                
                btnprint.setEnabled(true);
                
                complementos();
                removeorder();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The data could not be inserted", "Try again...", 0);

        }
       }
        txtinsert.setText("");
        

    }//GEN-LAST:event_btninsertActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
         String pre = simulador.preorder();
        String in = simulador.inorder();
         String post = simulador.postorder();
         
          lblpre.setText("");
         lblin.setText("");
         lblpost.setText("");
         lblpre.setText(pre);
         lblin.setText(in);
         lblpost.setText(post);
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnprint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprint1ActionPerformed
         simulador.setroot(null);
         complementos();
         lblpre.setText("");
           lblin.setText("");
             lblpost.setText("");
             for(int j=0;j<text.size();j++){
                    text.get(j).setText("");
                }
             txtinsert.setText("");
             txtdelete.setText("");
    }//GEN-LAST:event_btnprint1ActionPerformed

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
          simulador.setroot(null);
        for(int i=0;i<text.size();i++){
              String s = text.get(i).getText().toString();
              if(!s.matches("")){
                  try {
            int data = Integer.parseInt(s);
            if (this.simulador.insert(data)) {
                
                btnprint.setEnabled(true);
                
                complementos();
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The data could not be inserted", "Try again...", 0);

        }
              }
          }  
        removeorder();
                for(int j=0;j<text.size();j++){
                    text.get(j).setText("");
                }
    }//GEN-LAST:event_btngenerateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       String s = txtdelete.getText().toString();
       if(!s.matches("")){
           try {
               int data = Integer.parseInt(s);
               this.simulador.erase(data);
               if(simulador.getRoot()==null){
                   btnprint.setEnabled(false);
               }
                complementos();
                removeorder();
                
           } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "The data could not be deleted", "Try again...", 0);
           }
       }
       txtdelete.setText("");
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtinsertKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinsertKeyTyped
       if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }//GEN-LAST:event_txtinsertKeyTyped

    private void txtdeleteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdeleteKeyTyped
 if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeleteKeyTyped

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t21.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t2.requestFocus();
    }//GEN-LAST:event_t1KeyPressed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t1KeyTyped

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t1.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t3.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t2KeyPressed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t2KeyTyped

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t2.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t4.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t3KeyPressed

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t3KeyTyped

    private void t4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t3.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t5.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t4KeyPressed

    private void t4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t4KeyTyped

    private void t5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t4.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t6.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t5KeyPressed

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t5KeyTyped

    private void t6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t5.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t7.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t6KeyPressed

    private void t6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t6KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t6KeyTyped

    private void t7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t7KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t6.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t8.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t7KeyPressed

    private void t7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t7KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t7KeyTyped

    private void t8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t8KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t7.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t9.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t8KeyPressed

    private void t8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t8KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t8KeyTyped

    private void t9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t9KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t8.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t10.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_t9KeyPressed

    private void t9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t9KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t9KeyTyped

    private void t10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t10KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t9.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t11.requestFocus();
    }//GEN-LAST:event_t10KeyPressed

    private void t10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t10KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t10KeyTyped

    private void t11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t11KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t10.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t12.requestFocus();
    }//GEN-LAST:event_t11KeyPressed

    private void t11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t11KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t11KeyTyped

    private void t12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t12KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t11.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t13.requestFocus();
    }//GEN-LAST:event_t12KeyPressed

    private void t12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t12KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t12KeyTyped

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void t13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t13KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t12.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t14.requestFocus();
    }//GEN-LAST:event_t13KeyPressed

    private void t13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t13KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t13KeyTyped

    private void t14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t14KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t13.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t15.requestFocus();
    }//GEN-LAST:event_t14KeyPressed

    private void t14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t14KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t14KeyTyped

    private void t15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t15KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t14.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t16.requestFocus();
    }//GEN-LAST:event_t15KeyPressed

    private void t15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t15KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t15KeyTyped

    private void t16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t16KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t15.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t17.requestFocus();
    }//GEN-LAST:event_t16KeyPressed

    private void t16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t16KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t16KeyTyped

    private void t17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t17KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t16.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t18.requestFocus();
    }//GEN-LAST:event_t17KeyPressed

    private void t17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t17KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t17KeyTyped

    private void t18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t18KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t17.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t19.requestFocus();
    }//GEN-LAST:event_t18KeyPressed

    private void t18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t18KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t18KeyTyped

    private void t19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t19KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t18.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t20.requestFocus();
    }//GEN-LAST:event_t19KeyPressed

    private void t19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t19KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t19KeyTyped

    private void t20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t20KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t19.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t21.requestFocus();
    }//GEN-LAST:event_t20KeyPressed

    private void t20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t20KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t20KeyTyped

    private void t21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t21KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        t20.requestFocus();
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        t1.requestFocus();

    }//GEN-LAST:event_t21KeyPressed

    private void t21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t21KeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_t21KeyTyped

    private void txtinsertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinsertKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(!txtinsert.getText().toString().matches("")){
           try {
            int data = Integer.parseInt(txtinsert.getText());
            if (this.simulador.insert(data)) {
                
                btnprint.setEnabled(true);
                
                complementos();
                removeorder();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "The data could not be inserted", "Try again...", 0);

        }
       }
        txtinsert.setText("");
        txtinsert.requestFocus();
      }
    }//GEN-LAST:event_txtinsertKeyPressed

    private void txtdeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdeleteKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           String s = txtdelete.getText().toString();
       if(!s.matches("")){
           try {
               int data = Integer.parseInt(s);
               this.simulador.erase(data);
               if(simulador.getRoot()==null){
                   btnprint.setEnabled(false);
               }
                complementos();
                removeorder();
                
           } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "The data could not be deleted", "Try again...", 0);
           }
       }
       txtdelete.setText("");
       txtdelete.requestFocus();
      }
    }//GEN-LAST:event_txtdeleteKeyPressed

    
    public void complementos(){
        this.repintarArbol();
    }
    private void repintarArbol() {
        this.desktoppanel.removeAll();
        Rectangle tamaño = this.internalframe.getBounds();
        this.internalframe = null;
        this.internalframe = new JInternalFrame("Graphic representation", true);
        this.desktoppanel.add(this.internalframe, JLayeredPane.DEFAULT_LAYER);
        this.internalframe.setVisible(true);
        this.internalframe.setBounds(tamaño);
        this.internalframe.setEnabled(false);
        this.internalframe.add(this.simulador.getDrawing(), BorderLayout.CENTER);
    }
    
    void removeorder(){
          lblpre.setText("");
         lblin.setText("");
         lblpost.setText("");

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnprint1;
    private javax.swing.JDesktopPane desktoppanel;
    private javax.swing.JInternalFrame internalframe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblin;
    private javax.swing.JLabel lblpost;
    private javax.swing.JLabel lblpre;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t18;
    private javax.swing.JTextField t19;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t20;
    private javax.swing.JTextField t21;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JTextField txtdelete;
    private javax.swing.JTextField txtinsert;
    // End of variables declaration//GEN-END:variables
}
