/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
     protected CalculatorImpl() throws RemoteException 
    {
        super();
    }
     public long addition(long a, long b) throws RemoteException 
    {
        return a+b;
    }
     
    public long subtraction(long a, long b) throws RemoteException 
    {
        return a-b;
    }
        public long multiplication(long a, long b) throws RemoteException 
    {
        return a*b;
    }
    
      public long division(long a, long b) throws RemoteException 
    {
        return a/b;
    }
}
