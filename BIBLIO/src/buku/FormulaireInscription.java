package buku;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class FormulaireInscription extends javax.swing.JFrame {

    /**
     * Creates new form FormulaireInscription
     */
    public FormulaireInscription() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nomT = new javax.swing.JTextField();
        postNomT = new javax.swing.JTextField();
        fonctionT = new javax.swing.JComboBox<>();
        promotionT = new javax.swing.JComboBox<>();
        faculteT = new javax.swing.JComboBox<>();
        matriculeT = new javax.swing.JTextField();
        VALIDER = new javax.swing.JButton();
        addresseT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emailT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        telephoneT1 = new javax.swing.JTextField();
        sexT = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 240, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,90));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AJOUTER UN ABONNE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 410, 50));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 120, 30));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("POST NOM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 120, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEXE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 120, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FONCTION");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 110, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PROMOTION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 180, 120, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FACULTE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 230, 90, 30));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MATRICULE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 120, 30));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADDRESSE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 120, 30));

        nomT.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        nomT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTActionPerformed(evt);
            }
        });
        jPanel1.add(nomT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 200, -1));

        postNomT.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        postNomT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postNomTActionPerformed(evt);
            }
        });
        jPanel1.add(postNomT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 200, -1));

        fonctionT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        fonctionT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ETUDIANT UPC", "ETUDIANT EXTERIEUR", "CORPS PROFESSORAL" }));
        fonctionT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fonctionTFocusGained(evt);
            }
        });
        fonctionT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fonctionTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fonctionTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fonctionTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fonctionTMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fonctionTMouseReleased(evt);
            }
        });
        fonctionT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonctionTActionPerformed(evt);
            }
        });
        jPanel1.add(fonctionT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 230, 30));

        promotionT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        promotionT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G1", "G2", "G3", "L1", "L2", "D1", "D2", "D3", " " }));
        jPanel1.add(promotionT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 177, 230, 30));

        faculteT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        faculteT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INFORMATIQUE", "MEDECINE", "ECONOMIE", "DROIT" }));
        faculteT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                faculteTMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                faculteTMouseReleased(evt);
            }
        });
        faculteT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faculteTActionPerformed(evt);
            }
        });
        jPanel1.add(faculteT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 230, 30));

        matriculeT.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        matriculeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculeTActionPerformed(evt);
            }
        });
        jPanel1.add(matriculeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 230, -1));

        VALIDER.setBackground(new java.awt.Color(0, 51, 255));
        VALIDER.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        VALIDER.setForeground(new java.awt.Color(255, 255, 255));
        VALIDER.setText("VALIDER");
        VALIDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VALIDERActionPerformed(evt);
            }
        });
        jPanel1.add(VALIDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 130, 50));

        addresseT.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        addresseT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresseTActionPerformed(evt);
            }
        });
        jPanel1.add(addresseT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 200, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("E-MAIL");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 120, 30));

        emailT.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        emailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTActionPerformed(evt);
            }
        });
        jPanel1.add(emailT, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 230, 30));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TELEPHONE");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 120, 30));

        telephoneT1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        telephoneT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneT1ActionPerformed(evt);
            }
        });
        jPanel1.add(telephoneT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 200, 30));

        sexT.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        sexT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jPanel1.add(sexT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 200, 30));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("ANNULER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 130, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_home_64px_2.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 60, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/Profile data-rafiki2.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 350, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1100, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/bck.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1100, 700));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_administrator_male_32px.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 40));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_calendar_32px.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 40, 40));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 30));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_add_male_user_32px.png"))); // NOI18N
        jLabel19.setText("AJOUTER UN ABONNE");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 30));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_literature_32px_2.png"))); // NOI18N
        jLabel20.setText("REPERTOIRE LIVRES");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 220, 30));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_shortlist_32px_1.png"))); // NOI18N
        jLabel21.setText("REGISTRE JOURNALIER");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 230, 30));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_send_hot_list_32px_3.png"))); // NOI18N
        jLabel22.setText("LISTE ABONNES");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, 30));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_exit_32px_1.png"))); // NOI18N
        jLabel23.setText("DECONNECTER");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 220, 30));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/icons8_about_32px_1.png"))); // NOI18N
        jLabel24.setText("A PROPOS");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1510, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTActionPerformed

    private void postNomTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postNomTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postNomTActionPerformed

    private void fonctionTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonctionTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fonctionTActionPerformed

    private void VALIDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VALIDERActionPerformed
        try{
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/buku", "root", "14400000");
            Statement myStmt = myConn.createStatement();
            
            String ad = addresseT.getText();
            String last_name = nomT.getText();
            String first_name = postNomT.getText();
            /*String fonction = (String)jComboBox1.getSelectedItem();*/
            String id = matriculeT.getText();
            String promo = promotionT.getSelectedItem().toString();
            String faculte = faculteT.getSelectedItem().toString();
            String tel = telephoneT1.getText();
            String email = emailT.getText();                               
            String function = fonctionT.getSelectedItem().toString();
            String sexe = sexT.getSelectedItem().toString();
            
            ResultSet rs = myStmt.executeQuery(String.format("select matricule from subscribers where matricule ='%s'", id));
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Error: Cet utilisateur est deja abonné!!", "Duplication d'Abonnee", JOptionPane.ERROR_MESSAGE);
            }
            else{
            if(ad.isEmpty()||last_name.isEmpty()||first_name.isEmpty()||id.isEmpty()||promo.isEmpty()||faculte.isEmpty()||tel.isEmpty()||email.isEmpty()||function.isEmpty()||sexe.isEmpty()){
                JOptionPane.showMessageDialog(null, "Veuillez entrer tous les champs ", "INFORMMATIONS INCOMPLETES", JOptionPane.ERROR_MESSAGE);
            }
            else{
                
                    
                
            
             String sql;
            sql = "insert into subscribers"
                    +  "(Matricule, nom, postnom, Sex,  fonction,faculte,promotion, Tel, Email, address )" + String.format("values('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%s', '%s')", id,last_name, first_name, sexe, function, faculte, promo,tel, email, ad);
                        myStmt.executeUpdate(sql);
                        
                           JOptionPane.showMessageDialog(null, "OPERATION REUSSI!!", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                       new HomePage().setVisible(true);
                       this.setVisible(false);
         
            }
            }
        }catch(Exception exc){
            exc.printStackTrace();
        }          
            
            
            
       
    }//GEN-LAST:event_VALIDERActionPerformed

    private void matriculeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculeTActionPerformed

    private void addresseTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresseTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresseTActionPerformed

    private void emailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTActionPerformed

    private void telephoneT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telephoneT1ActionPerformed

    private void faculteTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faculteTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faculteTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         nomT.setText("");
         postNomT.setText("");
         matriculeT.setText("");
         addresseT.setText("");
         emailT.setText("");
         telephoneT1.setText("");
        sexT.setSelectedIndex(0);
        fonctionT.setSelectedIndex(0);
        promotionT.setSelectedIndex(0);
        faculteT.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
         new UIaccueil().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void fonctionTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonctionTMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_fonctionTMouseClicked

    private void fonctionTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonctionTMousePressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_fonctionTMousePressed

    private void fonctionTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fonctionTFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fonctionTFocusGained

    private void fonctionTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonctionTMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fonctionTMouseEntered

    private void fonctionTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonctionTMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fonctionTMouseReleased

    private void fonctionTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonctionTMouseExited
        // TODO add your handling code here:
        String item = fonctionT.getSelectedItem().toString();
        System.out.println(item);
        
      if(item.equals("CORPS PROFESSORAL")){
            promotionT.setEnabled(false);
            
            faculteT.setEnabled(false);
        }
        else {
            promotionT.setEnabled(true);
            faculteT.setEnabled(true);
        }
    }//GEN-LAST:event_fonctionTMouseExited

    private void faculteTMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faculteTMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_faculteTMouseReleased

    private void faculteTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faculteTMouseExited
        // TODO add your handling code here:
//        String item = faculteT.getSelectedItem().toString();
//        System.out.println(item);
//        if(item.equalsIgnoreCase("MEDECINE")){
//            promotionT.
//        }
        
    }//GEN-LAST:event_faculteTMouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        new FormulaireInscription().setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        new ImproveListe().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        new repertoire().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        new Registre().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel21MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormulaireInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormulaireInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormulaireInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormulaireInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulaireInscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VALIDER;
    private javax.swing.JTextField addresseT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField emailT;
    private javax.swing.JComboBox<String> faculteT;
    private javax.swing.JComboBox<String> fonctionT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField matriculeT;
    private javax.swing.JTextField nomT;
    private javax.swing.JTextField postNomT;
    private javax.swing.JComboBox<String> promotionT;
    private javax.swing.JComboBox<String> sexT;
    private javax.swing.JTextField telephoneT1;
    // End of variables declaration//GEN-END:variables
}
