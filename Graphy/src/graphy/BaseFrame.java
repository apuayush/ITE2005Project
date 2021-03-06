package graphy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class BaseFrame extends JFrame {

    public BaseFrame() {
        super();
        initComponents();
        this.setVisible(true);
        
    }                         
    private void initComponents() {
        setMaximumSize(new Dimension(1920, 1080));
        setMinimumSize(new Dimension(1220, 780));

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton1 = new JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());  

        jPanel1.setBackground(new Color(97, 212, 195));

        jLabel1.setFont(new Font("Times New Roman", 1, 36)); 
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/graphy/graphy1.png")));
        jLabel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        jLabel2.setFont(new Font("Times New Roman", 1, 36)); 
        jLabel2.setText("Graphy");

        jTextArea1.setBackground(new Color(97, 212, 195));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Times New Roman", 1, 18)); 
        jTextArea1.setRows(5);
        jTextArea1.setText("Your assisstant in learning graphs better.\nGraphy is a platform to plot graphs and learn \nabout mathematical equations by plotting them.\n\n\nWhat could be better than application based \nlearning .\n\n(still in beta phase)");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new Color(97, 212, 195));
        jButton1.setText("Let's make a graph");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                .addGap(438, 438, 438))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));
    }
    public void switchToMainFrame(){
        MainFrame mf = new MainFrame();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {  
        switchToMainFrame();
    }


                    
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    
}