package graphy;

import javax.swing.*;
import java.awt.*;

public class Operation {
    
    
}

class Trigonometric extends JFrame{
    
    double y;    // Initailising global variable
    
    public Trigonometric(){
        init();
        this.setVisible(true);
    }
    
    public void init(){
        
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(79, 126, 91));
        setMinimumSize(new java.awt.Dimension(2302, 1294));

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

        jTextArea1.setBackground(new java.awt.Color(79, 126, 91));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Graph of the form \n\t\n\ty = n*f(x)");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel1.setText("Enter value of n");

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel2.setText("Choose f(x)");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sin(x)", "cos(x)", "tan(x)", "log(x)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Graph It");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel3.setText("Trigonometric");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1)
                                            .addComponent(jComboBox1, 0, 184, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(927, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(442, Short.MAX_VALUE))
        );
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
      
    }  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        Graphics2D gfx=(Graphics2D)jPanel1.getGraphics();
        
        Color col=Color.white;
        gfx.setColor(col);  
        double n=Double.parseDouble(jTextField1.getText());
        gfx.fillRect(249,0,2,500);
        gfx.fillRect(0,249,500,2);

        int index = jComboBox1.getSelectedIndex();
        double a=250;
        double b=250;
        double i=250;

        while(i<500)
        { i=i+0.001;
            switch(index)
            {
                case 0: 
                    y=500-((25*n*Math.sin((i/25)-10))+250);
                    col=Color.cyan;
                    gfx.setColor(col);
                    break;
                case 1:
                    y=500-((25*n*Math.cos((i/25)-10))+250);
                    col=Color.yellow;
                    gfx.setColor(col);
                    break;
                case 2:
                    y=500-((25*n*Math.tan((i/25)-10))+250);
                    col=Color.green;
                    gfx.setColor(col);
                    break;
                    
                case 3:
                    y=500-((25*n*Math.log((i/25)-10))+250);
                    col=Color.RED;gfx.setColor(col);
                    break;
                default :
                    JOptionPane.showMessageDialog(null,"Pls Chose A Function");
            }
            
            gfx.draw(new Line2D.Double(a,b,i,y));
            a=i;
            b=y; }

        a=250;
        b=250;
        i=250;
        while(i>0)
           {
             i=i-0.001;
             switch(index)
            {
                case 0:
                    y=500-((25*n*Math.sin((i/25)-10))+250); col=Color.cyan;
                    gfx.setColor(col); 
                    break;
                case 1:
                    y=500-((25*n*Math.cos((i/25)-10))+250);
                    col=Color.yellow;gfx.setColor(col);
                    break;
                    
                case 2:
                     y=500-((25*n*Math.tan((i/25)-10))+250);
                    col=Color.green;gfx.setColor(col);
                    break;
                    
                case 3:
                     y=500-((25*n*Math.log((i/25)-10))+250);
                     col=Color.RED;gfx.setColor(col);
                     break;
                       
                default :
                    JOptionPane.showMessageDialog(null,"Pls Chose A Function");}    
            gfx.draw(new Line2D.Double(a,b,i,y));
            a=i;
            b=y;     }      
        col=Color.white;
        gfx.setColor(col);
        
        gfx.fillRect(249,0,2,500);
        gfx.fillRect(0,249,500,2);      
    }
                                          
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Graphics2D gfx=(Graphics2D)jPanel1.getGraphics();
        gfx.fillRect(0,0,500,500);
        Color col=Color.white;
        gfx.setColor(col);
        gfx.fillRect(249,0,2,500);
        gfx.fillRect(0,249,500,2);    
    }
                                          
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new Choser().setVisible(true);
        dispose();    
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
                            
    
}

class Exponent{
    
}

class Linear{
    
}