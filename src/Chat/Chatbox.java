/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Chat;

import java.awt.*;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 import javax.swing.*;

public class Chatbox extends JFrame{

    JLabel chat;
    JTextArea chatarea;
    JScrollPane chatasp,chatdispsp;
    JButton sendb,smileyb;
    JCheckBox mal;
    Toolkit toolkit;
    Dimension screensize;
    JPanel panel;

    int width, height;
    int w, h;
    static JTextArea chatdisp;
    static String hh="";


    Chatbox()
        {

        toolkit = Toolkit.getDefaultToolkit();
        screensize = toolkit.getScreenSize();

        width = screensize.width;
        height = screensize.height;
        w=width/2+width/6;
        h=height/3;
        setBounds(w,h,230,400 );





        chatarea=new JTextArea(60,20);

        //jtm=new JTextArea(60,20);
        chatasp =new JScrollPane(chatarea);
        chatdisp = new JTextArea();
        chatdispsp =new JScrollPane(chatdisp);
        chatasp.setBounds(20,250,150,60);
        //jspm.setBounds(20,220,150,50);
        sendb=new JButton("Send");
        smileyb=new JButton("Smiley");
        sendb.setBounds(92,310,80,20);
        smileyb.setBounds(10,310,80,20);
        mal=new JCheckBox("Malayalam Chat");
        mal.setBounds(10,20,200,40);
        chat=new JLabel("");
        chat.setBounds(20,200,150,40);
        chatdisp.setBackground(Color.YELLOW);
        chatdisp.setEnabled(false);


      KeyListener listener = new KeyListener()
      {
      public void keyPressed(KeyEvent e){}
      public void keyReleased(KeyEvent e){dumpInfo("Typed", e);}
      public void keyTyped(KeyEvent e){}
      private void dumpInfo(String s, KeyEvent e) {

         Font theFont = new Font("Akshar unicode", Font.PLAIN, 20);
         //String s1=chatarea.getText();
         String s1="\u0D0A\u0D0B";
        chatdisp.setFont(theFont);
        chatdisp.setText(s1);
            }
 };

      chatarea.addKeyListener(listener);
       //text1 = new JTextArea();
     chatdisp.setBounds(20,195,150,50);
        setLayout(null);
        JPanel panel=new JPanel();

        panel.setLayout(null);
        panel.setBounds(0, 0, width, height);
        (getContentPane()).add(panel);

        panel.add(chatasp);
        panel.add(sendb);
        panel.add(smileyb);
        panel.add(mal);
        panel.add(chat);
        panel.add(chatdisp);
       panel.add(chatdispsp);
        setDefaultCloseOperation(3);
        setVisible(true);

}

    public static void main(String args[])
    {
      Chatbox cht = new Chatbox();
   }

}
