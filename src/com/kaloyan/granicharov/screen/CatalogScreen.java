package com.kaloyan.granicharov.screen;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CatalogScreen extends javax.swing.JFrame{

    public CatalogScreen() {
        initComponents();
    }

    private void initComponents() {

        jPanel = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jComboBox = new JComboBox<>();
        jScrollPane = new JScrollPane();
        jTable = new JTable();
        image = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel.setLayout(null);

        jComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Select Brand","AUDI", "BMW", "Mercedes", "VW" }));
        jComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel.add(jComboBox);
        jComboBox.setBounds(0, 0, 510, 50);

        jPanel.add(jScrollPane);
        jScrollPane.setBounds(10, 540, 1350, 150);


        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel.add(jButton1);
        jButton1.setBounds(510, 0, 440, 50);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel.add(jButton2);
        jButton2.setBounds(950, 0, 410, 50);

        image.setIcon(new ImageIcon(getClass().getResource("image/catalog.png")));
        jPanel.add(image);
        image.setBounds(0, 0, 1450, 730);

        jTable.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Car Model", "Mileage", "Engine", "BHP", "Transmission", "Top Speed", "Color", "Yearly Service Charge", "Prise", "Fuel Type"
                }
        ));
        jTable.setIntercellSpacing(new java.awt.Dimension(3, 3));
        jScrollPane.setViewportView(jTable);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel, GroupLayout.PREFERRED_SIZE, 1448, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel, GroupLayout.PREFERRED_SIZE, 731, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {

        DefaultTableModel model=(DefaultTableModel)jTable.getModel();

        model.setRowCount(0);
        int ind=jComboBox.getSelectedIndex();


        switch(ind){
            case 1:image.setIcon(new ImageIcon(getClass().getResource("image/audi.png")));
                break;
            case 2:image.setIcon(new ImageIcon(getClass().getResource("image/bmw.png")));
                break;
            case 3:image.setIcon(new ImageIcon(getClass().getResource("image/mercedes.png")));
                break;
            case 4: image.setIcon(new ImageIcon(getClass().getResource("image/vw.png")));
                break;
        }

        try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/carShowRoomDatabase","root","12345");
            Statement stmt=(Statement) con.createStatement();

            String carBrand=(String)jComboBox.getSelectedItem();

            String sql1="select * from cardetails where car_Brand='"+carBrand+"';";
            ResultSet rs1=stmt.executeQuery(sql1);
            while(rs1.next())
            {

                String carModel=rs1.getString(2);
                String mileage=rs1.getString(3);
                String engine=rs1.getString(4);
                String bhp=rs1.getString(5);
                String transmission=rs1.getString(6);
                String topSpeed=rs1.getString(7);
                String color=rs1.getString(8);
                String yCharge=rs1.getString(9);
                String prise=rs1.getString(10);
                String fuel=rs1.getString(11);

                model.addRow(new Object[]{carModel,mileage,engine,bhp,transmission,topSpeed,color,yCharge,prise,fuel});
            }

            rs1.close();
            stmt.close();
            con.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.exit(0);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        DefaultTableModel model=(DefaultTableModel)jTable.getModel();
        model.setRowCount(0);
        image.setIcon(new ImageIcon(getClass().getResource("image/catalog.png")));
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new ClientScreen().setVisible(true);
    }

    public static void main(String args[]) {

        CatalogScreen screen = new CatalogScreen();
        screen.setVisible(true);
    }

    private JLabel image;
    private JButton jButton1;
    private JButton jButton2;
    private JComboBox<String> jComboBox;
    private JPanel jPanel;
    private JScrollPane jScrollPane;
    private JTable jTable;
}

