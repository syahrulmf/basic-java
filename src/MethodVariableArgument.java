public class MethodVariableArgument {
  public static void main(String[] args) {

//    Tanpa Variable Argument
    int[] nilai = {80, 80, 80, 80};
    sayCongrats("Syahrul", nilai);

//    Dengan Variable Argument
    sayCongrats2("Budi", 80,90,80,75);
  }

//  Tanpa Variable Argument
  static void sayCongrats(String name, int[] values){
    var total = 0;
    for (var value: values){
      total += value;
    }

    var finalValue = total / values.length;

    if (finalValue >= 75){
      System.out.println("Selamat " + name + ", anda Lulus!");
    } else {
      System.out.println("Anda tidak lulus!");
    }
  }

//  Dengan Variable Argument
  static void sayCongrats2(String name, int... values){
    var total = 0;
    for (var value: values){
      total += value;
    }

    var finalValue = total / values.length;

    if (finalValue >= 75){
      System.out.println("Selamat " + name + ", anda Lulus!");
    } else {
      System.out.println("Anda tidak lulus!");
    }
  }
}
