package indexOff;

public class IndexofExemples {

  public static void main(String[] args) {
    
    String str1 = new String("This is a BeginnersBook tutorial");
    String myStr = "Hello planet earth, you are a great planet.";
    
    /*String str2 = new String("Beginners");
    String str3 = new String("Book");
    String str4 = new String("Books");*/
    
    System.out.println("Index of B in str1: "+str1.indexOf('i'));
    System.out.println(myStr.indexOf("planet"));
    /*System.out.println("Index of B in str1 after 15th char:"+str1.indexOf('B', 15));
    System.out.println("Index of B in str1 after 30th char:"+str1.indexOf('B', 30));
    System.out.println("Index of string str2 in str1:"+str1.indexOf(str2));
    System.out.println("Index of str2 after 15th char"+str1.indexOf(str2, 15));
    System.out.println("Index of string str3:"+str1.indexOf(str3));
    System.out.println("Index of string str4"+str1.indexOf(str4));
    System.out.println("Index of hardcoded string:"+str1.indexOf("is"));
    System.out.println("Index of hardcoded string after 4th char:"+str1.indexOf("is", 4));  */
    

  }

}
