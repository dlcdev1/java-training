package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrentyConverter;

public class ProgramConvertDollar {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("What is the dollar price?");
    double dollar = sc.nextDouble();
   
    System.out.println("Whow many dollar will be bought?");
    double amount = sc.nextDouble();
    
    double result = CurrentyConverter.convert(amount, dollar);
    
    System.out.println("Amount to be paid in reais = " + result);
    
    
   
    
    sc.close();

  }

}
