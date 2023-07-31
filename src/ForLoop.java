public class ForLoop {
  public static void main(String[] args) {

    for (var counter = 1; counter <= 10; counter++){
      System.out.println("Perulangan " + counter);
    }

    String[] names = {
            "Syahrul", "Mubarok", "Nur", "Muhammad"
    };

    for (var i = 0; i < names.length; i++){
      System.out.println(names[i]);
    }

  }
}
