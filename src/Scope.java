public class Scope {
  public static void main(String[] args) {
    sayHello("Syahrul");
    sayHello("");
  }

  static void sayHello(String name){
    String hello = "Hello " + name;

    if (!name.isBlank()){
      String hi = "Hi " + name;
      System.out.println(hi);
    }

    System.out.println(hello);
//    variable "hi" ini akan error, karena bukan berada pada scope nya
//    System.out.println(hi);
  }
}
