package studNewMethod;

import java.util.Arrays;
import java.util.List;

public class testLambda {

  public static void main(String[] args) {
    
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);    
    
    //Implementação tradicional
    
    for(Integer n: list) {
      System.out.println(n);
    }
    
    System.out.println("Com implementação Lambada");
    //Implementação com expressões lambda e StreamAPI
    list.forEach(n-> System.out.println(n));   

  }

}
