package buku;
import java.awt.*;
import javax.swing.*;




public class splashPage extends javax.swing.JFrame {

    /**
     * Creates new form splashPage
     */
    public splashPage() {
        initComponents();
    }
    

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPane = new javax.swing.JPanel();
        LoadingBar = new javax.swing.JProgressBar();
        loadingLabel = new javax.swing.JLabel();
        libraryName = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPane.setBackground(new java.awt.Color(204, 204, 204));
        backgroundPane.setPreferredSize(new java.awt.Dimension(900, 500));
        backgroundPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        backgroundPane.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 20));

        loadingLabel.setBackground(new java.awt.Color(255, 255, 255));
        loadingLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        loadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        loadingLabel.setText("Loading ....");
        backgroundPane.add(loadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 350, -1));

        libraryName.setBackground(new java.awt.Color(0, 0, 255));
        libraryName.setFont(new java.awt.Font("Times New Roman", 1, 46)); // NOI18N
        libraryName.setForeground(new java.awt.Color(255, 255, 255));
        libraryName.setText("BUKU LIBRARY");
        backgroundPane.add(libraryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 400, 100));

        LoadingValue.setBackground(new java.awt.Color(255, 255, 255));
        LoadingValue.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(255, 255, 255));
        LoadingValue.setText("0%");
        backgroundPane.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buku/Icons/lib.gif"))); // NOI18N
        backgroundPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        getContentPane().add(backgroundPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splashPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splashPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splashPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splashPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         splashPage sp = new splashPage();
               sp.setVisible(true);
    
                try {
                    for( int i=0;i<=100;i++) {
                        Thread.sleep(100);
                        sp.LoadingValue.setText(i +"%");
                        
                        if(i==5){
                            sp.loadingLabel.setText("Turning on modules.");
                            }
                            if(i==8){
                            sp.loadingLabel.setText("Turning on modules..");
                            }
                            if(i==11){
                            sp.loadingLabel.setText("Turning on modules...");
                            }
                        
                        if(i==14){
                            sp.loadingLabel.setText("Loading modules.");
                        }
                        if(i==17){
                            sp.loadingLabel.setText("Loading modules..");
                        }
                        if(i==20){
                            sp.loadingLabel.setText("Loading modules...");
                        }
                        
                        
                        
                        
                        
                        if(i==23){
                            sp.loadingLabel.setText("Traitement.");
                        }
                        if(i==26){
                            sp.loadingLabel.setText("Traitement..");
                        }
                        if(i==29){
                            sp.loadingLabel.setText("Traitement...");
                        }
                        
                        
                        
                        
                        if(i==32){
                            sp.loadingLabel.setText("Connecting to Database.");
                        }
                        if(i==35){
                            sp.loadingLabel.setText("Connecting to Database..");
                        }
                        if(i==38){
                            sp.loadingLabel.setText("Connecting to Database...");
                        }
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        if(i==41){
                            sp.loadingLabel.setText("Connection successfully.");
                        }
                        if(i==44){
                            sp.loadingLabel.setText("Connection successfully..");
                        }
                        if(i==47){
                            sp.loadingLabel.setText("Connection successfully...");
                        }
                        
                        
                        
                        if(i==50){
                            sp.loadingLabel.setText("Lauching application.");
                        }
                        if(i==53){
                            sp.loadingLabel.setText("Lauching application..");
                        }
                        if(i==56){
                            sp.loadingLabel.setText("Lauching application...");
                        }
                        
                        
                        
                        
                        if(i==59){
                            sp.loadingLabel.setText("Processing.");
                        }
                        if(i==62){
                            sp.loadingLabel.setText("Processing..");
                        }
                        if(i==65){
                            sp.loadingLabel.setText("Processing...");
                        }
                        
                        
                        
                        if(i==68){
                            sp.loadingLabel.setText("Canceling.");
                        }
                        if(i==71){
                            sp.loadingLabel.setText("Canceling..");
                        }
                        if(i==74){
                            sp.loadingLabel.setText("Canceling...");
                        }
                        
                        
                        if(i==77){
                            sp.loadingLabel.setText("Pointing.");
                        }
                        if(i==80){
                            sp.loadingLabel.setText("Pointing..");
                        }
                        if(i==83){
                            sp.loadingLabel.setText("Pointing...");
                        }
                        
                        
                        
                        if(i==86){
                            sp.loadingLabel.setText("Editing.");
                        }
                        if(i==89){
                            sp.loadingLabel.setText("Editing..");
                        }
                        if(i==92){
                            sp.loadingLabel.setText("Editing...");
                        }
                        
                        
                        
                        if(i==95){
                            sp.loadingLabel.setText("Finaly.");
                        }
                        if(i==98){
                            sp.loadingLabel.setText("Finaly.");
                        }
                        
                        
                        
                        
                        
                        if(i==100) {
                            new adminPage().setVisible(true);
                            new splashPage().setVisible(false);
                            
                      
                           }
                        
                        sp.LoadingBar.setValue(i);
                        
                    }

                }catch(Exception e) {
               JOptionPane.showInputDialog( null,e);
        }
              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JPanel backgroundPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel libraryName;
    private javax.swing.JLabel loadingLabel;
    // End of variables declaration//GEN-END:variables
}
