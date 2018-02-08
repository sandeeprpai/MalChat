/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Chat;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.rapplogic.xbee.api.PacketListener;
import com.rapplogic.xbee.api.XBeeResponse;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.Presence;

/**
 *
 * @author Admin
 */
public class Login {
  
    Login(String user,String pass) throws XMPPException
  {
ConnectionConfiguration connConfig = new ConnectionConfiguration("talk.google.com", 5222, "gmail.com");
XMPPConnection connection = new XMPPConnection(connConfig);
connection.connect();

// login with username and password
connection.login(user+"@gmail.com",pass);

// set presence status info
Presence presence = new Presence(Presence.Type.available);
connection.sendPacket(presence);

// send a message to somebody
Message msg = new Message("shahana0001@gmail.com", Message.Type.chat);
msg.setBody("hello");
connection.sendPacket(msg);
Messenger messenger = new Messenger("");
// receive msg

//connection.addPacketListener(pl, null);

// wait for user to end program
//System.in.read();

// set presence status to unavailable
//presence = new Presence(Presence.Type.unavailable);
//connection.sendPacket(presence);
  }
    public static void main(String args[]) throws XMPPException
    {
    //    Login log = new Login();
    }
}

