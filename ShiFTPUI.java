/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package my.numberaddition;
import it.sauronsoftware.ftp4j.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Frog
 */
public class ShiFTPUI extends javax.swing.JFrame {

    /**
     * Creates new form ShiFTPUI
     */
    public ShiFTPUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
        //Temporary Global Variables
        String username;
        String password;
        String host;
        String port;
        String[] files;
        
        //Initiate FTP Class
        FTPClient client = new FTPClient();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        list1 = new java.awt.List();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        hostboxlabel = new javax.swing.JLabel();
        unamelabel = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        portnolabel = new javax.swing.JLabel();
        hostbox = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        portno = new javax.swing.JTextField();
        connect = new javax.swing.JButton();
        coninfolabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        conninfo = new javax.swing.JTextPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        serverfiledisplay = new java.awt.List();
        localfiledisplay = new java.awt.List();
        localfilelabel = new javax.swing.JLabel();
        serverfilelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ShiFTP - Open Source FTP Client");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Droid Sans", 0, 10)); // NOI18N
        setForeground(java.awt.Color.white);
        setName("ShiFTP"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Connect"));

        hostboxlabel.setText("Host:");

        unamelabel.setText("Username:");

        passlabel.setText("Password:");

        portnolabel.setText("Port:");

        hostbox.setText("drwestfall.info");
        hostbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostboxActionPerformed(evt);
            }
        });

        uname.setText("project01");

        pass.setText("csci355");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        portno.setText("21");
        portno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portnoActionPerformed(evt);
            }
        });

        connect.setText("Connect");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(hostboxlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hostbox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(unamelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(portnolabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(portno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(connect)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostboxlabel)
                    .addComponent(unamelabel)
                    .addComponent(passlabel)
                    .addComponent(portnolabel)
                    .addComponent(hostbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connect))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        coninfolabel.setText("Connection Information:");

        jScrollPane2.setViewportView(conninfo);

        jSplitPane1.setDividerLocation(365);
        jSplitPane1.setVerifyInputWhenFocusTarget(false);

        serverfiledisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverfiledisplayActionPerformed(evt);
            }
        });
        jSplitPane1.setRightComponent(serverfiledisplay);

        localfiledisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localfiledisplayActionPerformed(evt);
            }
        });
        jSplitPane1.setLeftComponent(localfiledisplay);

        localfilelabel.setText("Local Files");

        serverfilelabel.setText("Server Files");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localfilelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(serverfilelabel))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(coninfolabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coninfolabel)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localfilelabel)
                    .addComponent(serverfilelabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void portnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portnoActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void hostboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostboxActionPerformed

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
       
        //When Connect Button is Clicked
        username = uname.getText();
        password = pass.getText();
        host = hostbox.getText();
        port = portno.getText();
        
       //Convert port into integer
       int portint = Integer.parseInt(port);
        
        //Had to surround with a try catch for the exceptions (I dont know how this works?)
        try {
            client.connect(host,portint);
        } catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException ex) {
            Logger.getLogger(ShiFTPUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            client.login(username,password);
        } catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException ex) {
            Logger.getLogger(ShiFTPUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            files = client.listNames();
        } catch (IllegalStateException | IOException | FTPIllegalReplyException | FTPException | FTPDataTransferException | FTPAbortedException | FTPListParseException ex) {
            Logger.getLogger(ShiFTPUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Loop through file array to grab names
        String filelist = "";
        for(int i =0;i<files.length;i++)
        {
         if (filelist.length() != 0)
         {
            serverfiledisplay.add(files[i]);
         }
         else
         {
             filelist = files[i];
         }
        }  
    }//GEN-LAST:event_connectActionPerformed

    private void localfiledisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localfiledisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localfiledisplayActionPerformed

    private void serverfiledisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverfiledisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverfiledisplayActionPerformed

    
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
            java.util.logging.Logger.getLogger(ShiFTPUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShiFTPUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShiFTPUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShiFTPUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShiFTPUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coninfolabel;
    private javax.swing.JButton connect;
    private javax.swing.JTextPane conninfo;
    private javax.swing.JTextField hostbox;
    private javax.swing.JLabel hostboxlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private java.awt.List list1;
    private java.awt.List localfiledisplay;
    private javax.swing.JLabel localfilelabel;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passlabel;
    private javax.swing.JTextField portno;
    private javax.swing.JLabel portnolabel;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.List serverfiledisplay;
    private javax.swing.JLabel serverfilelabel;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel unamelabel;
    // End of variables declaration//GEN-END:variables
}
