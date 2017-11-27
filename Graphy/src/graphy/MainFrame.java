package graphy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
    MainFrame(){
        super();
//        System.out.println("we are waiting for base design to come");
        initcomponents();
        this.setVisible(true);
    }
    
    private void initcomponents(){
        
        jLayeredPane1 = new JLayeredPane();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(50, 151, 31));
        setMaximumSize(new Dimension(1220, 780));
        setMinimumSize(new Dimension(1220, 780));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new ImageIcon("/home/apurvnit/Projects/ITE2005Project/Graphy/src/graphy/3.png")); // NOI18N
        jLabel1.setText("");

        jPanel1.setBackground(new Color(95, 107, 99));

        jButton1.setText("Trigonometric");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exponential");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Linear");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jLabel1, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, JLayeredPane.DEFAULT_LAYER);

        GroupLayout jLayeredPane1Layout = new GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 10, 1260, 790);

        pack();
    }
    
    private void jButton1ActionPerformed(ActionEvent evt) {                                         

        new Trignometric();
        dispose();          
    }                                     

    private void jButton2ActionPerformed(ActionEvent evt) {                                         

        new Exponential();
        dispose();          
    }                                        

    private void jButton3ActionPerformed(ActionEvent evt) {                                         
        new Linear();
        dispose();
    }  
    
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLayeredPane jLayeredPane1;
    private JPanel jPanel1;
                      
}

    
    
    
   