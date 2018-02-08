/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Chat;

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
public class Test {
  public static void main(String argsS[]) throws XMPPException
  {
      ConnectionConfiguration connConfig = new ConnectionConfiguration("talk.google.com", 5222, "gmail.com");
XMPPConnection connection = new XMPPConnection(connConfig);
connection.connect();

// login with username and password
connection.login("sajadhaja90@gmail.com", "9995989914");

// set presence status info
Presence presence = new Presence(Presence.Type.available);
connection.sendPacket(presence);
new Messenger("");
// send a message to somebody
Message msg = new Message("shahana0001@gmail.com", Message.Type.chat);
msg.setBody("hello");
connection.sendPacket(msg);

// receive msg

//connection.addPacketListener(pl, null);

// wait for user to end program
//System.in.read();

// set presence status to unavailable
//presence = new Presence(Presence.Type.unavailable);
//connection.sendPacket(presence);
  }
}
