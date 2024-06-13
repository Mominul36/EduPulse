package DLD;

import raven.application.form.other.*;
import com.formdev.flatlaf.FlatClientProperties;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

/**
 *
 * @author Raven
 */
public class BaseConverter extends javax.swing.JPanel {
 int a;
    int b;
    public BaseConverter() {
          a= 0;
       b =  0;
        initComponents();
       
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

        text1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
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
        menu2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Binary", "Octal", "Hexadecimal", "BCD", "GRAY Code", "Excess-3" }));
        menu2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        menu2.setOpaque(true);
        menu2.setPreferredSize(new java.awt.Dimension(72, 20));
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        menu1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Binary", "Octal", "Hexadecimal", "BCD", "GRAY Code" }));
        menu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelexchangeMousePressed(evt);
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
        btnclear.setText("Reset");
        btnclear.setBorderPainted(false);
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });

        text2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelexchange, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menu2, 0, 502, Short.MAX_VALUE)
                            .addComponent(text2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(btnconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelexchange, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(241, 241, 241))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text1ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        b = menu2.getSelectedIndex();
    }//GEN-LAST:event_menu2ActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        a= menu1.getSelectedIndex();
    }//GEN-LAST:event_menu1ActionPerformed

    private void labelexchangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelexchangeMouseClicked

    }//GEN-LAST:event_labelexchangeMouseClicked

    private void labelexchangeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelexchangeMousePressed

        try {
            int t=a;
            a=b;
            b=t;
            menu1.setSelectedIndex(a);
            menu2.setSelectedIndex(b);
            
            
            String s = text1.getText().toString();
              String ss = text2.getText().toString();
              text1.setText(ss);
              text2.setText(s);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(new BaseConverter(),"Not possible to convert from Excess-3.","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_labelexchangeMousePressed

    private void btnconvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconvertMouseClicked

    }//GEN-LAST:event_btnconvertMouseClicked

    private void btnconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconvertActionPerformed
        if(text1.getText().matches("")){
            JOptionPane.showMessageDialog(new BaseConverter(),"Empty value.","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String num = text1.getText().toString();

        try {

            if(a==0){
                if(num.charAt(0)=='-'){
                    JOptionPane.showMessageDialog(new BaseConverter(),"Give a positive number.","Warning",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                for(int i=0;i<num.length();i++){

                    if(num.charAt(i)!='0' && num.charAt(i)!='1' && num.charAt(i)!='2' && num.charAt(i)!='3' && num.charAt(i)!='4' && num.charAt(i)!='5' && num.charAt(i)!='6' && num.charAt(i)!='7' && num.charAt(i)!='8' && num.charAt(i)!='9')
                    {
                        JOptionPane.showMessageDialog(new BaseConverter(),"This is not a Decimal number.","Warning",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                if(b==0){
                    text2.setText(num);
                }
                else if(b==1){
                    text2.setText(dectobin(num));
                }
                else if(b==2){
                    text2.setText(dectooctal(num));
                }
                else if(b==3){
                    text2.setText(dectohexa(num));
                }
                else if(b==4){
                    text2.setText(dectobcd(num));
                }
                else if(b==5){
                    text2.setText(dectogray(num));
                }
                else if(b==6){
                    text2.setText(dectoexcess(num));
                }

            }

            if(a==1){
                if(num.charAt(0)=='-'){
                    JOptionPane.showMessageDialog(new BaseConverter(),"Give a positive number.","Warning",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                for(int i=0;i<num.length();i++){

                    if(num.charAt(i)!='0' && num.charAt(i)!='1')
                    {
                        JOptionPane.showMessageDialog(new BaseConverter(),"This is not a Binary number.","Warning",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                if(b==0){
                    text2.setText(bintodec(num));
                }
                else if(b==1){
                    text2.setText(num);
                }
                else if(b==2){
                    text2.setText(bintooctal(num));
                }
                else if(b==3){
                    text2.setText(bintohexa(num));
                }
                else if(b==4){
                    text2.setText(bintobcd(num));
                }
                else if(b==5){
                    text2.setText(bintogray(num));
                }
                else if(b==6){
                    text2.setText(bintoexcess(num));
                }

            }

            if(a==2){
                if(num.charAt(0)=='-'){
                    JOptionPane.showMessageDialog(new BaseConverter(),"Give a positive number.","Warning",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                for(int i=0;i<num.length();i++){

                    if(num.charAt(i)!='0' && num.charAt(i)!='1' && num.charAt(i)!='2' && num.charAt(i)!='3' && num.charAt(i)!='4' && num.charAt(i)!='5' && num.charAt(i)!='6' && num.charAt(i)!='7')
                    {
                        JOptionPane.showMessageDialog(new BaseConverter(),"This is not a Octal number.","Warning",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                if(b==0){
                    text2.setText(octaltodec(num));
                }
                else if(b==1){
                    text2.setText(octaltobin(num));
                }
                else if(b==2){
                    text2.setText(num);
                }
                else if(b==3){
                    text2.setText(octaltohexa(num));
                }
                else if(b==4){
                    text2.setText(octaltobcd(num));
                }
                else if(b==5){
                    text2.setText(octaltogray(num));
                }
                else if(b==6){
                    text2.setText(octaltoexcess(num));
                }

            }

            if(a==3){
                if(num.charAt(0)=='-'){
                    JOptionPane.showMessageDialog(new BaseConverter(),"Give a positive number.","Warning",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                num = num.replace("a","A");
                num = num.replace("b","B");
                num = num.replace("c","C");
                num = num.replace("d","D");
                num = num.replace("e","E");
                num = num.replace("f","F");
                for(int i=0;i<num.length();i++){

                    if(num.charAt(i)!='0' && num.charAt(i)!='1' && num.charAt(i)!='2' && num.charAt(i)!='3' && num.charAt(i)!='4' && num.charAt(i)!='5' && num.charAt(i)!='6' && num.charAt(i)!='7' && num.charAt(i)!='8' && num.charAt(i)!='9' && num.charAt(i)!='A' && num.charAt(i)!='B' && num.charAt(i)!='C' && num.charAt(i)!='D' && num.charAt(i)!='E' && num.charAt(i)!='F')
                    {
                        JOptionPane.showMessageDialog(new BaseConverter(),"This is not a Hexadecimal number.","Warning",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                if(b==0){
                    text2.setText(hexatodec(num));
                }
                else if(b==1){
                    text2.setText(hexatobin(num));
                }
                else if(b==2){
                    text2.setText(hexatooctal(num));
                }
                else if(b==3){
                    text2.setText(num);
                }
                else if(b==4){
                    text2.setText(hexatobcd(num));
                }
                else if(b==5){
                    text2.setText(hexatogray(num));
                }
                else if(b==6){
                    text2.setText(hexatoexcess(num));
                }

            }

            if(a==4){
                if(num.charAt(0)=='-'){
                    JOptionPane.showMessageDialog(new BaseConverter(),"Give a positive number.","Warning",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                for(int i=0;i<num.length();i++){

                    if(num.charAt(i)!='0' && num.charAt(i)!='1')
                    {
                        JOptionPane.showMessageDialog(new BaseConverter(),"This is not a BCD number.","Warning",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                if(b==0){
                    text2.setText(bcdtodec(num));
                }
                else if(b==1){
                    text2.setText(bcdtobin(num));
                }
                else if(b==2){
                    text2.setText(bcdtooctal(num));
                }
                else if(b==3){
                    text2.setText(bcdtohexa(num));
                }
                else if(b==4){
                    text2.setText(num);
                }
                else if(b==5){
                    text2.setText(bcdtogray(num));
                }
                else if(b==6){
                    text2.setText(bcdtoexcess(num));
                }

            }

            if(a==5){
                if(num.charAt(0)=='-'){
                    JOptionPane.showMessageDialog(new BaseConverter(),"Give a positive number.","Warning",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                for(int i=0;i<num.length();i++){

                    if(num.charAt(i)!='0' && num.charAt(i)!='1')
                    {
                        JOptionPane.showMessageDialog(new BaseConverter(),"This is not a Gray Code number.","Warning",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                if(b==0){
                    text2.setText(graytodec(num));
                }
                else if(b==1){
                    text2.setText(graytobin(num));
                }
                else if(b==2){
                    text2.setText(graytooctal(num));
                }
                else if(b==3){
                    text2.setText(graytohexa(num));
                }
                else if(b==4){
                    text2.setText(graytobcd(num));
                }
                else if(b==5){
                    text2.setText(num);
                }
                else if(b==6){
                    text2.setText(graytoexcess(num));
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(new BaseConverter(),"NUmber is too large.","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnconvertActionPerformed

    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclearMouseClicked
        text1.setText("");
        text2.setText("");
    }//GEN-LAST:event_btnclearMouseClicked

    private void text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text2ActionPerformed

    private void text1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text1KeyTyped
   char c = evt.getKeyChar();
        if(a==0){
         if(!Character.isDigit(evt.getKeyChar())){
          evt.consume();
      }
    }
        else if(a==1){
            if(c=='1' || c=='0'){
                
            }
            else {
                evt.consume();
            }
        }
         else if(a==2){
            if(c=='1' || c=='0' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7'){
                
            }
            else {
                evt.consume();
            }
        }
        else if(a==3){
            if(c=='1' || c=='0' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='A' || c=='B' || c=='C' || c=='D' || c=='E' || c=='F'  || c=='a' || c=='b' || c=='c' || c=='d' || c=='e' || c=='f'){
                
            }
            else {
                evt.consume();
            }
        }
        
        else if(a==4){
            if(c=='1' || c=='0'){
                
            }
            else {
                evt.consume();
            }
        }
        
        
        else if(a==5){
            if(c=='1' || c=='0'){
                
            }
            else {
                evt.consume();
            }
        }
       
    }//GEN-LAST:event_text1KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnconvert;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelexchange;
    private javax.swing.JComboBox<String> menu1;
    private javax.swing.JComboBox<String> menu2;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    // End of variables declaration//GEN-END:variables
public static String graytooctal(String gray)
    {
       String dec = graytobin(gray);
       return bintooctal(dec);
    }

    public static String graytohexa(String gray)
    {
       String dec = graytobin(gray);
       return bintohexa(dec);
    }
  public static String graytobcd(String gray)
    {
       String dec = graytobin(gray);
       return bintobcd(dec);
    }
  public static String graytoexcess(String gray)
    {
       String dec = graytobin(gray);
       return bintoexcess(dec);
    }
    
    
    
    public static String bcdtobin(String gray)
    {
       String dec = bcdtodec(gray);
       return dectobin(dec);
    }

    public static String bcdtooctal(String gray)
    {
       String dec = bcdtodec(gray);
       return dectooctal(dec);
    }
    public static String bcdtohexa(String gray)
    {
       String dec = bcdtodec(gray);
       return dectohexa(dec);
    }
    public static String bcdtogray(String gray)
    {
       return bintogray(gray);
    }
    public static String bcdtoexcess(String gray)
    {
       String dec = bcdtodec(gray);
       return dectoexcess(dec);
    }

    
    
    
    public static String hexatoexcess(String gray)
    {
       String dec = hexatodec(gray);
       return dectoexcess(dec);
    }
     public static String hexatogray(String gray)
    {
       String dec = hexatodec(gray);
       return dectogray(dec);
    }

     public static String hexatobcd(String gray)
    {
       String dec = hexatodec(gray);
       return dectobcd(dec);
    }

 public static String hexatooctal(String gray)
    {
       String dec = hexatodec(gray);
       return dectooctal(dec);
    }

 public static String hexatobin(String gray)
    {
       String dec = hexatodec(gray);
       return dectobin(dec);
    }
 
    
    
    
   public static String octaltoexcess(String gray)
    {
       String decc = octaltodec(gray);
       return dectoexcess(decc);
    }

   public static String octaltogray(String gray)
    {
       String decc = octaltodec(gray);
       return dectogray(decc);
    }

    public static String octaltobcd(String gray)
    {
       String decc = octaltodec(gray);
       return dectobcd(decc);
    }
    
    
    public static String octaltohexa(String gray)
    {
       String decc = octaltodec(gray);
       return dectohexa(decc);
    }
    
    public static String octaltobin(String gray)
    {
       String decc = octaltodec(gray);
       return dectobin(decc);
    }
    
    public static String bintoexcess(String gray)
    {
       String dec = bintodec(gray);
       return dectoexcess(dec);
    }
    
    public static String bintobcd(String gray)
    {
       String dec = bintodec(gray);
       return dectobcd(dec);
    }

    public static String bintohexa(String gray)
    {
       String dec = bintodec(gray);
       return dectohexa(dec);
    }
    
    static String bintogray(String bin) 
    { 
        String gray ="";
        gray+= bin.charAt(0);
        for(int i=1;i<bin.length();i++){
            if(bin.charAt(i-1)=='0' && bin.charAt(i)=='0'){
               gray+= "0";
            }
            else if(bin.charAt(i-1)=='0' && bin.charAt(i)=='1'){
               gray+= "1";
            }
            else if(bin.charAt(i-1)=='1' && bin.charAt(i)=='0'){
               gray+= "1";
            }
            else if(bin.charAt(i-1)=='1' && bin.charAt(i)=='1'){
               gray+= "0";
            }
        }
       return gray;
    }
    
    
    static String graytobin(String gray) 
    { 
        String bin ="";
        bin+= gray.charAt(0);
        for(int i=1;i<gray.length();i++){
            if(bin.charAt(i-1)=='0' && gray.charAt(i)=='0'){
               bin+= "0";
            }
            else if(bin.charAt(i-1)=='0' && gray.charAt(i)=='1'){
               bin+= "1";
            }
            else if(bin.charAt(i-1)=='1' && gray.charAt(i)=='0'){
               bin+= "1";
            }
            else if(bin.charAt(i-1)=='1' && gray.charAt(i)=='1'){
               bin+= "0";
            }
        }
       return bin;
    }
    
    
      public static String bintooctal(String gray)
    {
       String dec = bintodec(gray);
       return dectooctal(dec);
    }
    
    
   public static String graytodec(String gray)
    {
       String bin = graytobin(gray);
       return bintodec(bin);
    }
    
    
    
    public static String bcdtodec(String bcd)
    {
        int len = bcd.length();
        int check = 0, check0 = 0;
        BigInteger num = new BigInteger("0");
         BigInteger sum = new BigInteger("0");
          BigInteger mul = new BigInteger("1");
           BigInteger rev = new BigInteger("0");
     
           BigInteger temp3 = new BigInteger("0");
           BigInteger temp4 = new BigInteger("10");
           BigInteger temp5 = new BigInteger("1");
       
        for(int i = len - 1; i >= 0; i--) 
        {
            BigInteger temp = new BigInteger(""+bcd.charAt(i));
            sum = sum.add(mul.multiply(temp));
           //sum += (bcd.charAt(i) - '0') * mul;
           BigInteger temp2 = new BigInteger("2");
           mul = mul.multiply(temp2);
           //mul *= 2;
           check++;
            
           if (check == 4 || i == 0) 
           {
            
               if (sum.compareTo(temp3)==0 && check0 == 0) 
               {
                   num=new BigInteger("1");
                   check0 = 1;
               }
               else
               {
     
                   
                   num = sum.add(num.multiply(temp4));
                   //num = num * 10 + sum;
               }
                
               check = 0;
               sum = new BigInteger("0");
               mul = new BigInteger("1");
              // sum = 0;
              // mul = 1;
           }
        }

       // while (num > 0) 
    while(num.compareTo(temp3)==1)
    {
        rev = rev.multiply(temp4).add(num.mod(temp4));
        //rev = rev * 10 + (num % 10);
        num = num.divide(temp4);
        //num /= 10;
    }
 
    if (check0 == 1)
        return rev.subtract(temp5).toString();
 
    return rev.toString();
}
    
    
    
        static String hexatodec(String hexa) 
    { 
        String num = hexa; 
        BigInteger hexa_value = new BigInteger("0"); 
  
        BigInteger base = new BigInteger("16"); 
       int c=0;
        Integer len = num.length(); 
        for (int i = len - 1; i >= 0; i--) { 
            BigInteger temp;
            if(num.charAt(i)=='A')
               temp = new BigInteger("10");
              else if(num.charAt(i)=='B')
               temp = new BigInteger("11");
              else if(num.charAt(i)=='C')
               temp = new BigInteger("12");
              else if(num.charAt(i)=='D')
               temp = new BigInteger("13");
              else if(num.charAt(i)=='E')
               temp = new BigInteger("14");
              else if(num.charAt(i)=='F')
               temp = new BigInteger("15");
            else
             temp = new BigInteger(""+num.charAt(i));
           hexa_value=hexa_value.add(temp.multiply(base.pow(c)));
           c++;
        } 
        
        return hexa_value.toString(); 
    } 
    
    
    
    static String octaltodec(String octal) 
    { 
        String num = octal; 
        BigInteger octal_value = new BigInteger("0"); 
  
        BigInteger base = new BigInteger("8"); 
       int c=0;
        Integer len = num.length(); 
        for (int i = len - 1; i >= 0; i--) { 
            BigInteger temp = new BigInteger(""+num.charAt(i));
           octal_value=octal_value.add(temp.multiply(base.pow(c)));
           c++;
        } 
        
        return octal_value.toString(); 
    } 
    
    
    
       static String bintodec(String bin) 
    { 
        String num = bin; 
        BigInteger dec_value = new BigInteger("0"); 
  
        BigInteger base = new BigInteger("1"); 
  
        Integer len = num.length(); 
        for (int i = len - 1; i >= 0; i--) { 
            if (num.charAt(i) == '1') 
            dec_value=dec_value.add(base);
               BigInteger temp = new BigInteger("2");
               base = base.multiply(temp);
        } 
        
        return dec_value.toString(); 
    } 
    
    
    
    
        static String dectoexcess(String dec) 
	{ 
        String excess="";
        for(int i=0;i<dec.length();i++){
            String temp ="";
            temp+=dec.charAt(i);
            Integer d = Integer.parseInt(temp);
            d+=3;
            String s = Integer.toString(d);
           String bin = dectobin(s);
            StringBuffer sb = new StringBuffer();
             if(bin.length()==1)
             sb.append("000");
             else if(bin.length()==2)
             sb.append("00");
             else if(bin.length()==3)
             sb.append("0");
             else if(bin.length()==4)
             sb.append("");

             sb.append(bin);
             bin= sb.toString();
             excess+=bin;

        }
        return excess;
	} 
    
    
    
       static String dectogray(String dec) 
	{ 
        return bintogray(dectobin(dec));
	} 
    
        static String dectobcd(String dec) 
	{ 
        String bcd="";
        for(int i=0;i<dec.length();i++){

            String temp="";
            temp+=dec.charAt(i);
            String bin = dectobin(temp);
           StringBuffer sb = new StringBuffer();
             if(bin.length()==1)
             sb.append("000");
             else if(bin.length()==2)
             sb.append("00");
             else if(bin.length()==3)
             sb.append("0");
             else if(bin.length()==4)
             sb.append("");

             sb.append(bin);
             bcd+= sb.toString();
        }
  return bcd;
	} 
    
    
    
    static String dectohexa(String str) 
    { 
        Integer n = Integer.parseInt(str);
         if(n==0){
            return "0";
        }
        int[] hexNum = new int[100]; 
  
        
        int i = 0; 
        while (n != 0) {
            hexNum[i] = n % 16; 
            n = n / 16; 
            i++; 
        } 
     String result="";
        for (int j = i - 1; j >= 0; j--) { 
            if (hexNum[j] > 9) {
                if(hexNum[j]==10)
                    result+= "A";
                if(hexNum[j]==11)
                    result+= "B";
                if(hexNum[j]==12)
                    result+= "C";
                if(hexNum[j]==13)
                    result+= "D";
                if(hexNum[j]==14)
                    result+= "E";
                if(hexNum[j]==15)
                    result+= "F";
            }
                
            else
               result+= Integer.toString(hexNum[j]);
        } 
        return result;
    }
    
    
     static String dectooctal(String str) 
	{ 
	Integer n = Integer.parseInt(str);
        if(n==0){
            return "0";
        }
		String octalNum  = ""; 
		int i = 0; 
		while (n > 0) { 
            octalNum += Integer.toString(n%8);
			n = n / 8; 
			i++; 
		} 

		StringBuilder input1 = new StringBuilder();
        input1.append(octalNum );
        input1.reverse();
        octalNum =input1.toString();
        return octalNum ;
	} 
     
     
     
    static String dectobin(String str) 
	{ 
	Integer n = Integer.parseInt(str);
        if(n==0){
            return "0";
        }
		String binaryNum = ""; 
		int i = 0; 
		while (n > 0) { 
            binaryNum+= Integer.toString(n%2);
			n = n / 2; 
			i++; 
		} 

		StringBuilder input1 = new StringBuilder();
        input1.append(binaryNum);
        input1.reverse();
        binaryNum=input1.toString();
        return binaryNum;
	} 
}
