/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.assignment1;

import jdk.nashorn.internal.codegen.CompilerConstants;
import java.lang.Math;
import java.util.*;

/**
 *
 * Trevor Ngcobo
 * 220477019
 */
public class TrevorClass 
{
    String name;
    double noOfYears;
    double interestRate;
    int presentValue;
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getPresentValue() {
        return presentValue;
    }

    public void setPresentValue(int presentValue) {
        this.presentValue = presentValue;
    }

    @Override
    public String toString() {
        return "TrevorClass{" + "name=" + name + ", noOfYears=" + noOfYears + ", interestRate=" + interestRate + ", presentValue=" + presentValue + '}';
    }
    
    public int CalculatefutureValue()
    {        
        
    double futureValue = 0;    
    futureValue = this.presentValue * Math.pow((1.0+this.interestRate/100),this.noOfYears);    //FV = PV(1 + rate)^n
    return (int) futureValue;
    }
    
    public void displayResults()
    {
    System.out.println("The details are: ");
    System.out.println("name:" + this.getName());
    System.out.println("Interest rate:" + this.getInterestRate() + "%");
    System.out.println("The duration of investment is: " + getNoOfYears() + " years");
    System.out.println("The invested Amount:" + " R " + getPresentValue());
    System.out.println("=====================================");
    System.out.println("Your future amount will be:" +" R "+ CalculatefutureValue());
    }
    
    
    public static void main(String[]args)
    {
    TrevorClass firstCustomer = new TrevorClass();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter investor name: ");
    String name = sc.next();    
    firstCustomer.setName(name);
    
    System.out.println("Please enter the interest rate(%): ");
    double interest = sc.nextDouble();
    firstCustomer.setInterestRate((int) interest);
    
    System.out.println("Please enter the duration of investment(years): ");
    double durationYears = sc.nextDouble();
    firstCustomer.setNoOfYears((int) durationYears);
    
    System.out.println("Please enter the amount to be invested: ");
    double presentAmt = sc.nextDouble();
    firstCustomer.setPresentValue((int) presentAmt);
    
    firstCustomer.CalculatefutureValue();
    firstCustomer.displayResults();
    
    
    
    
    }
    
    

}
