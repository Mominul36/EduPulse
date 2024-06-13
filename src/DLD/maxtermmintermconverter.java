package DLD;

import raven.application.form.other.*;
import com.formdev.flatlaf.FlatClientProperties;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

/**
 *
 * @author Raven
 */
public class maxtermmintermconverter extends javax.swing.JPanel {

    int point;
    public maxtermmintermconverter() {
        initComponents();
        point = menu.getSelectedIndex();
        mainpanel.setVisible(false);
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JComboBox<>();
        txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        mainpanel = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("      Maxterm to Minterm Converter");

        menu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOP to POS", "POS to SOP" }));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        txt.setEditable(false);
        txt.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("A");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("A'");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("B");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("B'");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("C'");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setText("C");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setText("D'");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton8.setText("D");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton9.setText("+");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton10.setText("(");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton11.setText(")");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        convert.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton12.setText("Del");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton13.setText("Reset");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        txt2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt2.setText("txt2");

        txt3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt3.setText("jLabel2");

        txt4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt4.setText("jLabel2");

        txt5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt5.setText("jLabel2");

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt5, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(595, 595, 595))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        scroll.setViewportView(mainpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(convert, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
     point = menu.getSelectedIndex();
     txt.setText("");
    }//GEN-LAST:event_menuActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      String s = txt.getText().toString();
        int len = s.length();
        if(point==0){
            if(!s.matches("")){
                if(s.charAt(len-1)!='+'){
                    txt.setText(s+"+");
                }
            }
        }
        else if(point==1){
            if(!s.matches("")){
                if(s.charAt(len-1)!='+' && s.charAt(len-1)!=')' && s.charAt(len-1)!='('){
                    txt.setText(s+"+");
                }
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String s = txt.getText().toString();
        int len = s.length();
        if(point==1){
           if(s.matches("")){
               txt.setText(s+"(");
           }
           else if(s.charAt(len-1)==')'){
                txt.setText(s+"(");
           }
       }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       String s = txt.getText().toString();
        int len = s.length();
        if(point==1 && !s.matches("")){
            if(s.charAt(len-1)!=')'  && s.charAt(len-1)!='(' && s.charAt(len-1)!='+' ){
                 txt.setText(s+")");
            } 
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String s = txt.getText().toString();
        int len = s.length();
        if(point==0){
            txt.setText(s+"A");
        }
        else if(point==1){
            if(!s.matches("")){
                if(s.charAt(len-1)=='(' || s.charAt(len-1)=='+'){
                    txt.setText(s+"A");
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String s = txt.getText().toString();
        int len = s.length();
        if(point==0){
            txt.setText(s+"A'");
        }
        else if(point==1){
            if(!s.matches("")){
                if(s.charAt(len-1)=='(' || s.charAt(len-1)=='+'){
                    txt.setText(s+"A'");
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String s = txt.getText().toString();
        int len = s.length();
        if(point==0){
            txt.setText(s+"B");
        }
        else if(point==1){
            if(!s.matches("")){
                if(s.charAt(len-1)=='(' || s.charAt(len-1)=='+'){
                    txt.setText(s+"B");
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String s = txt.getText().toString();
        int len = s.length();
        if(point==0){
            txt.setText(s+"B'");
        }
        else if(point==1){
            if(!s.matches("")){
                if(s.charAt(len-1)=='(' || s.charAt(len-1)=='+'){
                    txt.setText(s+"B'");
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String s = txt.getText().toString();
        int len = s.length();
        if(point==0){
            txt.setText(s+"C");
        }
        else if(point==1){
            if(!s.matches("")){
                if(s.charAt(len-1)=='(' || s.charAt(len-1)=='+'){
                    txt.setText(s+"C");
                }
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         String s = txt.getText().toString();
        int len = s.length();
        if(point==0){
            txt.setText(s+"C'");
        }
        else if(point==1){
            if(!s.matches("")){
                if(s.charAt(len-1)=='(' || s.charAt(len-1)=='+'){
                    txt.setText(s+"C'");
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String s = txt.getText().toString();
        int len = s.length();
        if(point==0){
            txt.setText(s+"D");
        }
        else if(point==1){
            if(!s.matches("")){
                if(s.charAt(len-1)=='(' || s.charAt(len-1)=='+'){
                    txt.setText(s+"D");
                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         String s = txt.getText().toString();
        int len = s.length();
        if(point==0){
            txt.setText(s+"D'");
        }
        else if(point==1){
            if(!s.matches("")){
                if(s.charAt(len-1)=='(' || s.charAt(len-1)=='+'){
                    txt.setText(s+"D'");
                }
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
       String s = txt.getText().toString();
       String sss = s;
       s = replace(s);
       int len = s.length();
       if(s.matches("")){
           return;
       }
       String[] ss;
       ArrayList<String> terms = new ArrayList<>();
       if(point==0){
           if(s.charAt(len-1)=='+'){
                s = s.substring(0,s.length()-1);
           }
           
           s=s+"+";
           ss = s.split("\\+");
           for(int i=0;i<ss.length;i++){
               terms.add(ss[i]);
           }
             
       }
       if(point==1){
            if(s.charAt(len-1)=='('){
                 s = s.substring(0,s.length()-1);
           }
            else  if(s.charAt(len-1)=='+'){
                 s = s.substring(0,s.length()-1);
                 s = s + ")";
           }
            else  if(s.charAt(len-1)==')'){
                 
           }
            else {
                 s = s + ")";
           }
           
           ss = s.split("\\)");
           for(int i=0;i<ss.length;i++){
               String str= "";
               for(int j=0;j<ss[i].length();j++){
                   if(ss[i].charAt(j)!='(' && ss[i].charAt(j)!='+')
                       str+=ss[i].charAt(j);
               }
                terms.add(str);
                
               
               
           }
       }
       
       terms = Duplicatedelete(terms);
       for(int i=0;i<terms.size();i++){
           System.out.print(terms.get(i) + "  ");
       }System.out.println("");
       
      boolean m=false,n=false,o=false,p=false;
       int variable=0;
       
        for(int i=0;i<terms.size();i++){
           String w = terms.get(i);
           for(int j=0;j<w.length();j++){
               if(w.charAt(j)=='A' || w.charAt(j)=='a')
                   m=true;
               if(w.charAt(j)=='B' || w.charAt(j)=='b')
                   n=true;
               if(w.charAt(j)=='C' || w.charAt(j)=='c')
                   o=true;
               if(w.charAt(j)=='D' || w.charAt(j)=='d')
                   p=true;
               System.out.print(w.charAt(j) + "");
           }System.out.print(" ");
       }System.out.println("");
       
        
        
        if(m==true)
            variable+=1;
        if(n==true)
            variable+=1;
        if(o==true)
            variable+=1;
        if(p==true)
            variable+=1;
        
        
         System.out.println("Variable = "+variable);
        
        Model2 mod = new Model2();
        if(variable==1){
            JOptionPane.showConfirmDialog(null, "Use more than 1 variable", "Warning", 0);
            return;
        }
        else if(variable==0){
           return;
        }
        
        else if(variable==4){
            Four four = new Four(terms, point);
            mod = four.getmodel();
        }
        else if(variable==3){
          
           for(int i=0;i<terms.size();i++){
               String r = terms.get(i);
               if((r.length()-r.replace("D","").length()>0)  || (r.length()-r.replace("d","").length()>0)){
                   JOptionPane.showConfirmDialog(null, "For Three variable use A,B and C", "Warning", 0);
                    return;
               }
           }
           
           Three three = new Three(terms, point);
            mod = three.getmodel();
            printmodel(mod);
           
        }
        else if(variable==2){
            for(int i=0;i<terms.size();i++){
               String r = terms.get(i);
               if((r.length()-r.replace("D","").length()>0)  || (r.length()-r.replace("d","").length()>0) || (r.length()-r.replace("C","").length()>0) || (r.length()-r.replace("c","").length()>0)){
                   JOptionPane.showConfirmDialog(null, "For Two variable use A and B", "Warning", 0);
                    return;
               }
           }
            Two two = new Two(terms, point);
            mod = two.getmodel();
        }
        
        
        if(point==0){
            String st1 = "";
            String st2 = " => POS =   ";
            String min = "=> minterm = ( ";
            String max ="=> maxterm = ( ";
            
            for(int i=0;i<mod.stand1.size();i++){
                if(i==mod.stand1.size()-1)
                    st1+= mod.stand1.get(i);
                else 
                    st1+= mod.stand1.get(i) + "+";
            }
            
            for(int i=0;i<mod.stand2.size();i++){
                String t = mod.stand2.get(i);
                String temp = "(";
                for(int j=0;j<t.length();j++){
                    if(j==t.length()-1)
                        temp+=String.valueOf(t.charAt(j)) ;
                    else 
                        temp+= String.valueOf(t.charAt(j)) + "+";
                }
                temp+= ") ";
                st2+= temp;
            }
            
            for(int i=0;i<mod.term1.size();i++){
                if(i==mod.term1.size()-1)
                    min+= Integer.toString(mod.term1.get(i));
                else 
                    min+= Integer.toString(mod.term1.get(i)) + ", ";
            }
            min+= " )";
            
            
            for(int i=0;i<mod.term2.size();i++){
                if(i==mod.term2.size()-1)
                    max+= Integer.toString(mod.term2.get(i));
                else 
                    max+= Integer.toString(mod.term2.get(i)) + ", ";
            }
            max+= " )";
            
            
            st1 = st1.replace("a", "A'");
            st1 = st1.replace("b", "B'");
            st1 = st1.replace("c", "C'");
            st1 = st1.replace("d", "D'");
            
            st2 = st2.replace("a", "A'");
            st2 = st2.replace("b", "B'");
            st2 = st2.replace("c", "C'");
            st2 = st2.replace("d", "D'");
            
            
            
            txt1.setText(" SOP = "+sss);
            txt2.setText("=> Standard = "+st1);
            txt3.setText(min);
            txt4.setText(max);
            txt5.setText(st2);
           // mainpanel.setVisible(true);
            
            
        }
        
        
        
        else if(point==1){
            String st1 = "";
            String st2 = "=> SOP =   ";
            String min = "=> maxterm = ( ";
            String max ="=> minterm = ( ";
            
            for(int i=0;i<mod.stand2.size();i++){
                if(i==mod.stand2.size()-1)
                    st2+= mod.stand2.get(i);
                else 
                    st2+= mod.stand2.get(i) + "+";
            }
            
            for(int i=0;i<mod.stand1.size();i++){
                String t = mod.stand1.get(i);
                String temp = "(";
                for(int j=0;j<t.length();j++){
                    if(j==t.length()-1)
                        temp+=String.valueOf(t.charAt(j)) ;
                    else 
                        temp+= String.valueOf(t.charAt(j)) + "+";
                }
                temp+= ") ";
                st1+= temp;
            }
            
            for(int i=0;i<mod.term1.size();i++){
                if(i==mod.term1.size()-1)
                    min+= Integer.toString(mod.term1.get(i));
                else 
                    min+= Integer.toString(mod.term1.get(i)) + ", ";
            }
            min+= " )";
            
            
            for(int i=0;i<mod.term2.size();i++){
                if(i==mod.term2.size()-1)
                    max+= Integer.toString(mod.term2.get(i));
                else 
                    max+= Integer.toString(mod.term2.get(i)) + ", ";
            }
            max+= " )";
            
            
            st1 = st1.replace("a", "A'");
            st1 = st1.replace("b", "B'");
            st1 = st1.replace("c", "C'");
            st1 = st1.replace("d", "D'");
            
            st2 = st2.replace("a", "A'");
            st2 = st2.replace("b", "B'");
            st2 = st2.replace("c", "C'");
            st2 = st2.replace("d", "D'");
            
            
            
            txt1.setText(" POS = "+sss);
            txt2.setText("=> Standard = "+st1);
            txt3.setText(min);
            txt4.setText(max);
            txt5.setText(st2);
           // mainpanel.setVisible(true);
            
            
        }
       
       
        mainpanel.setVisible(true);
       
        
        
           
       
       
       
    }//GEN-LAST:event_convertActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      txt.setText(txt.getText().toString().substring(0,txt.getText().toString().length()-1));
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      txt.setText("");
       mainpanel.setVisible(false);
       
    }//GEN-LAST:event_jButton13ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextField txt;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables

   void printmodel(Model2 mod){
       System.out.println("Stand1 =  ");
       for(int i=0;i<mod.stand1.size();i++){
           System.out.print(mod.stand1.get(i) + " ");
       }System.out.println("");
       
       
        System.out.println("minterm =  ");
       for(int i=0;i<mod.term1.size();i++){
           System.out.print(mod.term1.get(i) + " ");
       }System.out.println("");
       
       
       
        System.out.println("maxterm =  ");
       for(int i=0;i<mod.term2.size();i++){
           System.out.print(mod.term2.get(i) + " ");
       }System.out.println("");
       
       
       System.out.println("Stand2 =  ");
       for(int i=0;i<mod.stand2.size();i++){
           System.out.print(mod.stand2.get(i) + " ");
       }System.out.println("");
       
   }
    ArrayList<String> Duplicatedelete(ArrayList<String> term){
       ArrayList<String> terms = new ArrayList<>();
       for(int i=0;i<term.size();i++){
           String s = term.get(i);
           if(s.length() - s.replace("A", "").length()>0 && s.length() - s.replace("a", "").length()>0){
               
           }
           else if(s.length() - s.replace("B", "").length()>0 && s.length() - s.replace("b", "").length()>0){
               
           }
           else if(s.length() - s.replace("C", "").length()>0 && s.length() - s.replace("c", "").length()>0){
               
           }
           else if(s.length() - s.replace("D", "").length()>0 && s.length() - s.replace("d", "").length()>0){
               
           }
           else{
               String ss = "";
               if(s.length() - s.replace("A", "").length()>0)
                   ss+= "A";
               if(s.length() - s.replace("a", "").length()>0)
                   ss+= "a";
               if(s.length() - s.replace("B", "").length()>0)
                   ss+= "B";
               if(s.length() - s.replace("b", "").length()>0)
                   ss+= "b";
               if(s.length() - s.replace("C", "").length()>0)
                   ss+= "C";
               if(s.length() - s.replace("c", "").length()>0)
                   ss+= "c";
               if(s.length() - s.replace("D", "").length()>0)
                   ss+= "D";
               if(s.length() - s.replace("d", "").length()>0)
                   ss+= "d";
               
               terms.add(ss);
           }
    
       }
      
       return terms;
   } 
    
    
 String replace(String s){
    s = s.replace("A'","a"); 
     s = s.replace("C'","c"); 
      s = s.replace("D'","d"); 
       s = s.replace("B'","b");
       return s;
}



}
class Model2{
    ArrayList<String> stand1, stand2;
    ArrayList<Integer> term1, term2;
    Model2(ArrayList<String> stand1,ArrayList<String> stand2,ArrayList<Integer> term1,ArrayList<Integer> term2){
        this.stand1 = stand1;
        this.stand2 = stand2;
        this.term1 = term1;
        this.term2 = term2;
    }

    public Model2() {
    }
    
}
class Four{
    ArrayList<String> term;
     ArrayList<String> arr;
     ArrayList<String> a ;
     ArrayList<String> b ;
      ArrayList<String> stand1 ;
      ArrayList<String> stand2 ;
      ArrayList<Integer> term1, term2;
      int p;



      Four(ArrayList<String> a, int p){
        this.term = a;
        this.p = p;
         arr = new ArrayList<>();
         stand1 = new ArrayList<>();
         stand2 = new ArrayList<>();
         term1 = new ArrayList<>();
         term2 = new ArrayList<>();
         initializeab();
         standard();
      }



      
    void standard(){
        
         for(int i=0;i<term.size();i++){
           String s = term.get(i);
           if(s.length()==4){
            arr.add(s);
           }
           else if(s.length()==1){
            if(s.matches("A")){
                String[] t = {"ABCD", "AbCD", "ABcD", "AbcD", "ABCd", "AbCd", "ABcd", "Abcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("a")){
                String[] t = {"aBCD", "abCD", "aBcD", "abcD", "aBCd", "abCd", "aBcd", "abcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("B")){
                String[] t = {"ABCD", "aBCD", "ABcD", "aBcD", "ABCd", "aBCd", "ABcd", "aBcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("b")){
                String[] t = {"AbCD", "abCD", "AbcD", "abcD", "AbCd", "abCd", "Abcd", "abcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("C")){
                String[] t = {"ABCD", "AbCD", "aBCD", "abCD", "ABCd", "AbCd", "aBCd", "abCd"};
                arr = setup(arr, t);
            }
            else if(s.matches("c")){
                String[] t = {"ABcD", "AbcD", "aBcD", "abcD", "ABcd", "Abcd", "aBcd", "abcd"};
                arr = setup(arr, t);
            }
             else if(s.matches("D")){
                String[] t = {"ABCD", "AbCD", "aBCD", "abCD", "ABcD", "AbcD", "aBcD", "abcD"};
                arr = setup(arr, t);
            }
            else if(s.matches("d")){
                String[] t = {"ABCd", "AbCd", "aBCd", "abCd", "ABcd", "Abcd", "aBcd", "abcd"};
                arr = setup(arr, t);
            }

           }

           else if(s.length()==2){
            if(s.matches("AB")){
                String[] t = {"ABCD", "ABcD", "ABCd", "ABcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("aB")){
                String[] t = {"aBCD", "aBcD", "aBCd", "aBcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("Ab")){
                String[] t = {"AbCD", "AbcD", "AbCd", "Abcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("ab")){
                String[] t = {"abCD", "abcD", "abCd", "abcd"};
                arr = setup(arr, t);
            }

            else if(s.matches("AC")){
                String[] t = {"ABCD", "AbCD", "ABCd", "AbCd"};
                arr = setup(arr, t);
            }
            else if(s.matches("aC")){
                String[] t = {"aBCD", "abCD", "aBCd", "abCd"};
                arr = setup(arr, t);
            }
            else if(s.matches("Ac")){
                String[] t = {"ABcD", "AbcD", "ABcd", "Abcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("ac")){
                String[] t = {"aBcD", "abcD", "aBcd", "abcd"};
                arr = setup(arr, t);
            }

            else if(s.matches("AD")){
                String[] t = {"ABCD", "ABcD", "AbCD", "AbcD"};
                arr = setup(arr, t);
            }
            else if(s.matches("aD")){
                String[] t = {"aBCD", "aBcD", "abCD", "abcD"};
                arr = setup(arr, t);
            }
            else if(s.matches("Ad")){
                String[] t = {"ABCd", "ABcd", "AbCd", "Abcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("ad")){
                String[] t = {"aBCd", "aBcd", "abCd", "abcd"};
                arr = setup(arr, t);
            }


           else if(s.matches("BC")){
                String[] t = {"ABCD", "aBCD", "ABCd", "aBCd"};
                arr = setup(arr, t);
            }

            else if(s.matches("bC")){
                String[] t = {"AbCD", "abCD", "AbCd", "abCd"};
                arr = setup(arr, t);
            }
            else if(s.matches("Bc")){
                String[] t = {"ABcD", "aBcD", "ABcd", "aBcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("bc")){
                String[] t = {"AbcD", "abcD", "Abcd", "abcd"};
                arr = setup(arr, t);
            }

            else if(s.matches("BD")){
                String[] t = {"ABCD", "ABcD", "aBCD", "aBcD"};
                arr = setup(arr, t);
            }
            else if(s.matches("bD")){
                String[] t = {"AbCD", "AbcD", "abCD", "abcD"};
                arr = setup(arr, t);
            }
            else if(s.matches("Bd")){
                String[] t = {"ABCd", "ABcd", "aBCd", "aBcd"};
                arr = setup(arr, t);
            }
            else if(s.matches("bd")){
                String[] t = {"AbCd", "Abcd", "abCd", "abcd"};
                arr = setup(arr, t);
            }


            else if(s.matches("CD")){
                String[] t = {"ABCD", "AbCD", "aBCD", "abCD"};
                arr = setup(arr, t);
            }
            else if(s.matches("cD")){
                String[] t = {"ABcD", "AbcD", "aBcD", "abcD"};
                arr = setup(arr, t);
            }
            else if(s.matches("Cd")){
                String[] t = {"ABCd", "AbCd", "aBCd", "abCd"};
                arr = setup(arr, t);
            }
            else if(s.matches("cd")){
                String[] t = {"ABcd", "Abcd", "aBcd", "abcd"};
                arr = setup(arr, t);
            }

           }

           else if(s.length()==3){
              if(s.length() - s.replace("A", "").length()==0 && s.length() - s.replace("a", "").length()==0){
                arr.add("A"+s);
                 arr.add("a"+s);
              }
              else if(s.length() - s.replace("B", "").length()==0 && s.length() - s.replace("b", "").length()==0){
                StringBuffer bf = new StringBuffer(s);
                bf.insert(1, "B");
                arr.add(bf.toString());
                bf = new StringBuffer(s);
                bf.insert(1, "b");
                arr.add(bf.toString());
              }
              else if(s.length() - s.replace("C", "").length()==0 && s.length() - s.replace("c", "").length()==0){
                StringBuffer bf = new StringBuffer(s);
                bf.insert(2, "C");
                arr.add(bf.toString());
                bf = new StringBuffer(s);
                bf.insert(2, "c");
                arr.add(bf.toString());
              }
              else if(s.length() - s.replace("D", "").length()==0 && s.length() - s.replace("d", "").length()==0){
                arr.add(s+"D");
                 arr.add(s+"d");
              }

           }
         }



      if(p==0){
            for(int i=0;i<16;i++){
            if(Collections.frequency(arr, b.get(i))>0){
                stand1.add(b.get(i));
                term1.add(i);
            }
            else{
                stand2.add(a.get(i));
                term2.add(i);
            }

          }

        }
       
        else if(p==1){
            for(int i=0;i<16;i++){
            if(Collections.frequency(arr, a.get(i))>0){
                stand1.add(a.get(i));
                term1.add(i);
            }
            else{
                stand2.add(b.get(i));
                term2.add(i);
            }

          }

        }
        
         
      }


      void initializeab(){
        a = new ArrayList<>();
        b = new ArrayList<>();
        a.add("ABCD"); b.add("abcd");
        a.add("ABCd"); b.add("abcD");
        a.add("ABcD"); b.add("abCd");
        a.add("ABcd"); b.add("abCD");
        a.add("AbCD"); b.add("aBcd");
        a.add("AbCd"); b.add("aBcD");
        a.add("AbcD"); b.add("aBCd");
        a.add("Abcd"); b.add("aBCD");
        a.add("aBCD"); b.add("Abcd");
        a.add("aBCd"); b.add("AbcD");
        a.add("aBcD"); b.add("AbCd");
        a.add("aBcd"); b.add("AbCD");
        a.add("abCD"); b.add("ABcd");
        a.add("abCd"); b.add("ABcD");
        a.add("abcD"); b.add("ABCd");
        a.add("abcd"); b.add("ABCD");
      }


      ArrayList<String> setup(ArrayList<String> a, String[] s){
       
        for(int i=0;i<s.length;i++){
            a.add(s[i]);
        }
        return a;
      }

      public Model2 getmodel(){
        Model2 mod = new Model2(stand1, stand2, term1, term2);
        return mod;
      }


}







class Three{
    ArrayList<String> term;
     ArrayList<String> arr;
     ArrayList<String> a ;
     ArrayList<String> b ;
      ArrayList<String> stand1 ;
      ArrayList<String> stand2 ;
      ArrayList<Integer> term1, term2;
      int p;



      Three(ArrayList<String> a, int p){
        this.term = a;
        this.p = p;
         arr = new ArrayList<>();
         stand1 = new ArrayList<>();
         stand2 = new ArrayList<>();
         term1 = new ArrayList<>();
         term2 = new ArrayList<>();
         initializeab();
         standard();
      }



      
    void standard(){
        
         for(int i=0;i<term.size();i++){
           String s = term.get(i);
           if(s.length()==3){
            arr.add(s);
           }
           else if(s.length()==1){
            if(s.matches("A")){
                String[] t = {"ABC", "ABc", "AbC", "Abc"};
                arr = setup(arr, t);
            }
            else if(s.matches("a")){
                String[] t = {"aBC", "aBc", "abC", "abc"};
                arr = setup(arr, t);
            }
            else if(s.matches("B")){
                String[] t = { "ABC", "aBC", "ABc", "aBc"};
                arr = setup(arr, t);
            }
            else if(s.matches("b")){
                String[] t = { "AbC", "abC", "Abc", "abc"};
                arr = setup(arr, t);
            }
            else if(s.matches("C")){
                String[] t = { "ABC", "AbC", "aBC", "abC"};
                arr = setup(arr, t);
            }
            else if(s.matches("c")){
                String[] t = { "ABc", "Abc", "aBc", "abc"};
                arr = setup(arr, t);
            }

           }

           else if(s.length()==2){
            if(s.matches("AB")){
                String[] t = {"ABC", "ABc"};
                arr = setup(arr, t);
            }
            else if(s.matches("aB")){
                String[] t = {"aBC", "aBc"};
                arr = setup(arr, t);
            }
            else if(s.matches("Ab")){
                String[] t = {"AbC", "Abc"};
                arr = setup(arr, t);
            }
            else if(s.matches("ab")){
                String[] t = {"abC", "abc"};
                arr = setup(arr, t);
            }


            else if(s.matches("AC")){
                String[] t = {"ABC", "AbC"};
                arr = setup(arr, t);
            }
            else if(s.matches("aC")){
                String[] t = {"aBC", "abC"};
                arr = setup(arr, t);
            }
            else if(s.matches("Ac")){
                String[] t = {"ABc", "Abc"};
                arr = setup(arr, t);
            }
            else if(s.matches("ac")){
                String[] t = {"aBc", "abc"};
                arr = setup(arr, t);
            }

           else if(s.matches("BC")){
                String[] t = {"ABC", "aBC"};
                arr = setup(arr, t);
            }

            else if(s.matches("bC")){
                String[] t = {"AbC", "abC"};
                arr = setup(arr, t);
            }
            else if(s.matches("Bc")){
                String[] t = {"ABc", "aBc"};
                arr = setup(arr, t);
            }
            else if(s.matches("bc")){
                String[] t = {"Abc", "abc"};
                arr = setup(arr, t);
            }
           }
         }



      if(p==0){
            for(int i=0;i<8;i++){
            if(Collections.frequency(arr, b.get(i))>0){
                stand1.add(b.get(i));
                term1.add(i);
            }
            else{
                stand2.add(a.get(i));
                term2.add(i);
            }

          }

        }
       
        else if(p==1){
            for(int i=0;i<8;i++){
            if(Collections.frequency(arr, a.get(i))>0){
                stand1.add(a.get(i));
                term1.add(i);
            }
            else{
                stand2.add(b.get(i));
                term2.add(i);
            }

          }

        }
        
         
      }


      void initializeab(){
        a = new ArrayList<>();
        b = new ArrayList<>();
        a.add("ABC"); b.add("abc");//000
        a.add("ABc"); b.add("abC");//001
        a.add("AbC"); b.add("aBc");//010
        a.add("Abc"); b.add("aBC");//011
        a.add("aBC"); b.add("Abc");//100
        a.add("aBc"); b.add("AbC");//101
        a.add("abC"); b.add("ABc");//110
        a.add("abc"); b.add("ABC");//111
      }


      ArrayList<String> setup(ArrayList<String> a, String[] s){
       
        for(int i=0;i<s.length;i++){
            a.add(s[i]);
        }
        return a;
      }

      public Model2 getmodel(){
        Model2 mod = new Model2(stand1, stand2, term1, term2);
        return mod;
      }


}




class Two{
    ArrayList<String> term;
     ArrayList<String> arr;
     ArrayList<String> a ;
     ArrayList<String> b ;
      ArrayList<String> stand1 ;
      ArrayList<String> stand2 ;
      ArrayList<Integer> term1, term2;
      int p;



      Two(ArrayList<String> a, int p){
        this.term = a;
        this.p = p;
         arr = new ArrayList<>();
         stand1 = new ArrayList<>();
         stand2 = new ArrayList<>();
         term1 = new ArrayList<>();
         term2 = new ArrayList<>();
         initializeab();
         standard();
      }



      
    void standard(){
        
         for(int i=0;i<term.size();i++){
           String s = term.get(i);
           if(s.length()==2){
            arr.add(s);
           }
           else if(s.length()==1){
            if(s.matches("A")){
                String[] t = {"AB", "Ab"};
                arr = setup(arr, t);
            }
            else if(s.matches("a")){
                String[] t = {"aB", "ab"};
                arr = setup(arr, t);
            }
            else if(s.matches("B")){
                String[] t = { "AB", "aB"};
                arr = setup(arr, t);
            }
            else if(s.matches("b")){
                String[] t = { "Ab", "ab"};
                arr = setup(arr, t);
            }

           }
         }



      if(p==0){
            for(int i=0;i<4;i++){
            if(Collections.frequency(arr, b.get(i))>0){
                stand1.add(b.get(i));
                term1.add(i);
            }
            else{
                stand2.add(a.get(i));
                term2.add(i);
            }

          }

        }
       
        else if(p==1){
            for(int i=0;i<4;i++){
            if(Collections.frequency(arr, a.get(i))>0){
                stand1.add(a.get(i));
                term1.add(i);
            }
            else{
                stand2.add(b.get(i));
                term2.add(i);
            }

          }

        }
        
         
      }


      void initializeab(){
        a = new ArrayList<>();
        b = new ArrayList<>();
        a.add("AB"); b.add("ab");//00
        a.add("Ab"); b.add("aB");//01
        a.add("aB"); b.add("Ab");//10
        a.add("ab"); b.add("AB");//11
      }


      ArrayList<String> setup(ArrayList<String> a, String[] s){
       
        for(int i=0;i<s.length;i++){
            a.add(s[i]);
        }
        return a;
      }

      public Model2 getmodel(){
        Model2 mod = new Model2(stand1, stand2, term1, term2);
        return mod;
      }


}
