package buildSring;

public class buildString {

  public static void main(String[] args) {
    StringBuilder names = new StringBuilder();
        
    names.append("David").append(" Leandro").append(", ").append("and ").append("Alessandra");
    
    System.out.println(names.toString());
    
    String texto = "name-ops-name-ops-name-ops";
    
    int indece = texto.indexOf("-");
    
    System.out.println(indece);
    
    
  }

}
