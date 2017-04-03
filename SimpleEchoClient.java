import java.net.*;
import java.io.*;
import java.util.*;
public class SimpleEchoClient {    
    public static void main(String args[]) {        
        System.out.println("Simple Echo Client");
         try {        
             System.out.println("Waiting for connection.....");        
             InetAddress localAddress = InetAddress.getLocalHost();
             Socket clientSocket = new Socket(localAddress, 6000);                    
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);              
             BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
             {                   
             System.out.println("Connected to server"); 
             System.out.println("type'quit'to exit");
             Scanner scanner = new Scanner(System.in);
              while (true) {        
                  System.out.print("Enter text: ");        
                  String inputLine = scanner.nextLine();        
                  if ("quit".equalsIgnoreCase(inputLine)) {            
                      break;        
                    }        
                    out.println(inputLine);        
                    String response = br.readLine();        
                    System.out.println("Server response: " + response);    
                } 
              }   
            } 
            catch (IOException ex) {       
                     
            }
      }
 }
