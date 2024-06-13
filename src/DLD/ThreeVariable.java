package DLD;

import raven.application.form.other.*;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import raven.toast.Notifications;
import java.awt.GridLayout;
import java.util.Comparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.accessibility.AccessibleRole;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ThreeVariable extends javax.swing.JPanel {
   
    int point;
    String a,b,c;
    ArrayList<ArrayList<Integer>> g;
    ArrayList<JPanel> panelarr;
    ArrayList<JLabel> label;
    public ThreeVariable() {
        initComponents();
        point = menuterm.getSelectedIndex();
        clear();
         label = new ArrayList<>();
        label.add(l0);
         label.add(l1);
         label.add(l3);
         label.add(l2);
         label.add(l4);
         label.add(l5);
         label.add(l7);
         label.add(l6);
        
        panelarr = new ArrayList<>();
        panelarr.add(panel0);
         panelarr.add(panel1);
          panelarr.add(panel2);
           panelarr.add(panel3);
            panelarr.add(panel4);
             panelarr.add(panel5);
              panelarr.add(panel6);
               panelarr.add(panel7);
                       
      
                       
       /* lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuterm = new javax.swing.JComboBox<>();
        txtterms = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtdc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtvar = new javax.swing.JTextField();
        panelfour = new javax.swing.JPanel();
        panel0 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        l0 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        panel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnsolve = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        adsfadf = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        tablepanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        lblbc = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setOpaque(false);

        menuterm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menuterm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOP / Minterms", "POS / Maxterms" }));
        menuterm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutermActionPerformed(evt);
            }
        });

        txtterms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttermsKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Don't Care");

        txtdc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdcKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Variable");

        txtvar.setText("A,B,C");
        txtvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvarActionPerformed(evt);
            }
        });
        txtvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvarKeyTyped(evt);
            }
        });

        panelfour.setBackground(new java.awt.Color(255, 255, 0));
        panelfour.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        panelfour.setOpaque(false);
        panelfour.setPreferredSize(new java.awt.Dimension(272, 252));

        panel0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel0.setPreferredSize(new java.awt.Dimension(67, 62));
        panel0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel0MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");

        l0.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        l0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel0Layout = new javax.swing.GroupLayout(panel0);
        panel0.setLayout(panel0Layout);
        panel0Layout.setHorizontalGroup(
            panel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel0Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel0Layout.setVerticalGroup(
            panel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel0Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(l0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel4.setPreferredSize(new java.awt.Dimension(67, 62));
        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel4MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("4");

        l4.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8))
        );

        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setPreferredSize(new java.awt.Dimension(67, 62));
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel1MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1");

        l1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );

        panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel5.setPreferredSize(new java.awt.Dimension(67, 62));
        panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel5MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("5");

        l5.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9))
        );

        panel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel7.setPreferredSize(new java.awt.Dimension(67, 62));
        panel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel7MousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("6");

        l7.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10))
        );

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setPreferredSize(new java.awt.Dimension(67, 62));
        panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel2MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("3");

        l2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7))
        );

        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel3.setPreferredSize(new java.awt.Dimension(67, 62));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel3MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("2");

        l3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
        );

        panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel6.setPreferredSize(new java.awt.Dimension(67, 62));
        panel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel6MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("7");

        l6.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17))
        );

        javax.swing.GroupLayout panelfourLayout = new javax.swing.GroupLayout(panelfour);
        panelfour.setLayout(panelfourLayout);
        panelfourLayout.setHorizontalGroup(
            panelfourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfourLayout.createSequentialGroup()
                .addGroup(panelfourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfourLayout.createSequentialGroup()
                        .addComponent(panel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelfourLayout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelfourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(panelfourLayout.createSequentialGroup()
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelfourLayout.createSequentialGroup()
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelfourLayout.setVerticalGroup(
            panelfourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfourLayout.createSequentialGroup()
                .addGroup(panelfourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelfourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelfourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelfourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnsolve.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnsolve.setText("Solve");
        btnsolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsolveActionPerformed(evt);
            }
        });

        btnreset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btninsert.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        adsfadf.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        adsfadf.setText("Simplified Form = ");

        result.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        tabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Group ", "Term"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tabel.setOpaque(false);
        tabel.setSelectionBackground(new java.awt.Color(255, 153, 0));
        tabel.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Or, Single Click for Maxterm/Minterm");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("And, Double Click for Don't Care");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("0");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("00");

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("01");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("11");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("10");

        lbla.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbla.setText("A");

        lblbc.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblbc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbc.setText("BC");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(adsfadf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuterm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnsolve, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtterms, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(98, 98, 98)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblbc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(41, 41, 41)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(46, 46, 46)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(panelfour, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtvar, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(232, 232, 232)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbla, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(282, 282, 282)
                    .addComponent(jLabel30)
                    .addContainerGap(866, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuterm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtterms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(txtvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lbla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel25)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblbc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel27)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel28))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsolve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adsfadf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(panelfour, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(462, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(181, 181, 181)))
        );

        panelfour.setLayout(new GridLayout(4,4));
    }// </editor-fold>//GEN-END:initComponents

    private void txtvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvarActionPerformed

    private void btnsolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsolveActionPerformed
    
        ArrayList<Integer> terms = new ArrayList<>();
        ArrayList<Integer> dc = new ArrayList<>();
        
         
         for(int i=0;i<label.size();i++){
             if(label.get(i).getText().toString().matches("1") || label.get(i).getText().toString().matches("0")){
                 terms.add(i);
             }
             else if(label.get(i).getText().toString().matches("X")){
                 dc.add(i);
             }
         }
         if(terms.size()==0){
             JOptionPane.showMessageDialog(new ThreeVariable(), "Empty Input","Warning", JOptionPane.ERROR_MESSAGE);
             return;
         }
         
        threekmapsolver solver = new threekmapsolver(terms, dc);
        ArrayList<ArrayList<Integer>> group = solver.maingroup();
        g = new ArrayList<>();
        g=group;
        
        
        String str = txtvar.getText().toString();
        str+=",";
        String[] s = str.split(",");
        ArrayList<String> f = new ArrayList<>();
        if(s.length==0){
           JOptionPane.showMessageDialog(new ThreeVariable(), "Invalid Varible name","Warning", JOptionPane.ERROR_MESSAGE);
             return; 
        }
        
        for(int i=0;i<s.length;i++){
            String c = s[i].replace(" ","");
            if(c.length()>1){
                JOptionPane.showMessageDialog(new ThreeVariable(), "Variable must be one character","Warning", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            else if(!Character.isAlphabetic(c.charAt(0))){
                 JOptionPane.showMessageDialog(new ThreeVariable(), "Variable must be an Alphabet.","Warning", JOptionPane.ERROR_MESSAGE);
                return;
                
            }
            else{
                f.add(c);
            }
        }
        
        if(f.size()!=3){
            JOptionPane.showMessageDialog(new ThreeVariable(), "Enter three variable","Warning", JOptionPane.ERROR_MESSAGE);
                return;
        }
        
        a = f.get(0);
         b = f.get(1);
          c = f.get(2);
           
           
           
           if(a.matches(b) || a.matches(c)  || b.matches(c)){
               JOptionPane.showMessageDialog(new ThreeVariable(), "Variable must be different","Warning", JOptionPane.ERROR_MESSAGE);
                return;
           }
           
           
           String result = getresult(group, a, b, c,point);
           this.result.setText(result);
           printtable(group);
           
           
         
                       
                   
               
               
               
               
           
        
        
        lbla.setText(a);
        lblbc.setText(b+c);
         tablepanel.setVisible(true);
    }//GEN-LAST:event_btnsolveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
 lbla.setText("A");
        lblbc.setText("BC");     
       clear();
    }//GEN-LAST:event_btnresetActionPerformed

    private void txttermsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttermsKeyTyped
       char c = evt.getKeyChar();
       if(Character.isDigit(c) || c==','){
          
       }
       else {
            evt.consume();
       }
    }//GEN-LAST:event_txttermsKeyTyped

    private void txtdcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdcKeyTyped
        char c = evt.getKeyChar();
       if(Character.isDigit(c) || c==','){
          
       }
       else {
            evt.consume();
       }
    }//GEN-LAST:event_txtdcKeyTyped

    private void txtvarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvarKeyTyped
        char c = evt.getKeyChar();
       if(Character.isAlphabetic(c) || c==','){
          
       }
       else {
            evt.consume();
       }
    }//GEN-LAST:event_txtvarKeyTyped

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
       
        try {
            clear();
            ArrayList<Integer> terms = new ArrayList<>();
         ArrayList<Integer> dc = new ArrayList<>();
         
         String t = txtterms.getText().toString();
         String d = txtdc.getText().toString();
         
         t+= ",";
         d+=",";
         
         String[] s1 = t.split(",");
         String[] s2 = d.split(",");
         
         for(int i=0;i<s1.length;i++){
             if(s1[i]!=""){
                 terms.add(Integer.parseInt(s1[i]));
             }
         }
         
         
         
          for(int i=0;i<s2.length;i++){
             if(s2[i]!=""){
                 dc.add(Integer.parseInt(s2[i]));
             }
         }
          if(terms.size()==0){
              JOptionPane.showMessageDialog(new ThreeVariable(), "Empty Input","Warning",JOptionPane.ERROR_MESSAGE);
              return;
          }
          
          setvalue(terms, dc);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new ThreeVariable(), "Invalid Input","Warning",JOptionPane.ERROR_MESSAGE);
           return;
        }
         
         
         
         
         
        
         
           
        
         
         
         
         
        
        
        
        
    }//GEN-LAST:event_btninsertActionPerformed

    
    
    
    
    private void menutermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutermActionPerformed
         point = menuterm.getSelectedIndex();
         clear();
    }//GEN-LAST:event_menutermActionPerformed

    private void panel0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel0MousePressed
        set(l0, point);
        
    }//GEN-LAST:event_panel0MousePressed

    private void panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MousePressed
            set(l1, point);
        
    }//GEN-LAST:event_panel1MousePressed

    private void panel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MousePressed
       set(l3, point);
    }//GEN-LAST:event_panel3MousePressed

    private void panel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel2MousePressed
       set(l2, point);
    }//GEN-LAST:event_panel2MousePressed

    private void panel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MousePressed
       set(l4, point);
    }//GEN-LAST:event_panel4MousePressed

    private void panel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MousePressed
       set(l5, point);
    }//GEN-LAST:event_panel5MousePressed

    private void panel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel7MousePressed
      set(l7, point);
    }//GEN-LAST:event_panel7MousePressed

    private void panel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel6MousePressed
      set(l6, point);
    }//GEN-LAST:event_panel6MousePressed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
      
        
    }//GEN-LAST:event_tabelMouseClicked


    
    
    
    void printtable(ArrayList<ArrayList<Integer>> group){
         DefaultTableModel tblmodel = (DefaultTableModel)tabel.getModel();
         int rowCount = tblmodel.getRowCount();
//Remove rows one by one from the end of the table
      for (int i = rowCount - 1; i >= 0; i--) {
            tblmodel.removeRow(i);
         }
        for(int i=0;i<group.size();i++){
            ArrayList<Integer> sub = group.get(i);
            String s = "";
            for(int j=0;j<sub.size();j++){
                s+= Integer.toString(sub.get(j))+ ",";
            }
            s = s.substring(0,s.length()-1);
            String[] ss = {"Group "+Integer.toString(i+1), s };
           
            tblmodel.addRow(ss);
        }
        
         
        
        
    }
    
    
     void set(JLabel label, int point){
         if(label.getText().toString().matches("1") || label.getText().toString().matches("0")){
            label.setText("X");
        }
        else if(label.getText().toString().matches("X")){
            label.setText("");
        }
        else{
            if(point==0){
           label.setText("1");
       }
       else{
           label.setText("0");
       }
        }
         
     }
    
    
    void clear(){
         ArrayList<JLabel> label = new ArrayList<>();
         label.add(l0);
         label.add(l1);
         label.add(l2);
         label.add(l3);
         label.add(l4);
         label.add(l5);
         label.add(l6);
         label.add(l7);
         for(int i=0;i<label.size();i++){
             label.get(i).setText("");
         }
         result.setText("");
         tablepanel.setVisible(false);
    }
    
     void setvalue(ArrayList<Integer> a, ArrayList<Integer> b){
 
         if(point==0){
              for(int i=0;i<a.size();i++){
                  label.get(a.get(i)).setText("1");
              }
         }
         else if(point==1){
             for(int i=0;i<a.size();i++){
                  label.get(a.get(i)).setText("0");
              }
         }
         for(int i=0;i<b.size();i++){
                  label.get(b.get(i)).setText("X");
              }
     }
     
     
     
static String getresult(ArrayList<ArrayList<Integer>> group, String a, String b, String c,int point){

   ArrayList<String> temp = new ArrayList<>();
           temp.add("000");
           temp.add("001");
           temp.add("010");
           temp.add("011");
           temp.add("100");
           temp.add("101");
           temp.add("110");
           temp.add("111");
          String result="";


           if(point==0){
             for(int i=0;i<group.size();i++){
               String s = "";
                ArrayList<Integer> subgroup = group.get(i);
                // check for a
                int count=0, count2=0;
                for(int j=0;j<subgroup.size();j++){
                   if(temp.get(subgroup.get(j)).charAt(0)=='1')
                   count++;
                   else if(temp.get(subgroup.get(j)).charAt(0)=='0')
                   count2++;
                }
                if(count==0 && count2==subgroup.size()){
                   s= s + a +"'";
                }
                else if(count==subgroup.size() && count2==0){
                   s= s + a;
                }


                // check for b
                 count=0; count2=0;
                for(int j=0;j<subgroup.size();j++){
                   if(temp.get(subgroup.get(j)).charAt(1)=='1')
                   count++;
                   else if(temp.get(subgroup.get(j)).charAt(1)=='0')
                   count2++;
                }
                if(count==0 && count2==subgroup.size()){
                   s= s + b +"'";
                }
                else if(count==subgroup.size() && count2==0){
                   s= s + b;
                }


                // check for c
                 count=0; count2=0;
                for(int j=0;j<subgroup.size();j++){
                   if(temp.get(subgroup.get(j)).charAt(2)=='1')
                   count++;
                   else if(temp.get(subgroup.get(j)).charAt(2)=='0')
                   count2++;
                }
                if(count==0 && count2==subgroup.size()){
                   s= s + c +"'";
                }
                else if(count==subgroup.size() && count2==0){
                   s= s + c;
                }

                result = result + s + "+";
             }
             result = result.substring(0,result.length()-1);
           }



          else if(point==1){
             for(int i=0;i<group.size();i++){
               String s = "(";
                ArrayList<Integer> subgroup = group.get(i);
                // check for a
                int count=0, count2=0;
                for(int j=0;j<subgroup.size();j++){
                   if(temp.get(subgroup.get(j)).charAt(0)=='1')
                   count++;
                   else if(temp.get(subgroup.get(j)).charAt(0)=='0')
                   count2++;
                }
                if(count==0 && count2==subgroup.size()){
                   s= s + a  + "+";
                }
                else if(count==subgroup.size() && count2==0){
                   s= s + a + "'"+ "+";
                }


                // check for b
                 count=0; count2=0;
                for(int j=0;j<subgroup.size();j++){
                   if(temp.get(subgroup.get(j)).charAt(1)=='1')
                   count++;
                   else if(temp.get(subgroup.get(j)).charAt(1)=='0')
                   count2++;
                }
                if(count==0 && count2==subgroup.size()){
                   s= s + b  + "+";
                }
                else if(count==subgroup.size() && count2==0){
                   s= s + b +"'"+ "+";
                }


                // check for c
                 count=0; count2=0;
                for(int j=0;j<subgroup.size();j++){
                   if(temp.get(subgroup.get(j)).charAt(2)=='1')
                   count++;
                   else if(temp.get(subgroup.get(j)).charAt(2)=='0')
                   count2++;
                }
                if(count==0 && count2==subgroup.size()){
                   s= s + c  + "+";
                }
                else if(count==subgroup.size() && count2==0){
                   s= s + c +"'"+ "+";
                }

                s = s.substring(0,s.length()-1);
                s=s+")";
                result = result + s;
             }
             
           }
   return result;
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adsfadf;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsolve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l0;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblbc;
    private javax.swing.JComboBox<String> menuterm;
    private javax.swing.JPanel panel0;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panelfour;
    private javax.swing.JLabel result;
    private javax.swing.JTable tabel;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JTextField txtdc;
    private javax.swing.JTextField txtterms;
    private javax.swing.JTextField txtvar;
    // End of variables declaration//GEN-END:variables
}



class threekmapsolver{

    static ArrayList<kmap>  map;


    threekmapsolver(ArrayList<Integer> terms , ArrayList<Integer> dc){
      map = new ArrayList<>();

      for(int i=0;i<8;i++){
         kmap m = new kmap();
         m.value = 0;
         m.group = false;
         map.add(m);
      }
      for(int i=0;i<terms.size();i++){
         map.get(terms.get(i)).value=1;
      }
       for(int i=0;i<dc.size();i++){
         map.get(dc.get(i)).value=2;
      }
    }


static ArrayList<Model> check(ArrayList<Model> model){

      for(int i=0;i<model.size();i++){
         model.get(i).total = notgroup(model.get(i).arr);
      }
   return model;
}

 static boolean isgroup(ArrayList<Integer> a){
   int c=0;
   for(int i=0;i<a.size();i++){
      if(map.get(a.get(i)).value==1 && map.get(a.get(i)).group==false)
      c++;
      if(map.get(a.get(i)).value==0)
         return false;
   }
   if(c>0)
   return true;
   return false;
 }

  static int notgroup(ArrayList<Integer> a){
    int c=0;
    for(int i=0;i<a.size();i++){
      if(map.get(a.get(i)).value==1 && map.get(a.get(i)).group==false)
      c++;
    }
    return c;
 }

  static void makegroup(ArrayList<Integer> a){
   for(int i=0;i<a.size();i++){
      map.get(a.get(i)).group=true;
   }
 }


  ArrayList<ArrayList<Integer>> maingroup(){
   ArrayList<ArrayList<Integer>> group = new ArrayList<>();
   ArrayList<Integer> a;
   ArrayList<Model>  model;
   Model m;


    //for group by 8
      a = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7));
      if(isgroup(a)==true){
          group.add(a);
          return group;
      }

      // for group by 4 original 
      model = new ArrayList<>();

      a = new ArrayList<>(Arrays.asList(0,1,2,3));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }


      a = new ArrayList<>(Arrays.asList(4,5,6,7));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }


      a = new ArrayList<>(Arrays.asList(0,1,4,5));
     if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(1,3,5,7));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }


      a = new ArrayList<>(Arrays.asList(2,3,6,7));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }


	     // for group by 4 folding 
      a = new ArrayList<>(Arrays.asList(0,2,4,6));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }


 Collections.sort(model, new sortItems());



      while(model.size()!=0){
      
          Collections.sort(model, new sortItems());
          if(isgroup(model.get(0).arr)==true){
             group.add(model.get(0).arr);
             makegroup(model.get(0).arr);
             model.remove(0);
             model = check(model);  
          }
          else{
             model.remove(0);
          }  
      }






      // for group by 2 original 
      model = new ArrayList<>();

      a = new ArrayList<>(Arrays.asList(0,4));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(1,5));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(3,7));
     if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(2,6));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(0,1));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(1,3));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(2,3));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(4,5));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(5,7));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(6,7));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }


	     // for group by 2 folding 
      a = new ArrayList<>(Arrays.asList(0,2));
      if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }

      a = new ArrayList<>(Arrays.asList(4,6));
     if(isgroup(a)){
         m = new Model(a,notgroup(a));
         model.add(m);
      }


     while(model.size()!=0){
          Collections.sort(model, new sortItems());
          if(isgroup(model.get(0).arr)==true){
             group.add(model.get(0).arr);
             makegroup(model.get(0).arr);
             model.remove(0);
             model = check(model);  
          }
          else{
             model.remove(0);
          }  
      }

      for(int i=0;i<8;i++){
         if(map.get(i).value==1 && map.get(i).group==false){
            a = new ArrayList<>(Arrays.asList(i));
            group.add(a);
         }
      }
    return group;
 }



}


/*class Model{
   ArrayList<Integer> arr;
   int total;
   Model(ArrayList<Integer> arr, int total){
      this.arr = arr;
      this.total=total;
   }
   Model(){}
}
class kmap{
   int value;
   boolean group;
   kmap(int value, boolean group){
      this.value = value;
      this.group = group;
   }
   kmap(){}
}

class sortItems implements Comparator<Model> {


	public int compare(Model a, Model b)
	{

		return Integer.compare(b.total, a.total);
	}
}*/







