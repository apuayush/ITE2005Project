package graphy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.Line2D;

public class Exponential extends JFrame{
    
    private javax.swing.JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
                            
    
    int x;
    
    Exponential(){
        super();
        init();
        this.setVisible(true);
    }
     private void init() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(50, 151, 31));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 2302, 1294));
        setMaximumSize(new java.awt.Dimension(1220, 780));
        setMinimumSize(new java.awt.Dimension(1220, 780));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        jPanel1.setBackground(new Color(0,0,0));

        jPanel2.setBackground(new java.awt.Color(79, 126, 91));
        jPanel2.setMinimumSize(new java.awt.Dimension(2302, 1294));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 101, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(79, 126, 91));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Graph of the form \n\t\n\ty = X^n");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 101, 426, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel1.setText("Enter value of n");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 337, 150, 39));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 337, 184, 39));
       
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Graph It");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 618, 221, 113));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setText("Exponential");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 23, 398, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 880));
        
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, 221, 113));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setText("Trigonometric");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 23, 398, 60));

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton3ActionPerformed(e); //To change body of generated methods, choose Tools | Templates.
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 780, 120, -1));

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 780, 130, -1));

        pack();
    }                       

    private void jButton1ActionPerformed(ActionEvent evt) {  
        
       Graphics2D gfx=(Graphics2D)jPanel1.getGraphics();

        
        Color col=Color.white;
        gfx.setColor(col);
        double n=Double.parseDouble(jTextField1.getText());

        x=x+1;
        gfx.fillRect(249,0,2,500);
        gfx.fillRect(0,249,500,2);

        double a=250;
        double b=250;
        double i=250;

        switch (x)
        { 
            case 1: 
                col=Color.cyan;
                break;
            case 2: 
                col=Color.green;
                break;
            case 3:
                col=Color.yellow;
                break;
            case 4: 
                col=Color.red;
                break;
            
            case 5: 
                col=Color.blue;
                break;
            
            case 6: 
                col=Color.MAGENTA;
                break;
                                
            default: col=Color.white; 
        }
        
        gfx.setColor(col);

        while(i<500)
        {
            i=i+0.001;
            double y=500-(50*n*Math.pow(((i/50)-5),n)+250);
            gfx.draw(new Line2D.Double(a,b,i,y));
            a=i;
            b=y;    
        }
        

        a=250;
        b=250;
        i=250;
        

        while(i>0)
        {   
            i=i-0.001;
            double y=500-(50*n*Math.pow(((i/50)-5),n)+250);
            gfx.draw(new Line2D.Double(a,b,i,y));
            a=i;
            b=y;    
        }    
    }
                                          
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        dispose();
        new MainFrame();
    }
        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Graphics2D gfx=(Graphics2D)jPanel1.getGraphics();
        gfx.fillRect(0,0,720,751);
        Color col=Color.black;
        gfx.setColor(col);
    }                                                              
                                       
}
   
