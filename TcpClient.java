/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmanage;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TcpClient {
    public static void main(String args []) {
            Socket Cs;
            BufferedReader br;
            PrintWriter p ;
            String cdate;
        try {
            Cs = new Socket(InetAddress.getLocalHost(),6000);
            while(true){
            p = new PrintWriter(Cs.getOutputStream(),true);
            br = new BufferedReader(new InputStreamReader(Cs.getInputStream()));
            cdate = br.readLine();
            System.out.println("the Server date/Time is"+ cdate);
            p.println(InetAddress.getLocalHost());
            }
        } catch (IOException ex) {
            Logger.getLogger(TcpClient.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("the Exception is"+ex);
        }
    }
}
