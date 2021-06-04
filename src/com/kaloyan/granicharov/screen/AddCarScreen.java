package com.kaloyan.granicharov.screen;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Objects;

public class AddCarScreen extends javax.swing.JFrame{

    public AddCarScreen() {
        initComponents();
    }
    void Clear(){
        carBrand.setText("");
        carModel.setText("");
        engine.setText("");
        mileage.setText("");
        breakHorsePower.setText("");
        topSpeed.setText("");
        color.setText("");
        serviceCharge.setText("");
        prise.setText("");
    }
    private void initComponents() {

        image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        carBrand = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        carModel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mileage = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        engine = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        breakHorsePower = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        transmissionType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        topSpeed = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        serviceCharge = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        prise = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fuelType = new javax.swing.JComboBox<>();

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        jLabel1.setText("<HTML><BODY><U>add car details </U></BOD Y></HTML>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(550, 0, 320, 50);


        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 24));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<HTML><BODY><U>Enter CAR Details</U></BODY></HTML>");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(575, 70, 270, 28);

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        jLabel3.setText("Car Brand :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(505, 130, 190, 23);

        jPanel1.add(carBrand);
        carBrand.setBounds(715, 130, 258, 30);

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.setText("Car Model :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(505, 170, 190, 23);

        jPanel1.add(carModel);
        carModel.setBounds(715, 170, 258, 30);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setOpaque(true);
        jLabel5.setText("Mileage (km/h) :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(505, 210, 190, 23);

        jPanel1.add(mileage);
        mileage.setBounds(715, 210, 258, 30);

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        jLabel6.setText("Engine (cc) :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(505, 250, 190, 23);

        jPanel1.add(engine);
        engine.setBounds(715, 250, 258, 30);

        jLabel7.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setOpaque(true);
        jLabel7.setText("BHP(Break HorsePower) :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(505, 290, 190, 23);

        jPanel1.add(breakHorsePower);
        breakHorsePower.setBounds(715, 290, 258, 30);

        jLabel8.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setOpaque(true);
        jLabel8.setText("Transmission :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(505, 330, 190, 23);

        transmissionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUTO", "MANUAL" }));
        jPanel1.add(transmissionType);
        transmissionType.setBounds(715, 330, 260, 30);

        jLabel9.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setOpaque(true);
        jLabel9.setText("Top Speed:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(505, 370, 190, 20);

        jPanel1.add(topSpeed);
        topSpeed.setBounds(715, 370, 260, 30);

        jLabel10.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        jLabel10.setText("Color  :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(505, 410, 190, 23);

        jPanel1.add(color);
        color.setBounds(715, 410, 258, 30);

        jLabel11.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setOpaque(true);
        jLabel11.setText("Yearly Service Charge :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(505, 460, 190, 23);

        jPanel1.add(serviceCharge);
        serviceCharge.setBounds(715, 450, 258, 30);

        jLabel12.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setOpaque(true);
        jLabel12.setText("Prise :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(505, 500, 190, 23);

        jPanel1.add(prise);
        prise.setBounds(715, 490, 258, 30);

        jLabel13.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setOpaque(true);
        jLabel13.setText("Fuel Type :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(505, 540, 190, 23);

        fuelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PETROL", "DIESEL", "CNG" }));
        jPanel1.add(fuelType);
        fuelType.setBounds(715, 530, 260, 30);


        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 580, 70, 35);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(670, 580, 70, 35);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(750, 580, 90, 35);

        image.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("image/addCar.png"))));
        image.setPreferredSize(new java.awt.Dimension(1448, 731));
        image.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                imageFocusGained(evt);
            }
        });
        jPanel1.add(image);
        image.setBounds(0, 0, 1450, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );

        pack();
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String cb=carBrand.getText().toUpperCase();
        String cm=carModel.getText().toUpperCase();
        String mile=mileage.getText().toUpperCase();
        String eng=engine.getText().toUpperCase();
        String bhp=breakHorsePower.getText().toUpperCase();
        String tranT=(String)transmissionType.getSelectedItem();
        String ts=topSpeed.getText().toUpperCase();
        String carColor=color.getText().toUpperCase();
        String sCharge=serviceCharge.getText().toUpperCase();
        String cost=prise.getText().toUpperCase();
        String fuel=(String)fuelType.getSelectedItem();
        if(cb.equals("")||cm.equals("")||eng.equals("")||mile.equals("")||bhp.equals("")
                ||ts.equals("")||carColor.equals("")||sCharge.equals("")||cost.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Fill All The Fields");
        }
        else try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/car_show_room_database","root","12345");
            Statement stmt=(Statement) con.createStatement();
            String sql1="insert into car_details values('"+cb+"','"+cm+"','"+mile+"','"+eng+"','"
                    +bhp+"','"+tranT+"','"+ts+"','"+carColor+"','"+sCharge+"','"+cost+"','"+fuel+"');";

            stmt.executeUpdate(sql1);
            JOptionPane.showMessageDialog(rootPane,"Details are uploaded successfully");

            stmt.close();
            con.close();

            Clear();
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e);
            System.exit(0);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Clear();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new ClientScreen().setVisible(true);
    }


    private void imageFocusGained(java.awt.event.FocusEvent evt) {
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
            java.util.logging.Logger.getLogger(AddCarScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCarScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCarScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCarScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCarScreen().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel image;


    private javax.swing.JTextField carBrand;
    private javax.swing.JTextField carModel;
    private javax.swing.JTextField mileage;
    private javax.swing.JTextField engine;
    private javax.swing.JTextField breakHorsePower;
    private javax.swing.JComboBox<String> transmissionType;
    private javax.swing.JTextField topSpeed;
    private javax.swing.JTextField color;
    private javax.swing.JTextField serviceCharge;
    private javax.swing.JTextField prise;
    private javax.swing.JComboBox<String> fuelType;

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;


}