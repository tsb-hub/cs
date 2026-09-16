public class helloWorld {
  public static void main(String[] args){
    String greeting = "Hello World! I am Tigran.";
    repeatString(greeting, 6);
  }

  public static void repeatString(String s, int i){
    for (int x = 0; x < i; x++){
      System.out.println(s);
    }
  }
}
