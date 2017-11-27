
package graphy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.Line2D;

public class Linear extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
                            
    
    int index=0;
    
    Linear(){
        super();
        init();
        this.setVisible(true);
    }
     private void init() {

        jPanel2 = new JPanel();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
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
        jTextArea1.setText("Graph of the form \n\t\n\ty = ax+by+c");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 101, 426, -1));

        jLabel1.setFont(new Font("Ubuntu Light", 1, 18)); 
        jLabel1.setText("Enter equation");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 337, 150, 39));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 337, 184, 39));
       
        jButton1.setFont(new Font("Times New Roman", 1, 24)); 
        jButton1.setText("Graph It");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 618, 221, 113));

        jLabel3.setFont(new Font("Ubuntu", 1, 36)); 
        jLabel3.setText("Exponential");
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
     
     private void jButton1ActionPerformed(ActionEvent evt) {  
        
       Graphics2D gfx=(Graphics2D)jPanel1.getGraphics();

        
        Color col=Color.white;
        
        gfx.setColor(col);
        
        gfx.fillRect(249,0,2,500);
        gfx.fillRect(0,249,500,2);
 
        String eqn = jTextField1.getText();
        double a,b,c;
        int L1, L2;
        
        try{
            a = Double.parseDouble(eqn.substring(0,eqn.indexOf("x")));
        }
        catch(Exception e){
            a = 1.0;
        }
        eqn = eqn.substring(eqn.indexOf("x")+2);
        
        try{
            b = Double.parseDouble(eqn.substring(0,eqn.indexOf("y")));
        }
        catch(Exception e){
            b = 1.0;
        }
        
        try{
            c = Double.parseDouble(eqn.substring(eqn.indexOf("y")+1));
        }
        catch(Exception e){
            c = 1.0;
        }
        index++;

        switch (index)
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
        
        gfx.setColor(Color.WHITE);

        gfx.fillRect(249,0,2,500);
        gfx.fillRect(0,249,500,2);  
        
        gfx.setColor(col);
        double i=-20*c/a,j = -20*c/b,k = Math.sqrt((i*i+j*j));
        double x = 250 + (-20)*c/a;
        double y = 250 - (-20)*c/b;
        double x1=x+200*(i/k);
        double y1=250+200*(j/k);
        gfx.draw(new Line2D.Double(250,y,x,250));
        gfx.draw(new Line2D.Double(x1,y1,x,250));
        double x2=250-200*(i/k);
        double y2=y-200*(j/k);
         gfx.draw(new Line2D.Double(x2,y2,250,y));
        
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
    }                      
}
