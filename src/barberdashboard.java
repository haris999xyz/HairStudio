
//importing libraries
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

//service provider dashboard
public class barberdashboard extends javax.swing.JFrame {

    private static String id;
            
    public barberdashboard(String id) {
        initComponents();
        this.id=id;
        jLabel2.setText(id);
        //setting visibility of components
        jLabel3.setVisible(false);
        jTextField1.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jLabel4.setVisible(false);
        jTextField2.setVisible(false);
        jButton8.setVisible(false);
              
    }

    private void initComponents() {

    	//setting up layout
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hair Studio");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel2.setText("jLabel2");

        jButton2.setText("ADD Slots");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Slots");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Upcoming Booking");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter b_id");

        jButton5.setText("Approve");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Reject");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Complete Booking");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter b_id");

        jButton8.setText("Complete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(0, 173, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
       login l=new login();
        l.setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { //function redirect to addslot frame
        addslot ad=new addslot(jLabel2.getText());
        ad.setVisible(true);   
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//function view my slots
        jLabel3.setVisible(false);
        jTextField1.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jLabel4.setVisible(false);
        jTextField2.setVisible(false);
        jButton8.setVisible(false);
        
        String path="jdbc:mysql://localhost:3306/appointment";
            String user="root";
            String password ="";      
            try {
                String bid=jLabel2.getText();
                Connection conn=DriverManager.getConnection(path,user,password);
                Statement stmt=conn.createStatement();
                ResultSet rs=null;
                PreparedStatement p=null;
                String query ="SELECT time,date_added from addslots WHERE barber_id='"+bid+"'";
                p=conn.prepareStatement(query);
                rs=p.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                
            } catch (SQLException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) { //view upcoming booking
        jLabel3.setVisible(true);
        jTextField1.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jLabel4.setVisible(false);
        jTextField2.setVisible(false);
        jButton8.setVisible(false);
        
        String path="jdbc:mysql://localhost:3306/appointment";
            String user="root";
            String password ="";      
            try {
                String bid=jLabel2.getText();
                Connection conn=DriverManager.getConnection(path,user,password); //database connection
                Statement stmt=conn.createStatement();
                ResultSet rs=null;
                PreparedStatement p=null;
                String query ="SELECT booking.b_id,c_name,time,booking.date_added from booking,addslots,customers where addslots.s_id=booking.slot_id && customers.c_id=booking.customer_id && booking.barber_id='"+bid+"' && booking.appointment_status='0'";
                p=conn.prepareStatement(query);
                rs=p.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                
            } catch (SQLException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) { //approve customer booking
        
        String path="jdbc:mysql://localhost:3306/appointment";
            String user="root";
            String password ="";      
            try {
                Connection conn=DriverManager.getConnection(path,user,password);
                Statement stmt=conn.createStatement();
   
                String bid=jTextField1.getText();
                String query ="update booking set booking.appointment_status='1' where booking.b_id='"+bid+"'";
                stmt.executeUpdate(query);               
                JOptionPane.showMessageDialog(null,"Booking Approved");
               
                
            } catch (SQLException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) { //reject customer booking
        
        String path="jdbc:mysql://localhost:3306/appointment";
            String user="root";
            String password ="";      
            try {
                Connection conn=DriverManager.getConnection(path,user,password);
                Statement stmt=conn.createStatement();
   
                String bid=jTextField1.getText();
                String query ="delete from booking where booking.b_id='"+bid+"'";
                stmt.executeUpdate(query);               
                JOptionPane.showMessageDialog(null,"Booking Rejected");
               
                
            } catch (SQLException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        
        jLabel3.setVisible(false);
        jTextField1.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jLabel4.setVisible(true);
        jTextField2.setVisible(true);
        jButton8.setVisible(true);
        
        String path="jdbc:mysql://localhost:3306/appointment";
            String user="root";
            String password ="";      
            try {
                String bid=jLabel2.getText();
                Connection conn=DriverManager.getConnection(path,user,password);
                Statement stmt=conn.createStatement();
                ResultSet rs=null;
                PreparedStatement p=null;
                String query ="SELECT booking.b_id,c_name,time,booking.date_added from booking,addslots,customers where addslots.s_id=booking.slot_id && customers.c_id=booking.customer_id && booking.barber_id='"+bid+"' && booking.is_complete='0' && booking.appointment_status='1'";
                p=conn.prepareStatement(query);
                rs=p.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                
            } catch (SQLException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//complete customer booking
        
        String path="jdbc:mysql://localhost:3306/appointment";
            String user="root";
            String password ="";      
            try {
                Connection conn=DriverManager.getConnection(path,user,password);
                Statement stmt=conn.createStatement();
   
                String bid=jTextField2.getText();
                String query ="update booking set booking.is_complete='1' where booking.b_id='"+bid+"'";
                stmt.executeUpdate(query);               
                JOptionPane.showMessageDialog(null,"Booking Completed");
               
                
            } catch (SQLException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    public static void main(String args[]) {
        
    	index i=new index();
    	i.setVisible(true);
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration
}
