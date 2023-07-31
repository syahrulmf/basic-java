public class ForEach {
  public static void main(String[] args) {

//    Jika Menggunakan For Loop
    System.out.println("FOR");
    String[] names = {
            "Syahrul", "Mubarok", "Nur", "Muhammad"
    };

    for (var i = 0; i < names.length; i++){
      System.out.println(names[i]);
    }

//    Jika Menggunakan ForeEach
    System.out.println("FOR EACH");
    for (var name: names) {
      System.out.println(name);
    }
  }
}
