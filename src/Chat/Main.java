/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Chat;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.*;
import org.jivesoftware.smack.XMPPException;

public class Main extends JFrame implements ActionListener
{
     //new pic();
     JLabel nlb,plb,hlb;
     JTextField tf;
     JPasswordField tf1;
     JButton jb1,jb2;
    JCheckBox newuser;
    Toolkit toolkit;
    Dimension screensize;
    ImageIcon ic;
    int width,height;
    int w,h;

    Main()
    {

        toolkit=Toolkit.getDefaultToolkit();
        screensize=toolkit.getScreenSize();
        width=screensize.width;
        height=screensize.height;

        setBounds(width/3,height/3,300,250);
        //setSize(1000,2);
        setLayout(null);
        setTitle("            CHATT  ");
        hlb=new JLabel(" ");
        nlb=new JLabel("USERNAME");
        plb=new JLabel("PASSWORD");
        tf=new JTextField("");
        tf1=new JPasswordField("");
        jb1=new JButton("Login");
        jb2=new JButton("Cancel");

        nlb.setBounds(w+10,h+40,150,30);
        hlb.setBounds(w+150,h,150,30);
        tf.setBounds(w+120, h+40, 150, 30);
        plb.setBounds(w+10, h+80, 150, 30);
        tf1.setBounds(w+120,h+80, 150, 30);
        jb1.setBounds(w+40,h+150, 100, 30);
        jb2.setBounds(w+170,h+150, 100, 30);

      ic=new ImageIcon("C:\\Documents and Settings\\All Users\\Documents\\My Pictures\\Sample Pictures\\Sunset.jpg");
         JPanel panel=new JPanel()
         {
         public void paintComponent(Graphics g)
       {

         g.drawImage(ic.getImage(),0,0,300,250,null);

         setOpaque(false);
        super.paintComponent(g);
       }
         };
         panel.setLayout(null);
        panel.setBounds(0, 0, width, height);

        panel.add(hlb);
        panel.add(jb1);
        panel.add(jb2);
        panel.add(plb);
        panel.add(tf1);
        panel.add(nlb);
        panel.add(tf);

(getContentPane()).add(panel);



jb1.addActionListener(this);
jb2.addActionListener(this);


setDefaultCloseOperation(3);
        setVisible(true);

    }
    public static void main(String arg[])
     {
      Main d =new Main();
     }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1)  //login
        {
            String username=tf.getText();
            String passwd=tf1.getText();
            if(username==null || username.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "User name empty");
            }
            else if(passwd==null || passwd.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(null, "Password empty");
            }
            else
            {
           dispose();
           try {
                    Login login = new Login(username, passwd);
               }
           catch (XMPPException ex) {

             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
              }
            }
        }
        if(e.getSource()==jb2)
        {
            System.out.println(" cancelled.....");
            tf.setText("");
            tf1.setText("");

        }
    }
}
