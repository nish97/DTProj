/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Naming;
public class CalculatorServer {
    CalculatorServer()throws Exception
    {
            Calculator c = new CalculatorImpl();
            Naming.rebind("rmi://localhost:1099/Calculatorservice", c);
    }
    public static void main(String[] args) throws Exception 
    {
        new CalculatorServer();
    }
}
