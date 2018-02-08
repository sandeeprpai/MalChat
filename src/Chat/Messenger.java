/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

public class Messenger extends JFrame {

    JLabel nlb, plb, hlb,user;
    JTextField tf;
    JPasswordField tf1;
    JButton jb1, jb2;
    Toolkit toolkit;
    Dimension screensize;
    ImageIcon ic;
    int width, height;
    int w, h;

    Messenger(String s) {

        toolkit = Toolkit.getDefaultToolkit();
        screensize = toolkit.getScreenSize();

        width = screensize.width;
        height = screensize.height;
        w=width/5;
        h=height/5;
        setBounds(w,h,390,450);
        setLayout(null);
        setTitle(" MESSENGER ");

        jb1=new JButton("Logout");
        jb1.setBounds(w+141,h-120, 80, 30);
        jb2=new JButton("Add Contact");
        jb2.setBounds(w+20,h-120,105,30);
        user=new JLabel(s);
        user.setBounds(w-150,h-100,150,30);
        JPanel panel=new JPanel()
        {
         public void paintComponent(Graphics g)
            {

             g.setColor(Color.BLACK);
             g.setFont(null);
              g.drawString("WELCOME...",w-160,20);
              g.drawLine(w/7,100,w+200,100);
              g.drawLine(w/7,140,w+200,140);
              g.setColor(Color.BLACK);
             
              g.drawString("BUDDY LIST",w+10,h/2+59);
            

             setOpaque(false);
             super.paintComponent(g);
            }
        };
        panel.setLayout(null);
        panel.setBounds(0, 0, width, height);

        panel.add(jb1);
        panel.add(jb2);
        panel.add(user);

        (getContentPane()).add(panel);
//      jb1.addActionListener((ActionListener) this);

        jb1.addActionListener(null);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
    public static void main(String args[])
    {
     Messenger msg = new Messenger("hai");
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb1)  //logout
        {
        
        dispose();
        Main main = new Main();
        }
    }
  }
