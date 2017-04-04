/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmanage;
import java.io.*;
import java.util.*;
public class FCFS {
    public static void main(String args []) {
     int totwt=0,n,i,WaitingTime[],ArrivalTime[],BurstTime[],Process[],TotalWaitingTime[],TurnAroundTime[];
     int avgwt,avgtat,tottat=0;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the no.of processess");
     n = s.nextInt();
     WaitingTime = new int [n+1];
     BurstTime = new int [n+1];
     TurnAroundTime = new int [n+1];
     TotalWaitingTime = new int [n+1];
     Process = new int [n+1];
     ArrivalTime = new int [n+1];
     System.out.println("Enter the Burst Time :");
     for(i=1;i<=n;i++){
       System.out.println("Enter the Burst time for "+i+" process:");
       BurstTime[i] = s.nextInt();
       Process [i] = i;
     }
     System.out.println("Is Arrival Time availale(yes/no):");
     String d = s.next();
     
         for(i=1;i<=n;i++){
         if(d.equalsIgnoreCase("yes")){
         System.out.println("Enter the Arrival time of "+i+" process: ");
         ArrivalTime[i] = s.nextInt();
       }
       else
             ArrivalTime[i]=0;
     }
     System.out.println("   PROCESS | ARRIVALTIME | BURSTTIME | WAITINGTIME | TURNAROUNDTIME | TOTALWAITINGTIME");
     for(i=1;i<=n;i++){
         if(i==1)
         WaitingTime[i] = 0;
         else {
        WaitingTime[i] = BurstTime[i-1]+WaitingTime[i-1]+ArrivalTime[i-1]-ArrivalTime[i];
        }
        totwt += BurstTime[i];
        TotalWaitingTime[i] = BurstTime[i] + WaitingTime[i];
        TurnAroundTime[i] = totwt-ArrivalTime[i];
        System.out.println("\t"+Process[i]+" \t"+ArrivalTime[i]+"\t\t"+BurstTime[i]+" \t\t"+WaitingTime[i]+" \t\t"+TurnAroundTime[i]+" \t\t"+TotalWaitingTime[i] );
        tottat += TurnAroundTime[i];
     }
     avgwt = totwt/n;
     avgtat = tottat/n;
     System.out.println("The Average WaitingTime:" + avgwt );
     System.out.println("The Average WaitingTime:" + avgtat );
    }
    
}
