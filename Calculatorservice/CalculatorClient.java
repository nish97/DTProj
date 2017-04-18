/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.*;
public class CalculatorClient {
            public static void main(String args[]) throws Exception {
            Calculator c = (Calculator) Naming.lookup("//127.0.0.1:1099/Calculatorservice");
            System.out.println("Addition : "+c.addition(10,5));
            System.out.println("Subtraction : "+c.subtraction(10,5));
            System.out.println("Multiplication :"+c.multiplication(10,5));                      
            System.out.println("Division : "+c. division(10,5));
            }
}
