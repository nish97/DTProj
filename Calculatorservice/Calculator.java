/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;;
public interface Calculator extends Remote{
    public long addition(long a,long b) throws RemoteException;
    public long subtraction(long a,long b) throws RemoteException;
    public long multiplication(long a,long b) throws RemoteException;
    public long division(long a,long b) throws RemoteException;

}
