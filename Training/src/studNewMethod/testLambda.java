package studNewMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class testLambda {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

    // Implementação tradicional

    for (Integer n : list) {
      System.out.println(n);
    }

    System.out.println("Com implementação Lambda");
    // Implementação com expressões lambda e StreamAPI
    list.forEach(n -> System.out.println(n));

    List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("Joao", 32), new Pessoa("Antonio", 20),
        new Pessoa("Maria", 18), new Pessoa("Angela", 30));

    Stream<Pessoa> streamPessoas = listaPessoas.stream();

    Integer somaIdade = streamPessoas.filter(soma -> soma.getNome().startsWith("A"))
        .mapToInt(p -> p.getIdade()).sum();

  }

}
