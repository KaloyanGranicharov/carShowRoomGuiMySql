package com.kaloyan.granicharov.screen;

import javax.swing.*;

public class ClientScreen extends javax.swing.JFrame {

    public ClientScreen() {
        initComponents();
}

    private void initComponents() {


        jPanel = new javax.swing.JPanel();
        Welcome1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(0, 0, 0));
        jPanel.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel.setLayout(null);

        Welcome1.setFont(new java.awt.Font("Algerian", 0, 30));
        Welcome1.setForeground(new java.awt.Color(0, 0, 255));
        Welcome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome1.setText("Welcome to Kaloyan`s car showroom.");
        Welcome1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel.add(Welcome1);
        Welcome1.setBounds(430, 10, 650, 100);



        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30));
        jLabel1.setForeground(new java.awt.Color(250, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Catalog");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30));
        jLabel2.setForeground(new java.awt.Color(250, 0, 0));
        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel2.setText("Add Car ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt1) {
                jLabel2MouseClicked(evt1);
            }
        });

        jPanel.add(jLabel1);
        jLabel1.setBounds(300, 100, 300, 50);

        jPanel.add(jLabel2);
        jLabel2.setBounds(830, 100, 300, 50);



        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("image/intro.png")));
        image.setPreferredSize(new java.awt.Dimension(1920, 1080));
        image.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                imageFocusGained(evt);
            }
        });
        jPanel.add(image);
        image.setBounds(0, 0, 1600, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }





    private void imageFocusGained(java.awt.event.FocusEvent evt) {
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        new CatalogScreen().setVisible(true);
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt1) {
        this.setVisible(false);
          new AddCarScreen().setVisible(true);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientScreen().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel Welcome1;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
}
