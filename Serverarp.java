/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmanage;
import java.io.*;
import java.util.*;
import java.net.*;
import java.util.logging.*;
public class Serverarp {
    public static void main(String args []){
    ServerSocket ser;
    Socket Cs;
    BufferedReader br;
    PrintWriter p;
    int i;
        try {
            ser = new  ServerSocket(6000);
            System.out.println("The Server is Started");
            while(true){
            Cs = ser.accept();
            br = new BufferedReader(new InputStreamReader(Cs.getInputStream()));
            p = new PrintWriter(Cs.getOutputStream(),true);
            String d = br.readLine();
            String ip [] ={"127.0.0.1","123.145.233.5"};
            String mac[] = {"AN:VB:RE:RT:WQ","OP:HJ:SOG:SF:UI"};
            for(i=0;i<=2;i++){
              if(d.equals(ip[i])){
                 p.println(mac[i]+"\n");
              }
              else 
                  break;
            }
            ser.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Serverarp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
