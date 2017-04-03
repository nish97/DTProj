/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmanage;

import  java.net.*;
import java.util.*;
import java.io.*;;
import java.util.logging.*;
public class Clientarp {
    public static void main(String args[]) {
       Socket Cs;
       PrintWriter p;
       BufferedReader br ;
        try {
            Cs = new Socket("127.0.0.1",6000);
            while(true){
            p = new PrintWriter(Cs.getOutputStream(),true);
            br = new BufferedReader(new InputStreamReader(Cs.getInputStream()));
            p.println("127.0.0.1");
            String d = br.readLine();
            System.out.println("the Physical Address is "+ d);
            Cs.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Clientarp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
