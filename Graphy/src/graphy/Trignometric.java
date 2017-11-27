package graphy;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import javax.swing.*;
public class Trignometric extends JFrame{
    
    double y;    // Initailising global variable
    
    Trignometric(){
        super();
        initial();
        System.out.println("printing");
        this.setVisible(true);
    }
    
    private void initial(){
        
        jPanel2 = new JPanel();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jLabel2 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jLabel3 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new Color(50, 151, 31));
        setBounds(new Rectangle(0, 0, 0, 0));
        setMaximizedBounds(new Rectangle(0, 0, 2302, 1294));
        setMaximumSize(new Dimension(1220, 780));
        setMinimumSize(new Dimension(1220, 780));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        jPanel1.setBackground(new Color(0,0,0));

        jPanel2.setBackground(new Color(79, 126, 91));
        jPanel2.setMinimumSize(new Dimension(2302, 1294));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 101, -1, -1));

        jTextArea1.setBackground(new Color(79, 126, 91));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Times New Roman", 1, 24)); 
        jTextArea1.setRows(5);
        jTextArea1.setText("Graph of the form \n\t\n\ty = n*f(x)");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 101, 426, -1));

        jLabel1.setFont(new Font("Ubuntu Light", 1, 18)); 
        jLabel1.setText("Enter value of n");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 337, 150, 39));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 337, 184, 39));

        jLabel2.setFont(new Font("Ubuntu Light", 1, 18));
        jLabel2.setText("Choose f(x)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 508, -1, -1));

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "sin(x)", "cos(x)", "tan(x)", "log(x)" }));
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 500, 184, 38));

        jButton1.setFont(new Font("Times New Roman", 1, 24)); 
        jButton1.setText("Graph It");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 618, 221, 113));

        jLabel3.setFont(new Font("Ubuntu", 1, 36));
        jLabel3.setText("Trigonometric");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 23, 398, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 880));
        
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, 221, 113));

        jLabel3.setFont(new Font("Ubuntu", 1, 36));
        jLabel3.setText("Trigonometric");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 23, 398, 60));

        jButton3.setText("Clear");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jButton3ActionPerformed(e); 
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 780, 120, -1));

        jButton2.setText("Home");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 780, 130, -1));

        pack();
    }
    
    private void jComboBox1ActionPerformed(ActionEvent evt) {                                           
      
    }  
    
    private void jButton1ActionPerformed(ActionEvent evt) {                                         

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
                                          
    private void jButton2ActionPerformed(ActionEvent evt) {                                         
        dispose();
        new MainFrame();   
        
    }
                                          
    private void jButton3ActionPerformed(ActionEvent evt) {                                           
        Graphics2D gfx=(Graphics2D)jPanel1.getGraphics();
        gfx.fillRect(0,0,720,751);
        Color col=Color.black;
        gfx.setColor(col);
//        gfx.fillRect(249,0,2,500);
//        gfx.fillRect(0,249,500,2);
    }
    
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
                            
    
}

