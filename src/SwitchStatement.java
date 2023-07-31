public class SwitchStatement {
  public static void main(String[] args) {

    var nilai = "F";

    switch (nilai) {
      case "A":
        System.out.println("Wow, nilai anda bagus!");
        break;
      case "B":
      case "C":
        System.out.println("Nilai anda cukup!");
        break;
      case "D":
        System.out.println("Nilai anda kurang!");
        break;
      default:
        System.out.println("Mungkin anda salah jurusan!");
    }

//    Switch Lambda
//    switch (nilai) {
//      case "A" -> System.out.println("Wow, Anda lulus dengan Baik!");
//      case "B", "C" -> System.out.println("Wow, Anda lulus dengan Cukup Baik!");
//      case "D" -> System.out.println("Anda tidak lulus!");
//      default -> {
//        System.out.println("Mungkin anda salah jurusan!");
//      }
//    }

//    Switch menggunakan Yield
//    String ucapan;
//    ucapan =  switch (nilai) {
//      case "A":
//        yield System.out.println("Wow, Anda lulus dengan Baik!");
//      case "B", "C":
//        yield System.out.println("Wow, Anda lulus dengan Cukup Baik!");
//      case "D":
//        yield System.out.println("Anda tidak lulus!");
//      default :
//        yield System.out.println("Mungkin anda salah jurusan!");
//    };

  }
}
