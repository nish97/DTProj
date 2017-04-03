
package empmanage;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;
public class TcpServer {
    public static void main(String args []) {
    ServerSocket ser;
    BufferedReader br;
    PrintWriter p;
    Socket Cs;
        try {
            ser = new ServerSocket(6000);
            System.out.println("Server started");
            while(true){
            Cs= ser.accept();
            System.out.println("cilent connected");
            br = new BufferedReader(new InputStreamReader(Cs.getInputStream()));
            p = new PrintWriter(Cs.getOutputStream(),true);
            Date d = new Date();
            p.println(d);
            }           
        } catch (IOException ex) {
            Logger.getLogger(TcpServer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("the exception is"+ ex);
        }
    
    }
    
}
