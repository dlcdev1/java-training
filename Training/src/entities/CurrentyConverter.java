package entities;

public class CurrentyConverter {


  public static double iof = 0.06;

  public static double convert(double amount, double dollar) {
    return dollar * amount * (1 + iof);

  }

}
